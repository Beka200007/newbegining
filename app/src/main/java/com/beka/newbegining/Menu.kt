package com.beka.newbegining

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.beka.newbegining.Adapters.Horadapter
import com.beka.newbegining.databinding.FragmentHomeBinding
import com.beka.newbegining.databinding.FragmentMenuBinding
import com.beka.newbegining.models.Horadaptersmodel
import kotlinx.android.synthetic.main.fragment_menu.*


class Menu : Fragment() {
lateinit var horadapter:Horadapter
lateinit var binding: FragmentMenuBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentMenuBinding.inflate(LayoutInflater.from(context))
        var itemlist=ArrayList<Horadaptersmodel>()
        for (i in 0..100){
            itemlist.add(Horadaptersmodel(R.drawable.facevook, "Android"))
            itemlist.add(Horadaptersmodel(R.drawable.instagram, "Java"))
        }
        horadapter= Horadapter(requireContext(),itemlist)
        binding.home.setOnClickListener {
            findNavController().navigate(R.id.home3)
        }
        binding.rv1.adapter=horadapter

        return binding.root
    }
   
}