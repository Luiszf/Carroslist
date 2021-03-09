package com.example.carros.Marca.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import org.json.JSONObject

@Parcelize
data class Marcas (
    var marcaname: String = "",
    var marcaid: String = ""
):Parcelable {
    fun setDataMarca (data: JSONObject){

        this.marcaid = data.getInt("id").toString()
        this.marcaname = data.getString("name")
    }

}