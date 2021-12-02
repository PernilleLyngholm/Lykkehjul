package com.example.lykkehjul.logic

import com.example.lykkehjul.WordsMemoryDB.birds
import com.example.lykkehjul.WordsMemoryDB.capitals
import com.example.lykkehjul.WordsMemoryDB.wordList
import com.example.lykkehjul.WordsMemoryDB.dkCities
import com.example.lykkehjul.WordsMemoryDB.fruits
import com.example.lykkehjul.WordsMemoryDB.harryPotter
import com.example.lykkehjul.WordsMemoryDB.holidays
import com.example.lykkehjul.WordsMemoryDB.marvelCharacters
import com.example.lykkehjul.WordsMemoryDB.mixedAnimals
import com.example.lykkehjul.WordsMemoryDB.space
import com.example.lykkehjul.WordsMemoryDB.usStates
import com.example.lykkehjul.WordsMemoryDB.vegetables
import com.example.lykkehjul.WordsMemoryDB.waterAnimals
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
