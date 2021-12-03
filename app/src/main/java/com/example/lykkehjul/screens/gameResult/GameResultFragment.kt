package com.example.lykkehjul.screens.gameResult

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lykkehjul.R
import com.example.lykkehjul.screens.category.CategoryFragmentDirections
import kotlinx.android.synthetic.main.fragment_result_game.*

class GameResultFragment: Fragment(R.layout.fragment_result_game) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tryAgainButton.setOnClickListener {
            val action = GameResultFragmentDirections.actionGameResultFragmentToGameFragment()
            findNavController().navigate(action)
        }

    }
}