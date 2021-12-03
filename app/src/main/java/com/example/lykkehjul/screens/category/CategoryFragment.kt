
package com.example.lykkehjul.screens.category

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lykkehjul.adapters.CategoryAdapter
import com.example.lykkehjul.R
import com.example.lykkehjul.data.WordsMemoryDB
import kotlinx.android.synthetic.main.fragment_categories.*

class CategoryFragment : Fragment(R.layout.fragment_categories){

    lateinit var adapter: CategoryAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        val listOfCategories: List<String> = WordsMemoryDB.categoryList

        adapter = CategoryAdapter(listOfCategories)

        rv_categories.layoutManager = layoutManager
        rv_categories.adapter = adapter
    }
}
