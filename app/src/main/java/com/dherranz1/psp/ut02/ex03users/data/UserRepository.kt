package com.dherranz1.psp.ut02.ex03users.data

import com.dherranz1.psp.ut02.ex03users.data.remote.UsersRemoteDataSource
import com.dherranz1.psp.ut02.ex03users.data.remote.models.UserApiModel


class UserRepository (val remoteDataSource: UsersRemoteDataSource){

    fun getUsers() : List <UserApiModel> =
        remoteDataSource.getUsers()

    fun getUserById(userId : Int) : UserApiModel? =
        remoteDataSource.getUserById(userId)


}