package com.example.proyectoclase

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.elemento_lista_servicio.view.*

class AdaptadorServicios(private var lista: ArrayList<Servicio>,private var contexto: Context): RecyclerView.Adapter<AdaptadorServicios.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.elemento_lista_servicio, parent, false), contexto)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(lista[position])
    }

    class ViewHolder(var vista: View, contexto:Context):RecyclerView.ViewHolder(vista){
        fun bind(servicio: Servicio){
            vista.elslvServicio.setImageResource(servicio.idImagen)
            vista.txtTitulo.text = servicio.Titulo
            vista.txtTexto.text = servicio.Descripcion
            vista.elsRbCalificacion.rating = servicio.Calificacion.toFloat()
        }
    }
}