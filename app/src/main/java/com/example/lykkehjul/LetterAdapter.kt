package com.example.lykkehjul

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.letter_view.view.*

//    https://www.youtube.com/watch?v=cGUu1ab9vFw
//    brugt til inspiration til CategoryAdapter og LetterAdapter

class LetterAdapter (var data: CharArray
) : RecyclerView.Adapter<LetterAdapter.LetterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LetterViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.letter_view, parent, false)

        return LetterViewHolder(view)
    }

    override fun onBindViewHolder(holder: LetterAdapter.LetterViewHolder, position: Int) {
        holder.tvLetter.text = data.get(position).toString()
    }

    override fun getItemCount(): Int {return data.size}

    inner class LetterViewHolder

    internal constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView){
        val tvLetter: TextView = itemView.tvLetter
    }
}