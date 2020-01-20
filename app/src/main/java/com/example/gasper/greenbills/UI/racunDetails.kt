package com.example.gasper.greenbills.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gasper.greenbills.R
import com.example.gasper.greenbills.db.*
import com.example.gasper.greenbils.db.Izdelek
import kotlinx.android.synthetic.main.activity_izdelek_row.*
import kotlinx.android.synthetic.main.activity_racun_details.*
import kotlinx.android.synthetic.main.fragment_list_izdelek.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


class racunDetails : AppCompatActivity() {

    var listIzdelki=ArrayList<Izdelek>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_racun_details)
        var id = Integer.parseInt(  intent.getStringExtra("id"))
        trgovina.text=intent.getStringExtra("trgovina")
        datum.text= intent.getStringExtra("datum")
        val izdelekDao = RacunDB.getInstance(application)?.izdelekDao()

        if (izdelekDao != null) {
            getData(izdelekDao,id)
        }

        var st = 0
            for(iz in listIzdelki){
                st += Integer.parseInt(iz.cena)*Integer.parseInt(iz.kolicina)
            }
            cena.text="Skupna cena: "+st.toString()+"€"
        listIzdelek.layoutManager = LinearLayoutManager(this)
        listIzdelek.adapter=AdapterIzdelek(listIzdelki)

    }

    fun getData(izdelekDao: IzdelekDAO,id:Int) = runBlocking {
        launch(Dispatchers.IO) {
            listIzdelki = izdelekDao?.getSpecial(id) as ArrayList<Izdelek>
        }
    }
}
