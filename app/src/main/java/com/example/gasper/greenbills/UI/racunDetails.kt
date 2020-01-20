package com.example.gasper.greenbills.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gasper.greenbills.R
import com.example.gasper.greenbils.db.Izdelek
import kotlinx.android.synthetic.main.activity_izdelek_row.*
import kotlinx.android.synthetic.main.activity_racun_details.*
import kotlinx.android.synthetic.main.fragment_list_izdelek.*







class racunDetails : AppCompatActivity() {

    var listIzdelki=ArrayList<Izdelek>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_racun_details)
        //var id =   intent.getStringExtra("id")
        trgovina.text=intent.getStringExtra("trgovina")
        datum.text= intent.getStringExtra("datum")
        var i1= Izdelek(0,"IZDELEK1","5","2",0)
        var i2= Izdelek(1,"IZDELEK2","8","20",0)
        var i3= Izdelek(2,"IZDELEK3","5","15",0)
        listIzdelki.add(i1)
        listIzdelki.add(i2)
        listIzdelki.add(i3)

        var st = 0
            for(iz in listIzdelki){
                st += Integer.parseInt(iz.cena)*Integer.parseInt(iz.kolicina)
            }
            cena.text="Skupna cena: "+st.toString()+"€"
        listIzdelek.layoutManager = LinearLayoutManager(this)
        listIzdelek.adapter=AdapterIzdelek(listIzdelki)

    }


}
