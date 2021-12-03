package com.example.lykkehjul.screens.game

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lykkehjul.adapters.LetterAdapter
import com.example.lykkehjul.R
import com.example.lykkehjul.WordsMemoryDB
import kotlinx.android.synthetic.main.fragment_game.*
import kotlinx.android.synthetic.main.fragment_result_game.*

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
                val letterIndex = getLetterIndex(wordToGuess, 'a')
                if (letterIndex != -1) {

                    var newWord = placeLetterInWordByIndex('a', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = countLetterInWord('a', wordToGuess)

                    points += count*tempPoint
                }

            }

        }

        b.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('b')
            if (isCorrectGuess) {
                val letterIndex = getLetterIndex(wordToGuess, 'b')
                if (letterIndex != -1) {

                    var newWord = placeLetterInWordByIndex('b', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = countLetterInWord('b', wordToGuess)

                    points += count*tempPoint
                }

            }

        }

        c.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('c')
            if (isCorrectGuess) {
                val letterIndex = getLetterIndex(wordToGuess, 'c')
                if (letterIndex != -1) {

                    var newWord = placeLetterInWordByIndex('c', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = countLetterInWord('c', wordToGuess)

                    points += count*tempPoint
                }

            }

        }

        d.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('d')
            if (isCorrectGuess) {
                val letterIndex = getLetterIndex(wordToGuess, 'd')
                if (letterIndex != -1) {

                    var newWord = placeLetterInWordByIndex('d', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = countLetterInWord('d', wordToGuess)

                    points += count*tempPoint

                }

            }

        }
        e.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('e')
            if (isCorrectGuess) {
                val letterIndex = getLetterIndex(wordToGuess, 'e')
                if (letterIndex != -1) {

                    var newWord = placeLetterInWordByIndex('e', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = countLetterInWord('e', wordToGuess)

                    points += count*tempPoint
                }

            }

        }

        f.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('f')
            if (isCorrectGuess) {
                val letterIndex = getLetterIndex(wordToGuess, 'f')
                if (letterIndex != -1) {

                    var newWord = placeLetterInWordByIndex('f', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = countLetterInWord('f', wordToGuess)

                    points += count*tempPoint
                }

            }

        }
        g.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('g')
            if (isCorrectGuess) {
                val letterIndex = getLetterIndex(wordToGuess, 'g')
                if (letterIndex != -1) {

                    var newWord = placeLetterInWordByIndex('g', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = countLetterInWord('g', wordToGuess)

                    points += count*tempPoint
                }

            }

        }
        h.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('h')
            if (isCorrectGuess) {
                val letterIndex = getLetterIndex(wordToGuess, 'h')
                if (letterIndex != -1) {

                    var newWord = placeLetterInWordByIndex('h', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = countLetterInWord('h', wordToGuess)

                    points += count*tempPoint
                }

            }

        }

        i.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('i')
            if (isCorrectGuess) {
                val letterIndex = getLetterIndex(wordToGuess, 'i')
                if (letterIndex != -1) {

                    var newWord = placeLetterInWordByIndex('i', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = countLetterInWord('i', wordToGuess)

                    points += count*tempPoint
                }

            }

        }
        j.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('j')
            if (isCorrectGuess) {
                val letterIndex = getLetterIndex(wordToGuess, 'j')
                if (letterIndex != -1) {

                    var newWord = placeLetterInWordByIndex('j', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = countLetterInWord('j', wordToGuess)

                    points += count*tempPoint
                }

            }

        }
        k.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('k')
            if (isCorrectGuess) {
                val letterIndex = getLetterIndex(wordToGuess, 'k')
                if (letterIndex != -1) {

                    var newWord = placeLetterInWordByIndex('k', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = countLetterInWord('k', wordToGuess)

                    points += count*tempPoint
                }

            }

        }
        l.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('l')
            if (isCorrectGuess) {
                val letterIndex = getLetterIndex(wordToGuess, 'l')
                if (letterIndex != -1) {

                    var newWord = placeLetterInWordByIndex('l', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = countLetterInWord('l', wordToGuess)

                    points += count*tempPoint
                }

            }

        }
        m.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('m')
            if (isCorrectGuess) {
                val letterIndex = getLetterIndex(wordToGuess, 'm')
                if (letterIndex != -1) {

                    var newWord = placeLetterInWordByIndex('m', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = countLetterInWord('m', wordToGuess)

                    points += count*tempPoint
                }

            }

        }

        n.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('n')
            if (isCorrectGuess) {
                val letterIndex = getLetterIndex(wordToGuess, 'n')
                if (letterIndex != -1) {

                    var newWord = placeLetterInWordByIndex('n', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = countLetterInWord('n', wordToGuess)

                    points += count*tempPoint
                }

            }

        }

        o.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('o')
            if (isCorrectGuess) {
                val letterIndex = getLetterIndex(wordToGuess, 'o')
                if (letterIndex != -1) {

                    var newWord = placeLetterInWordByIndex('o', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = countLetterInWord('o', wordToGuess)

                    points += count*tempPoint
                }

            }

        }
        p.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('p')
            if (isCorrectGuess) {
                val letterIndex = getLetterIndex(wordToGuess, 'p')
                if (letterIndex != -1) {

                    var newWord = placeLetterInWordByIndex('p', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = countLetterInWord('p', wordToGuess)

                    points += count*tempPoint
                }

            }

        }

        q.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('q')
            if (isCorrectGuess) {
                val letterIndex = getLetterIndex(wordToGuess, 'q')
                if (letterIndex != -1) {

                    var newWord = placeLetterInWordByIndex('q', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = countLetterInWord('q', wordToGuess)

                    points += count*tempPoint
                }

            }

        }
        r.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('r')
            if (isCorrectGuess) {
                val letterIndex = getLetterIndex(wordToGuess, 'r')
                if (letterIndex != -1) {

                    var newWord = placeLetterInWordByIndex('r', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = countLetterInWord('r', wordToGuess)

                    points += count*tempPoint
                }

            }

        }

        s.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('s')
            if (isCorrectGuess) {
                val letterIndex = getLetterIndex(wordToGuess, 's')
                if (letterIndex != -1) {

                    var newWord = placeLetterInWordByIndex('s', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = countLetterInWord('s', wordToGuess)

                    points += count*tempPoint
                }

            }

        }
        t.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('t')
            if (isCorrectGuess) {
                val letterIndex = getLetterIndex(wordToGuess, 't')
                if (letterIndex != -1) {

                    var newWord = placeLetterInWordByIndex('t', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = countLetterInWord('t', wordToGuess)

                    points += count*tempPoint
                }

            }

        }
        u.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('u')
            if (isCorrectGuess) {
                val letterIndex = getLetterIndex(wordToGuess, 'u')
                if (letterIndex != -1) {

                    var newWord = placeLetterInWordByIndex('u', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = countLetterInWord('u', wordToGuess)

                    points += count*tempPoint
                }

            }

        }
        v.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('v')
            if (isCorrectGuess) {
                val letterIndex = getLetterIndex(wordToGuess, 'v')
                if (letterIndex != -1) {

                    var newWord = placeLetterInWordByIndex('v', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = countLetterInWord('v', wordToGuess)

                    points += count*tempPoint
                }

            }

        }
        w.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('w')
            if (isCorrectGuess) {
                val letterIndex = getLetterIndex(wordToGuess, 'w')
                if (letterIndex != -1) {

                    var newWord = placeLetterInWordByIndex('w', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = countLetterInWord('w', wordToGuess)

                    points += count*tempPoint
                }

            }

        }
        x.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('x')
            if (isCorrectGuess) {
                val letterIndex = getLetterIndex(wordToGuess, 'x')
                if (letterIndex != -1) {

                    var newWord = placeLetterInWordByIndex('x', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = countLetterInWord('x', wordToGuess)

                    points += count*tempPoint
                }

            }

        }
        y.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('y')
            if (isCorrectGuess) {
                val letterIndex = getLetterIndex(wordToGuess, 'y')
                if (letterIndex != -1) {

                    var newWord = placeLetterInWordByIndex('y', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = countLetterInWord('y', wordToGuess)

                    points += count*tempPoint
                }

            }

        }
        z.setOnClickListener {
            val isCorrectGuess = wordToGuess.contains('z')
            if (isCorrectGuess) {
                val letterIndex = getLetterIndex(wordToGuess, 'z')
                if (letterIndex != -1) {

                    var newWord = placeLetterInWordByIndex('z', temp, letterIndex)
                    adapter.data = newWord.toCharArray()
                    adapter.notifyDataSetChanged()

                    var count = countLetterInWord('z', wordToGuess)

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

    private fun showGameLost(wordToGuess: String) {
        if (lives<=0){
            layout_you_lose.visibility = View.VISIBLE
            layout_you_win.visibility = View.GONE
            textView_lost_show_word.text = "The word was $wordToGuess"
            val action = GameFragmentDirections.actionGameFragmentToGameResultFragment()
            findNavController().navigate(action)
        }
    }
    private fun showGameWon() {
        if (lives <= 0) {
            layout_you_lose.visibility = View.GONE
            textView_you_win.visibility = View.VISIBLE
            val action = GameFragmentDirections.actionGameFragmentToGameResultFragment()
            findNavController().navigate(action)
        }

    }

    fun getLetterIndex(word: String, letter: Char): Int {
        for ((index, value) in word.withIndex()) {
            if (letter == value)
                return index
        }
        return -1
    }

    fun placeLetterInWordByIndex(letter: Char, word: String, index: Int): String {

        val chars = word.toCharArray()

        chars[index] = letter
        return String(chars)
    }

    fun countLetterInWord(letter: Char, word: String): Int {
        var count = 0
        for (i in 0..word.length - 1) {
            if (letter == word[i]) {
                count = +1
            }
        }
        return count
    }

}
