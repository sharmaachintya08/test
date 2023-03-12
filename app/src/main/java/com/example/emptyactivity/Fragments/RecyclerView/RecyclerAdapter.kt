package com.example.emptyactivity.Fragments.RecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.emptyactivity.R


class RecyclerAdapter(private val dataSet : ArrayList<DataModel>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val songImage : ImageView
        val songName : TextView
        val songTime : TextView
        val songSinger : TextView
        val songMenu : ImageView
        init{
            songImage = itemView.findViewById(R.id.songImage)
            songName = itemView.findViewById(R.id.songName)
            songTime = itemView.findViewById(R.id.songTime)
            songSinger = itemView.findViewById(R.id.songSinger)
            songMenu = itemView.findViewById(R.id.songMenu)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.song_card,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {return dataSet.size}
}