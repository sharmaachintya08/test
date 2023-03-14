package com.example.emptyactivity

import android.content.ClipData
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ItemViewModel : ViewModel() {
    val mutableSelectedItem = MutableLiveData<String>()
    fun selectedItem(item : String){
        mutableSelectedItem.value = item
    }
}