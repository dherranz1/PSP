package com.dherranz1.psp.ut02.ex03users.data.remote


import com.dherranz1.psp.ut02.ex03users.data.remote.models.UserApiModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface UserApiService {

    @GET("users/")
    fun getUsers() : Call<List<UserApiModel>>

    @GET("users/{id}")
    fun getUserById(@Path("id") id : Int) : Call<UserApiModel>

}