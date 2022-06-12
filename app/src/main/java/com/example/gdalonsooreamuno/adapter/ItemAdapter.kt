package com.example.gdalonsooreamuno.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.gdalonsooreamuno.R
import com.google.api.services.drive.model.File

class ItemAdapter(context: Context, documentos: List<File>) :
    ArrayAdapter<File>(context, 0, documentos) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater: LayoutInflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rowView = inflater.inflate(R.layout.item, parent, false)
        val nombre = rowView.findViewById<TextView>(R.id.nombre)
        val documento = getItem(position)
        nombre.setText(documento?.name)

        return rowView
    }



}