package com.example.emptyactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.emptyactivity.Fragments.MainScreen.SongsList
import java.util.*

class MainActivity : AppCompatActivity() {
    private var firstUpperFragment : Fragment? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayFragment()
    }
    private fun newInstance() : SongsList{
        return SongsList()
    }
    private fun displayFragment(){
        supportFragmentManager.beginTransaction()
            .add(R.id.upper_fragment,newInstance())
            .addToBackStack("songListFragment")
            .commit()
    }
}