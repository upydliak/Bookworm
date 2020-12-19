package com.example.up.bookworm.ui.catalog

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.up.bookworm.LOG_TAG
import com.example.up.bookworm.R
import com.example.up.bookworm.data.Book
import com.example.up.bookworm.data.BookRepository
import com.example.up.bookworm.utilities.FileHelper
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

class CatalogViewModel(app: Application) : AndroidViewModel(app) {
    private val dataRepo = BookRepository(app)
    val bookData = dataRepo.bookData
    init{
        val bookData = dataRepo.getBookData()
    }

    private val _text = MutableLiveData<String>().apply {
        value = "This is Catalog Fragment"
    }
    val text: LiveData<String> = _text
}