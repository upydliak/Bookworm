package com.example.up.bookworm.ui.catalog

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.up.bookworm.LOG_TAG
import com.example.up.bookworm.R
import com.example.up.bookworm.data.Book

class CatalogFragment : Fragment() {

    private lateinit var catalogViewModel: CatalogViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        catalogViewModel = ViewModelProvider(this).get(CatalogViewModel::class.java)
        catalogViewModel.bookData.observe(viewLifecycleOwner, Observer
        {
            for(book in it) {
                Log.i(
                    LOG_TAG,
                    "${book.title} (\$${book.price})"
                )
            }

        })

        val root = inflater.inflate(R.layout.fragment_catalog, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        catalogViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}