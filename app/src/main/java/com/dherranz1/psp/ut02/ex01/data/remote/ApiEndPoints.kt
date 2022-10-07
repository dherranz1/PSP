package com.dherranz1.psp.ut02.ex01.data.remote

import com.dherranz1.psp.ut02.ex01.data.remote.models.UserApiModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.Path

interface ApiEndPoints {

    @GET("users")
    fun getUsers() : Call<List<UserApiModel>>

    @GET("users/{id}")
    fun getUserById(@Path("id") id : Int) : Call<UserApiModel>

}