package com.example.lykkehjul

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lykkehjul.logic.LykkehjulLogic
import kotlinx.android.synthetic.main.fragment_game.*

class GameFragment : Fragment(R.layout.fragment_game) {

    lateinit var temp: String

    private var lettersUsed: String = ""
    private lateinit var adapter: LetterAdapter
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

            } else {
                lives -= 1
                textView_points.setText("Points: $points")

            }

        }

        b.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('b')
            if (isCorrectGuess) {
                val letterIndex = LykkehjulLogic.getLetterIndex(wordToGuess, 'b')
                if (letterIndex != -1) {

                    var newWord = LykkehjulLogic.placeLetterInWordByIndex('b', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = LykkehjulLogic.countLetterInWord('b', wordToGuess)

                    points += count*tempPoint
                }

            } else {
                lives -= 1
                textView_points.setText("Points: $points")

            }

        }

        c.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('c')
            if (isCorrectGuess) {
                val letterIndex = LykkehjulLogic.getLetterIndex(wordToGuess, 'c')
                if (letterIndex != -1) {

                    var newWord = LykkehjulLogic.placeLetterInWordByIndex('c', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = LykkehjulLogic.countLetterInWord('c', wordToGuess)

                    points += count*tempPoint
                }

            } else lives -=1

        }

        d.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('d')
            if (isCorrectGuess) {
                val letterIndex = LykkehjulLogic.getLetterIndex(wordToGuess, 'd')
                if (letterIndex != -1) {

                    var newWord = LykkehjulLogic.placeLetterInWordByIndex('d', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = LykkehjulLogic.countLetterInWord('d', wordToGuess)

                    points += count*tempPoint

                }

            } else lives -=1

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

            } else lives -=1

        }

        f.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('f')
            if (isCorrectGuess) {
                val letterIndex = LykkehjulLogic.getLetterIndex(wordToGuess, 'f')
                if (letterIndex != -1) {

                    var newWord = LykkehjulLogic.placeLetterInWordByIndex('f', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = LykkehjulLogic.countLetterInWord('f', wordToGuess)

                    points += count*tempPoint
                }

            } else lives -=1

        }
        g.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('g')
            if (isCorrectGuess) {
                val letterIndex = LykkehjulLogic.getLetterIndex(wordToGuess, 'g')
                if (letterIndex != -1) {

                    var newWord = LykkehjulLogic.placeLetterInWordByIndex('g', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = LykkehjulLogic.countLetterInWord('g', wordToGuess)

                    points += count*tempPoint
                }

            } else lives -=1

        }
        h.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('h')
            if (isCorrectGuess) {
                val letterIndex = LykkehjulLogic.getLetterIndex(wordToGuess, 'h')
                if (letterIndex != -1) {

                    var newWord = LykkehjulLogic.placeLetterInWordByIndex('h', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = LykkehjulLogic.countLetterInWord('h', wordToGuess)

                    points += count*tempPoint
                }

            } else lives -=1

        }

        i.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('i')
            if (isCorrectGuess) {
                val letterIndex = LykkehjulLogic.getLetterIndex(wordToGuess, 'i')
                if (letterIndex != -1) {

                    var newWord = LykkehjulLogic.placeLetterInWordByIndex('i', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = LykkehjulLogic.countLetterInWord('i', wordToGuess)

                    points += count*tempPoint
                }

            } else lives -=1

        }
        j.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('j')
            if (isCorrectGuess) {
                val letterIndex = LykkehjulLogic.getLetterIndex(wordToGuess, 'j')
                if (letterIndex != -1) {

                    var newWord = LykkehjulLogic.placeLetterInWordByIndex('j', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = LykkehjulLogic.countLetterInWord('j', wordToGuess)

                    points += count*tempPoint
                }

            } else lives -=1

        }
        k.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('k')
            if (isCorrectGuess) {
                val letterIndex = LykkehjulLogic.getLetterIndex(wordToGuess, 'k')
                if (letterIndex != -1) {

                    var newWord = LykkehjulLogic.placeLetterInWordByIndex('k', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = LykkehjulLogic.countLetterInWord('k', wordToGuess)

                    points += count*tempPoint
                }

            } else lives -=1

        }
        l.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('l')
            if (isCorrectGuess) {
                val letterIndex = LykkehjulLogic.getLetterIndex(wordToGuess, 'l')
                if (letterIndex != -1) {

                    var newWord = LykkehjulLogic.placeLetterInWordByIndex('l', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = LykkehjulLogic.countLetterInWord('l', wordToGuess)

                    points += count*tempPoint
                }

            } else lives -=1

        }
        m.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('m')
            if (isCorrectGuess) {
                val letterIndex = LykkehjulLogic.getLetterIndex(wordToGuess, 'm')
                if (letterIndex != -1) {

                    var newWord = LykkehjulLogic.placeLetterInWordByIndex('m', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = LykkehjulLogic.countLetterInWord('m', wordToGuess)

                    points += count*tempPoint
                }

            } else lives -=1

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
