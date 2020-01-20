package com.example.gasper.greenbills

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.gasper.greenbills.UI.SeznamRacunov
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        prijava.setOnClickListener(View.OnClickListener {
            var inte = Intent(this, SeznamRacunov::class.java)
            startActivity(inte)


        })
    }
}

