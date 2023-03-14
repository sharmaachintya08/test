package com.example.emptyactivity.Fragments

import android.content.ClipData
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.core.os.bundleOf
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.viewModels
import com.example.emptyactivity.Fragments.MainScreen.SongsList
import com.example.emptyactivity.Fragments.SongPlay.SongPlaying
import com.example.emptyactivity.MainActivity
import com.example.emptyactivity.R


class BottomBar : Fragment(){

    private var playlistList : ImageView? = null
    private var currentSong : ImageView? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_bottom_bar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        playlistList = view.findViewById(R.id.playlist_list)
        currentSong = view.findViewById(R.id.currentSong)
        playlistList?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                val fragment = SongsList()
                parentFragmentManager.beginTransaction()
                    .replace(R.id.upper_fragment,fragment)
                    .addToBackStack("songListFragment")
                    .commit()
            }
        })
        currentSong?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                val fragment = SongPlaying()
                parentFragmentManager.beginTransaction()
                    .replace(R.id.upper_fragment,fragment)
                    .addToBackStack("songListFragment")
                    .commit()
            }
        })
    }
}