package com.example.proyectoclase

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

        fun enter(v: View) {

            Toast.makeText(this, "Eres el mejor", Toast.LENGTH_SHORT).show()
            ///*/ me sirve para moverme entre las pantallas con ela ejecucion de un boto ///

            var i = Intent(this, ListaServicios::class.java)

            startActivity(i)
        
    }
}
