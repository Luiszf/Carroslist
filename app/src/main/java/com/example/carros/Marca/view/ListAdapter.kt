package com.example.carros.Marca.view

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.carros.Car.view.ListCarrosActivity
import com.example.carros.Marca.model.Marcas
import com.example.carros.R

class ListAdapter(
        var list:ArrayList<Marcas> = arrayListOf()
): RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_list_marcas, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val model = list[position]
        val ctx = holder.itemView.context

        holder.text1.text = model.marcaname
        holder.itemView.setOnClickListener {
            val intent = Intent(ctx, ListCarrosActivity::class.java)
            intent.putExtra("model" , model)
            ctx.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
         return list.size
    }
    class MyViewHolder(view: View):RecyclerView.ViewHolder(view) {
        var text1 = view.findViewById<TextView>(R.id.tvlist)
    }
}