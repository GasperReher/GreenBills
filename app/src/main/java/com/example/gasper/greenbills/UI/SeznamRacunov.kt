package com.example.gasper.greenbills.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gasper.greenbills.R
import com.example.gasper.greenbills.db.Racun
import kotlinx.android.synthetic.main.activity_seznam_racunov.*
import kotlinx.android.synthetic.main.fragment_list_racun.*

class SeznamRacunov : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seznam_racunov)

        listRacun.layoutManager = LinearLayoutManager(this)
        var r1=Racun(0,"04.08.2020","Trgovina1")
        var r2=Racun(1,"04.08.2020","Trgovina2")
        var r3=Racun(2,"04.08.2020","Trgovina3")
        var r4=Racun(3,"04.08.2020","Trgovina4")
        var listRac = ArrayList<Racun>()
        listRac.add(r1)
        listRac.add(r2)
        listRac.add(r3)
        listRac.add(r4)

        listRacun.adapter = Adapter(listRac)
    }
}
