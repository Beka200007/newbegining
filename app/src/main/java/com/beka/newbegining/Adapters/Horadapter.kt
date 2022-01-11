package com.beka.newbegining.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.beka.newbegining.databinding.ItemRv1Binding
import com.beka.newbegining.models.Horadaptersmodel

class Horadapter(val context: Context, val list: ArrayList<Horadaptersmodel>): RecyclerView.Adapter<Horadapter.Vh>(){
    inner class Vh( val itemRv1: ItemRv1Binding): RecyclerView.ViewHolder(itemRv1.root){
        fun onBind(item12: Horadaptersmodel, position: Int){
            itemRv1.image1.setImageResource(item12.image)
            itemRv1.txt1.text=item12.name

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Horadapter.Vh {
        return Vh(ItemRv1Binding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Horadapter.Vh, position: Int) {
        holder.onBind(list[position],position)
    }

    override fun getItemCount(): Int = list.size

    }