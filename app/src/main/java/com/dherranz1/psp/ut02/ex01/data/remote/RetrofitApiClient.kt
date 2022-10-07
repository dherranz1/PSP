package com.dherranz1.psp.ut02.ex01.data.remote

import com.dherranz1.psp.ut02.ex01.data.remote.models.UserApiModel
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitApiClient {

    private val  urlEndPoint = "https://jsonplaceholder.typicode.com"
    //private lateinit var apiEndPoints: ApiEndPoints     // Saber lateinit, pero no es una buena practica porque puede llegar a usarse antes de ser inicializada
    private var apiEndPoints: ApiEndPoints

    // Init se ejecuta lo primero, equivalente al constructor
    init{
        apiEndPoints = buildApiEndPoints()
    }
    private fun buildClient() : Retrofit {
        return Retrofit.Builder()
            .baseUrl(urlEndPoint)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }

    private fun buildApiEndPoints() : ApiEndPoints {
        return buildClient().create(ApiEndPoints::class.java)
    }

    fun getUsers():List<UserApiModel>{
        val callUsers = apiEndPoints.getUsers() // Llamada
        val response = callUsers.execute() // Ejecucion de la llamada

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

        // Kotlin style
        return if (response.isSuccessful){
            val users = response.body()
            users ?: emptyList() // Puede devolver un nulo, para tratarlo usamos ?: y devolvemos una lista vacia
        } else{
            emptyList<UserApiModel>()
        }



    }

    fun getUserById(userId : Int) : UserApiModel?{
        val callUsers = apiEndPoints.getUserById(userId) // Llamada
        val response = callUsers.execute() // Ejecucion de la llamada

        return if (response.isSuccessful){
            val user = response.body()
            user
        }
        else
            null

    }
}