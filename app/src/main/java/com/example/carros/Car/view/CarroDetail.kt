package com.example.carros.Car.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.carros.Car.model.Carros
import com.example.carros.R
import kotlinx.android.synthetic.main.carro_detail.*

class carroDetail: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.carro_detail)

        val tv = intent?.extras?.getParcelable<Carros>("model")

        tvcarrodetail.text = tv?.carronome
    }
}
