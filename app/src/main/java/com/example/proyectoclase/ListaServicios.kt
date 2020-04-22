package com.example.proyectoclase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_lista_servicios.*

class ListaServicios : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_servicios)

        RvListaServicios.layoutManager = LinearLayoutManager(this)
        RvListaServicios.adapter = AdaptadorServicios(selectServicio(), this)
    }

    private fun selectServicio(): ArrayList<Servicio>{
     var lista = ArrayList<Servicio>()

        lista.add(Servicio(R.drawable.veterinaria,"Servicio Veterinaria", "Juan Prada", "Servicio de cuidado de mascotas", 5.0))
        lista.add(Servicio(R.drawable.peluqueria,"Servicio Peluqueria", "Yamir Ojuela", "Servicio de peluqueria de mascotas", 4.0))
        lista.add(Servicio(R.drawable.manicura,"Servicio Manicura", "Dante Fernandez", "Servicio de cuidado y corte de uñas de mascotas", 4.5))

        return lista
    }
}
