package com.example.up.bookworm.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

//    private val _text = MutableLiveData<String>().apply {
//        value = "This is home Fragment"
//    }
    val text: MutableLiveData<String> = MutableLiveData()


    fun getText(){
        text.value = "This is home Fragment"
    }

}