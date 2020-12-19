package com.example.up.bookworm.data

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.up.bookworm.LOG_TAG
import com.example.up.bookworm.utilities.FileHelper
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

class BookRepository(val app: Application) {

    val bookData = MutableLiveData<List<Book>>()
    private val listType = Types.newParameterizedType(
        List::class.java, Book::class.java
    )

    init{
        getBookData()
    }


    fun getBookData(){
        val text = FileHelper.getTextFromAssets(app, "book_data.json")
        val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
        val adapter: JsonAdapter<List<Book>> = moshi.adapter(listType)
         bookData.value = adapter.fromJson(text)?: emptyList()


    }
}