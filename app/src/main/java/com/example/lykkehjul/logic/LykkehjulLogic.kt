package com.example.lykkehjul.logic

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
}