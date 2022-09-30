package com.dherranz1.psp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dherranz1.psp.ut02.data.remote.RetrofitApiClient

class MainActivity : AppCompatActivity() {

    val apiClient = RetrofitApiClient()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // No se debe lanzar una peticion a internet en el hilo principal, crash
        // por ello se debe envolver en otro hilo. Ademas falta dar permiso a internet
        Thread{
            apiClient.getUsers()
        }

    }
}