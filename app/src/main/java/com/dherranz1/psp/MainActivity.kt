package com.dherranz1.psp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.dherranz1.psp.ut02.ex01.data.remote.RetrofitApiClient
import com.dherranz1.psp.ut02.ex01.domain.User

class MainActivity : AppCompatActivity() {

    val apiClient = RetrofitApiClient()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("@dev", "Retrofit")

        // No se debe lanzar una peticion a internet en el hilo principal, crash
        // por ello se debe envolver en otro hilo. Ademas falta dar permiso a internet
        Thread{

            Log.d("@dev", "Hilo de petición")

            val listaUsuarios = apiClient.getUsers()
            Log.d("@dev", "Nombre: $listaUsuarios")
            /*
            listaUsuarios.forEach{ user : UserApiModel ->
                Log.d("@dev", "Nombre: $user")
            }

             */

        }.start()

        Thread{
            val usuario = apiClient.getUserById(3)
            Log.d("@dev", "Usuario por ID:  $usuario")
        }.start()

    }
}