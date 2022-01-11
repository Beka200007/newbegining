package com.beka.newbegining

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.beka.newbegining.databinding.FragmentMenuBinding
import com.beka.newbegining.databinding.FragmentReelsBinding

class Reels : Fragment() {
    lateinit var binding: FragmentReelsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentReelsBinding.inflate(LayoutInflater.from(context))
        return binding.root
    }

}