package com.example.carros.Car.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.volley.toolbox.Volley
import com.example.carros.Car.Controller.ListcCarrosController
import com.example.carros.Car.model.Carros
import com.example.carros.Marca.model.Marcas
import com.example.carros.R
import kotlinx.android.synthetic.main.listcarros.*

class ListCarrosActivity:AppCompatActivity() {
    var adapter = LIstCarrosAdapter()
    val ctl = ListcCarrosController(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listcarros)

        var llm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvcarrolist.layoutManager = llm
        rvcarrolist.adapter = adapter
        var Marcas = intent?.extras?.getParcelable<Marcas>("model")
        var id = Marcas?.marcaid
        ctl.loadcarrolist(id)
    }
    fun listcarroresponse(listcarro:ArrayList<Carros>){
        adapter.list = listcarro
        adapter.notifyDataSetChanged()
    }


}



