package com.dherranz1.psp.ut02.ex02agricola.data.repository.remote.api_plagas

import com.dherranz1.psp.ut02.ex02agricola.data.repository.remote.api_plagas.models.AlertApiModel
import com.dherranz1.psp.ut02.ex02agricola.data.repository.remote.api_plagas.models.AlertsListApiModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiEndPointsAgricola {

    @GET("api/public/alerts")
    fun getAlerts() : Call<AlertsListApiModel>

    @GET("api/public/alerts/{id}")
    fun getAlertById(@Path("id") id : Int) : Call<AlertApiModel>

}