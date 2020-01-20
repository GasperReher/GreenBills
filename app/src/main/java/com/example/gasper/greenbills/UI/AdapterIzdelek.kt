package com.example.gasper.greenbills.UI

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gasper.greenbills.R

import com.example.gasper.greenbils.db.Izdelek


class AdapterIzdelek(val data: ArrayList<Izdelek>) :
    RecyclerView.Adapter<Adapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {

        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_izdelek_row, parent, false)
        return Adapter.ViewHolder(view)

    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        holder.izdelek!!.text = data[position].naziv+"\n kolicina: "+data[position].kolicina+"x  \ncena/izdelek: "+data[position].cena+"€"
      //  holder.kolicina.text="Količina "+data[position].kolicina
     //   holder.cena.text="€/Izdelek "+data[position].cena
    }



}
