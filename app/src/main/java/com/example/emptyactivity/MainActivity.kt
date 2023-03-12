package com.example.emptyactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.emptyactivity.Fragments.MainScreen.SongsList
import com.example.emptyactivity.Fragments.SongPlay.SongPlaying
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayFragment()
    }
    private fun songListInstance() : SongsList{
        return SongsList()
    }
    private fun songPlayInstance() : SongPlaying{
        return SongPlaying()
    }
    private fun displayFragment(){
        supportFragmentManager.beginTransaction()
            .add(R.id.upper_fragment,songPlayInstance())
            .addToBackStack("songListFragment")
            .commit()
    }
}