package com.example.lykkehjul.screens.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lykkehjul.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment: Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        playButton.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToGameFragment()
            findNavController().navigate(action)
        }

        categoryButton.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToCategoryFragment()
            findNavController().navigate(action)
        }


    }

}