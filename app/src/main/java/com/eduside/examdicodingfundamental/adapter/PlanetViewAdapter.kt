package com.eduside.examdicodingfundamental.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.eduside.examdicodingfundamental.R
import com.eduside.examdicodingfundamental.repository.dataplanet

class PlanetViewAdapter(private val listplanet : ArrayList<dataplanet>,val listener: OnAdapterListener) : RecyclerView.Adapter<PlanetViewAdapter.ViewHolder>() {
    inner class ViewHolder (itemView : View):RecyclerView.ViewHolder(itemView){
        var imgPhoto : ImageView = itemView.findViewById(R.id.img_planet)
        var tvname : TextView = itemView.findViewById(R.id.tv_name)
        var tvdetail : TextView = itemView.findViewById(R.id.tv_detail)
        var btnshare : Button = itemView.findViewById(R.id.btn_share)
        var btnsave : Button = itemView.findViewById(R.id.btn_save)



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_planet_data,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val planet = listplanet[position]
        Glide.with(holder.itemView.context)
            .load(planet.Photo)
            .into(holder.imgPhoto)

        holder.tvname.text = planet.nama
        holder.tvdetail.text = planet.detail

        holder.btnshare.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Share " + listplanet[holder.adapterPosition].nama, Toast.LENGTH_SHORT).show()
        }

        holder.btnsave.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Favorite " + listplanet[holder.adapterPosition].nama, Toast.LENGTH_SHORT).show()
        }

        holder.itemView.setOnClickListener {
            listener.onClick(planet)
        }



    }

    interface OnAdapterListener {
        fun onClick(result: dataplanet)
    }


    override fun getItemCount(): Int {
       return listplanet.size
    }
}