package com.example.gasper.greenbills.UI

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gasper.greenbills.R
import com.example.gasper.greenbills.db.Racun


class Adapter(val data: ArrayList<Racun>) :
    RecyclerView.Adapter<Adapter.ViewHolder>() {
    lateinit var intent: Intent

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

            val view: View = LayoutInflater.from(parent.context)
                .inflate(R.layout.activity_row_racun, parent, false)
            return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.trgovina!!.text = data[position].trgovina
        holder.datum!!.text = data[position].datum
        holder.itemView.setOnClickListener(View.OnClickListener {

                intent = Intent(it.context, racunDetails::class.java)

            intent.putExtra("id", data[position].id.toString())
            intent.putExtra("datum", data[position].datum)
            intent.putExtra("trgovina", data[position].trgovina)

            it.context.startActivity(intent)
        })

    }


    override fun getItemCount() = data.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //val kraj: TextView = itemView.findViewById(R.id.kraj)
        val trgovina :TextView?=itemView.findViewById(R.id.trgo)
        val datum :TextView?=itemView.findViewById(R.id.datum)


        val izdelek :TextView?=itemView.findViewById(R.id.izdelek)
        //val kolicina :TextView=itemView.findViewById(R.id.kol)
//        val cena :TextView=itemView.findViewById(R.id.cena)
    }
}
