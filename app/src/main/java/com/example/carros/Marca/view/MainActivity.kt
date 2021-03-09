package com.example.carros.Marca.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley
import com.example.carros.Marca.controller.MarcaController
import com.example.carros.Marca.model.Marcas
import com.example.carros.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var adapter = ListAdapter()
    val controller = MarcaController(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val lmv = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvlist?.layoutManager = lmv
        rvlist?.adapter = adapter
        val url = "https://fipeapi.appspot.com/api/1/carros/marcas.json"
        controller.loadMarca(url)

    }
    fun onresponsemarca(listMarca:ArrayList<Marcas>){
        adapter.list = listMarca
        adapter.notifyDataSetChanged()
            }
}