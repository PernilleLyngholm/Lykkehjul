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
    var points: Int = 0
    var tempPoint = 0
    var lives = 5

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        val wordToGuess: String = WordsMemoryDB.wordList
        var wordsUnderscore = "_"

        for (i in wordToGuess) {
            wordsUnderscore += "_"
        }

        temp = wordsUnderscore

        val arrayOfChar = wordsUnderscore.toCharArray()
        adapter = LetterAdapter(arrayOfChar)

        rv_word_to_guess.layoutManager = layoutManager
        rv_word_to_guess.setHasFixedSize(true)
        rv_word_to_guess.adapter = adapter
        textView_points.text = ("Points: $points")
        textView_lives.text = ("Lives: $lives")


        button_spin.setOnClickListener {
            val spinValue = getSpinValue()
            textView_result_of_spin.text = spinValue

            when (spinValue) {
                "100" -> tempPoint += 100
                "200" -> tempPoint += 200
                "300" -> tempPoint += 300
                "400" -> tempPoint += 400
                "500" -> tempPoint += 500
                "Missed turn"-> lives -= 1
                "Extra turn"-> lives += 1
                else -> points = 0
            }
        }

        a.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('a')
            if (isCorrectGuess) {
                val letterIndex = LykkehjulLogic.getLetterIndex(wordToGuess, 'a')
                if (letterIndex != -1) {

                    var newWord = LykkehjulLogic.placeLetterInWordByIndex('a', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = LykkehjulLogic.countLetterInWord('a', wordToGuess)

                    points += count*tempPoint
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

                    var count = LykkehjulLogic.countLetterInWord('e', wordToGuess)

                    points += count*tempPoint
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
