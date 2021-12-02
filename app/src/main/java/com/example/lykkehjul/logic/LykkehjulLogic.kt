package com.example.lykkehjul.logic

import com.example.lykkehjul.WordsMemoryDB
import kotlinx.android.synthetic.main.fragment_game.*

object LykkehjulLogic {

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



