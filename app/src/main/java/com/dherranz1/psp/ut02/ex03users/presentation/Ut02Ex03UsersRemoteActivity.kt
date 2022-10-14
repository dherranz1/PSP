package com.dherranz1.psp.ut02.ex03users.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.dherranz1.psp.R
import com.dherranz1.psp.ut02.ex03users.data.UserRepository
import com.dherranz1.psp.ut02.ex03users.data.remote.UsersRemoteDataSource

class Ut02Ex03UsersRemoteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ut02_ex03_users_remote)

        val usersDataRemote : UsersRemoteDataSource = UsersRemoteDataSource()
        val userRepository : UserRepository = UserRepository(usersDataRemote)

        Thread{
            Log.d("@dev", "")
            Log.d("@dev", "Lista de usuarios")
            Log.d("@dev", "=================")

            userRepository.getUsers().forEach { user ->
                Log.d("@dev", "Usuario : $user")
            }

            Log.d("@dev", "")
            Log.d("@dev", "Buscando un usuario")
            Log.d("@dev", "===================")

            val user = userRepository.getUserById(6)
            Log.d("@dev", "Usuario : $user")


        }.start()

    }
}