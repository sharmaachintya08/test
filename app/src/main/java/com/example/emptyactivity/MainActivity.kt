package com.example.emptyactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.emptyactivity.Fragments.BottomBar
import com.example.emptyactivity.Fragments.MainScreen.SongsList
import com.example.emptyactivity.Fragments.SongPlay.SongPlaying
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayFragment()
    }
    fun displayFragment(){
        supportFragmentManager.beginTransaction()
            .replace(R.id.upper_fragment,SongsList())
            .addToBackStack("songListFragment")
            .commit()
    }
}