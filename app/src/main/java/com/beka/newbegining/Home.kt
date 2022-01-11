package com.beka.newbegining

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.beka.newbegining.databinding.FragmentHomeBinding
import com.beka.newbegining.databinding.FragmentSplashBinding


class Home : Fragment() {
    lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentHomeBinding.inflate(LayoutInflater.from(context))
        binding.menu.setOnClickListener {
            findNavController().navigate(R.id.menu)
        }
        return binding.root
    }
}