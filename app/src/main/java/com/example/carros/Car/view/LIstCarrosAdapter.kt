package com.example.carros.Car.view

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.carros.Car.model.Carros
import com.example.carros.R

class LIstCarrosAdapter(
        var list:ArrayList<Carros> = arrayListOf()
):RecyclerView.Adapter<LIstCarrosAdapter.MyviewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_list_carros, parent, false)
        return MyviewHolder(view)
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        val model = list[position]
        val ctx = holder.itemView.context
        holder.text.text = model.carronome
        holder.itemView.setOnClickListener{
            val intent = Intent(ctx, carroDetail::class.java)
            intent.putExtra("model", model)
            ctx.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
    class MyviewHolder(view: View):RecyclerView.ViewHolder(view) {
        val text = view.findViewById<TextView>(R.id.tvitemlistcarro)
    }
}