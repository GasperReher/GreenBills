package com.example.gasper.greenbills.UI


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gasper.greenbills.db.Racun
import kotlinx.android.synthetic.main.activity_seznam_racunov.*
import kotlinx.android.synthetic.main.fragment_list_izdelek.*

/**
 * A simple [Fragment] subclass.
 */
class ListIzdelek : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment



        return inflater.inflate(com.example.gasper.greenbills.R.layout.fragment_list_izdelek, container, false)

    }


}
