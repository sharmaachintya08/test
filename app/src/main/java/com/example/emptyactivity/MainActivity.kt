package com.example.emptyactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.emptyactivity.Fragments.MainScreen.SongsList
import com.example.emptyactivity.Fragments.SongPlay.SongPlaying
import java.util.*

class MainActivity : AppCompatActivity() {

    private val viewModel : ItemViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //viewmodel logic
        viewModel.mutableSelectedItem.observe(this@MainActivity, {
            Toast.makeText(applicationContext,it.toString(),Toast.LENGTH_SHORT).show()
        })

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