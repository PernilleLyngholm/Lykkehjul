package com.example.lykkehjul

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lykkehjul.logic.LykkehjulLogic
import kotlinx.android.synthetic.main.fragment_game.*

class GameFragment : Fragment(R.layout.fragment_game) {

    lateinit var temp: String

    //lateinit var newWord: String
    lateinit var adapter: LetterAdapter


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)

        val wordToGuess = WordsMemoryDB.testData.random()
        var wordsUnderscore = ""

        for (i in wordToGuess) {
            wordsUnderscore += "_"
        }

        temp = wordsUnderscore

        val arrayOfChar = wordsUnderscore.toCharArray()
        adapter = LetterAdapter(arrayOfChar)

        rv_word_to_guess.layoutManager = layoutManager
        rv_word_to_guess.setHasFixedSize(true)
        rv_word_to_guess.adapter = adapter

        button_spin.setOnClickListener {
            val spinValue = getSpinValue()
            textView_result_of_spin.text = spinValue

            when (spinValue) {
                "100" -> print("x == 1")
                "200" -> print("x == 2")
                "300" -> print("x == 1")
                "400" -> print("x == 1")
                "500" -> print("x == 1")
                "Bankrupt" -> print("x == 1")
                "Missed turn"-> print("x == 1")
                "Extra turn"-> print("x == 1")
                else -> {
                    print("x is neither 1 nor 2")
                }
            }
        }

        e.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('e')
            if (isCorrectGuess) {
                val letterIndex = LykkehjulLogic.getLetterIndex(wordToGuess, 'e')
                if (letterIndex != -1) {

                    var newWord = LykkehjulLogic.placeLetterInWordByIndex('e', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()
                }

            }

        }

    }

    fun getSpinValue(): String {
        val spin =
            listOf(
                "100",
                "200",
                "300",
                "400",
                "500",
                "Bankrupt",
                "Missed turn",
                "Extra turn"
            ).random()
        return spin

    }


}
