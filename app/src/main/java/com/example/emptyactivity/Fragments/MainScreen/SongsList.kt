package com.example.emptyactivity.Fragments.MainScreen

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.provider.ContactsContract.Data
import android.provider.MediaStore
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.emptyactivity.Fragments.RecyclerView.DataModel
import com.example.emptyactivity.Fragments.RecyclerView.RecyclerAdapter
import com.example.emptyactivity.MainActivity
import com.example.emptyactivity.R
import java.io.File


class SongsList : Fragment() {

    companion object{
        lateinit var musicList : ArrayList<DataModel>
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_songs_list, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)
        musicList = MainActivity.tempList
        recyclerView.adapter = RecyclerAdapter(musicList)
        return view
    }
}