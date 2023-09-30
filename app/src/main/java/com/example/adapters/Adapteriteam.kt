package com.example.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.brithday.Models.model
import com.example.brithday.R
import com.example.brithday.categorymouthActivity2

class Adapteriteam(private val list: List<model>) :
    RecyclerView.Adapter<Adapteriteam.PersonViewHolder>() {
    inner class PersonViewHolder(iteamView: View) : RecyclerView.ViewHolder(iteamView) {
        val name: TextView = iteamView.findViewById(R.id.txt_name)
        val year: TextView = iteamView.findViewById(R.id.txt_lastmassage)
        val foto: ImageView = iteamView.findViewById(R.id.circleImageView)
        val time: TextView = iteamView.findViewById(R.id.txt_time)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.iteam_brith, parent, false)
        return PersonViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.name.text = list[position].name
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, categorymouthActivity2::class.java)

        }

    }
}