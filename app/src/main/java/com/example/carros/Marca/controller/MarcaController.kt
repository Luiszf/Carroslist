package com.example.carros.Marca.controller

import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley
import com.example.carros.Marca.model.Marcas
import com.example.carros.Marca.view.MainActivity

class MarcaController(val activity:MainActivity) {

    fun loadMarca(url:String?) {
        val jar = JsonArrayRequest(url, { response ->
            val listmarca = arrayListOf<Marcas>()
            for(i in 0 until 30) {
                val charmarcas = Marcas()
                charmarcas.setDataMarca(response.getJSONObject(i))
                listmarca.add(charmarcas)
            }
           activity.onresponsemarca(listmarca)
        },{
            it.printStackTrace()
        })
        Volley.newRequestQueue(activity).add(jar)
    }
}