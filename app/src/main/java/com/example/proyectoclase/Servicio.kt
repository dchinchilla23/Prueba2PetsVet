package com.example.proyectoclase

import java.io.Serializable

data class Servicio(
    var idImagen: Int,
    var Titulo: String,
    var Dueño: String,
    var Descripcion: String,
    var Calificacion: Double
) :  Serializable