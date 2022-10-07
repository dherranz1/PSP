package com.dherranz1.psp.ut02.ex02agricola.data.repository.remote

import android.util.Log
import com.dherranz1.psp.ut02.ex02agricola.data.repository.remote.models.AlertApiModel
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitApiClientAgricola {

    private val  urlEndPoint = "https://plagricola.sitehub.es/"
    //private lateinit var apiEndPoints: ApiEndPoints     // Saber lateinit, pero no es una buena practica porque puede llegar a usarse antes de ser inicializada
    private var apiEndPointsAgricola: ApiEndPointsAgricola

    // Init se ejecuta lo primero, equivalente al constructor
    init{
        apiEndPointsAgricola = buildApiEndPoints()
    }
    private fun buildClient() : Retrofit {
        return Retrofit.Builder()
            .baseUrl(urlEndPoint)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }

    private fun buildApiEndPoints() : ApiEndPointsAgricola {
        return buildClient().create(ApiEndPointsAgricola::class.java)
    }
/*
    fun getAlerts():List<AlertApiModel>{
        val callAlerts = apiEndPointsAgricola.getAlerts()
        val response = callAlerts.execute() // Ejecucion de la llamada

        // Traditional style
        /*
        if (response.isSuccessful){
            val users = response.body()
            return users ?: emptyList() // Puede devolver un nulo, para tratarlo usamos ?: y devolvemos una lista vacia
        }
        else{
            return emptyList<UserApiModel>()
        }
        */

        if(response.isSuccessful){
            val alertsList = response.body()
            return alertsList?: emptyList<AlertApiModel>()
        }
        else
            return emptyList()

    }
*/
    fun getAlertById(alertId : Int) : AlertApiModel?{
        val callUsers = apiEndPointsAgricola.getAlertById(alertId) // Llamada
        val response = callUsers.execute() // Ejecucion de la llamada

        return if (response.isSuccessful){
            val user = response.body()
            Log.d("@dev", "Codigo : ${user?.data}")
            user
        }
        else
            null

    }
}