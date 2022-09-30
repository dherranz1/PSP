package com.dherranz1.psp.ut02.data.remote

import com.dherranz1.psp.ut02.data.remote.models.UserApiModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiEndPoints {

    @GET("users")
    fun getUsers() : Call<List<UserApiModel>>

}