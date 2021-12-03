package com.example.lykkehjul

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.category_view.view.*
import kotlinx.android.synthetic.main.letter_view.view.*

//    https://www.youtube.com/watch?v=cGUu1ab9vFw
//    brugt til inspiration til CategoryAdapter og LetterAdapter

class CategoryAdapter(
    var data: List<String>
) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.category_view, parent, false)

        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryAdapter.CategoryViewHolder, position: Int) {
        holder.tvCategory.text = data[position].toString()
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class CategoryViewHolder
    internal constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        val tvCategory: TextView = itemView.category_item
    }
}