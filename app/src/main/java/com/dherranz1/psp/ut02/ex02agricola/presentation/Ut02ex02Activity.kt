package com.dherranz1.psp.ut02.ex02agricola.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.dherranz1.psp.R
import com.dherranz1.psp.ut02.ex02agricola.data.repository.AlertsRepository
import com.dherranz1.psp.ut02.ex02agricola.data.repository.remote.api_plagas.RetrofitApiClientAgricola

class Ut02ex02Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ut02ex02)

        val apiClient = RetrofitApiClientAgricola()



        Thread {

            val alertas = AlertsRepository().getAlertById(3053125)
            val listaAlertas = AlertsRepository().getAlerts()

            listaAlertas?.data?.forEach {
                Log.d("@dev", "Alerta ${it.date}")
            }
        }.start()


    }
}