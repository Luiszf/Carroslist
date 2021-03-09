package com.example.carros.Car.Controller

import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley
import com.example.carros.Car.model.Carros
import com.example.carros.Car.view.ListCarrosActivity

class ListcCarrosController(val act:ListCarrosActivity) {

    fun loadcarrolist(id:String?){
        var Url = "https://fipeapi.appspot.com/api/1/carros/veiculos/$id.json"
        val jar = JsonArrayRequest(Url, { response ->
            val listcarro = arrayListOf<Carros>()
            for(i in 0 until 10) {
                val charcarros = Carros()
                charcarros.setDataMarca(response.getJSONObject(i))
                listcarro.add(charcarros)
            }
           act.listcarroresponse(listcarro)

        },{
            it.printStackTrace()
        })
        Volley.newRequestQueue(act).add(jar)
    }
}