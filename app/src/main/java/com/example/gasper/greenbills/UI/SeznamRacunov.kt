package com.example.gasper.greenbills.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gasper.greenbills.R
import com.example.gasper.greenbills.db.Racun
import com.example.gasper.greenbills.db.RacunDAO
import com.example.gasper.greenbills.db.RacunDB
import kotlinx.android.synthetic.main.activity_seznam_racunov.*
import kotlinx.android.synthetic.main.fragment_list_racun.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.concurrent.Executors

class SeznamRacunov : AppCompatActivity() {

    var listRac = ArrayList<Racun>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seznam_racunov)


        val racunDao = RacunDB.getInstance(application)?.racunDao()
        val executorService = Executors.newSingleThreadExecutor()

        /*
        SAMO ZA TEST
        */
        /*  var r1=Racun(0,"04.08.2020","Trgovina1")
          var r2=Racun(1,"04.08.2020","Trgovina2")
          var r3=Racun(2,"04.08.2020","Trgovina3")
          var r4=Racun(3,"04.08.2020","Trgovina4")
          executorService.execute { racunDao?.insert(r1) }
          executorService.execute { racunDao?.insert(r2) }
          executorService.execute { racunDao?.insert(r3) }
          executorService.execute { racunDao?.insert(r4) }*/

        if (racunDao != null) {
            getData(racunDao)
        }
        listRacun.layoutManager = LinearLayoutManager(this)
        listRacun.adapter = Adapter(listRac)
    }


    fun getData(racunDao: RacunDAO) = runBlocking {
        launch(Dispatchers.IO) {
            listRac = racunDao?.getAll() as ArrayList<Racun>
        }
    }
}
