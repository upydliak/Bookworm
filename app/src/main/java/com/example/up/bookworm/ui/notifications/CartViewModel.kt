package com.example.up.bookworm.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CartViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Cart Fragment"
    }
    val text: LiveData<String> = _text
}