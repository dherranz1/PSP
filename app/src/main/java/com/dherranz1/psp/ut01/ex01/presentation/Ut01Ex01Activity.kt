package com.dherranz1.psp.ut01.ex01.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.dherranz1.psp.R

class Ut01Ex01Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ut01ex01)

        // val etiqueta = findViewById<TextView>(R.id.label) // Con casting
        val etiqueta : TextView = findViewById(R.id.label)

        etiqueta.text = getString(R.string.title)

        Thread{

            Thread.sleep( 5000)

            runOnUiThread{

                etiqueta.text = getString(R.string.title2)
            }

        }.start()
    }
}