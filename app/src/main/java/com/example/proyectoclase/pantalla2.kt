package com.example.proyectoclase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class pantalla2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla2)
        var tittle = intent.getStringExtra("Hola, gracias ")


    }

    fun Rgr1(view: View) {
        var i =  Intent ( this, MainActivity::class.java)

        startActivity(i)
    }


    fun Sig2(view: View) {
        var i =  Intent ( this, ListaServicios::class.java)

        startActivity(i)
    }


}