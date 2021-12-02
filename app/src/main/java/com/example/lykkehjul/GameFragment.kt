package com.example.lykkehjul

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.children
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_game.*

class GameFragment: Fragment(R.layout.fragment_game) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)

        val words = WordsMemoryDB.testData.random()
        var wordsUnderscore = ""

        for (i in words){
            wordsUnderscore += "_"
        }

        val arrayOfChar = wordsUnderscore.toCharArray()
        val adapter = LetterAdapter(arrayOfChar)

        rv_word_to_guess.layoutManager = layoutManager
        rv_word_to_guess.setHasFixedSize(true)
        rv_word_to_guess.adapter = adapter

        a.setOnClickListener {
            val isCorrectGuess = words.contains('a')

        }

    }
}
