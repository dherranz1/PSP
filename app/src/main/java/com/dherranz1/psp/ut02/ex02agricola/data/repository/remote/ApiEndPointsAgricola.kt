package com.dherranz1.psp.ut02.ex02agricola.data.repository.remote

import com.dherranz1.psp.ut02.ex01.data.remote.models.UserApiModel
import com.dherranz1.psp.ut02.ex02agricola.data.repository.remote.models.AlertApiModel
import com.dherranz1.psp.ut02.ex02agricola.data.repository.remote.models.AlertResponeApiModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiEndPointsAgricola {

    @GET("api/public/alerts/")
    fun getAlerts() : Call<AlertResponeApiModel>

    @GET("api/public/alerts/{id}")
    fun getAlertById(@Path("id") id : Int) : Call<AlertApiModel>

}