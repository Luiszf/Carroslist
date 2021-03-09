package com.example.carros.Car.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import org.json.JSONObject

@Parcelize
 data class Carros(
         var carronome: String = "",
): Parcelable {

    fun setDataMarca (data: JSONObject){
        this.carronome = data.getString("name")
    }
}