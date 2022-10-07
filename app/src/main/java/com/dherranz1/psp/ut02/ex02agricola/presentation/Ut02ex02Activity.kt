package com.dherranz1.psp.ut02.ex02agricola.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.dherranz1.psp.R
import com.dherranz1.psp.ut02.ex01.data.remote.RetrofitApiClient
import com.dherranz1.psp.ut02.ex02agricola.data.repository.remote.RetrofitApiClientAgricola

class Ut02ex02Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ut02ex02)

        val apiClient = RetrofitApiClientAgricola()


        Thread{
            val alerta = apiClient.getAlertById(3053125)

            Log.d("@dev", "Alerta : ${alerta?.status}")
        }.start()

    }
}