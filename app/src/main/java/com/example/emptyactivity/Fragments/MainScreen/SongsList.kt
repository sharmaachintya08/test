package com.example.emptyactivity.Fragments.MainScreen

import android.os.Bundle
import android.provider.ContactsContract.Data
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.emptyactivity.Fragments.RecyclerView.DataModel
import com.example.emptyactivity.Fragments.RecyclerView.RecyclerAdapter
import com.example.emptyactivity.R

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class SongsList : Fragment() {

    private var param1: String? = null
    private var param2: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_songs_list, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)
        val dataSet = ArrayList<DataModel>()

        dataSet.add(DataModel(null,"song1","2:34","achintya"))
        dataSet.add(DataModel(null,"song1","2:34","achintya"))
        dataSet.add(DataModel(null,"song1","2:34","achintya"))
        dataSet.add(DataModel(null,"song1","2:34","achintya"))
        dataSet.add(DataModel(null,"song1","2:34","achintya"))
        dataSet.add(DataModel(null,"song1","2:34","achintya"))


        recyclerView.adapter = RecyclerAdapter(dataSet)
        return view
    }
    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SongsList().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}