package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemOneBinding
import com.example.myapplication.databinding.ItemThreeBinding
import com.example.myapplication.databinding.ItemTwoBinding

/**
 * 2022-11-21
 * pureum
 */
class Adapter(private val list : List<Data>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun getItemViewType(position: Int): Int {
        return list[position].type
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return when(viewType){
            1 -> MyViewHoleder(ItemOneBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            2 -> MyViewHoleder2(ItemTwoBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            else -> MyViewHoleder3(ItemThreeBinding.inflate(LayoutInflater.from(parent.context), parent, false))
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(list[position].type){
            1 -> {
                (holder as MyViewHoleder).bind(list[position])
                //holder.setIsRecyclable(false)
        }
            2 -> {
                (holder as MyViewHoleder2).bind(list[position])
                //holder.setIsRecyclable(false)
            }
            else -> {
                (holder as MyViewHoleder3).bind(list[position])
                //holder.setIsRecyclable(false)
            }
        }
    }

    inner class MyViewHoleder(val binding: ItemOneBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(list :Data){
            binding.textView.text = list.Gimo
            binding.one.isChecked = true
        }
    }

    inner class MyViewHoleder2(val binding: ItemTwoBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(list :Data){
            binding.text2.text = list.Gimo
        }
    }

    inner class MyViewHoleder3(val binding: ItemThreeBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(list :Data){
            binding.text3.text = list.Gimo
        }
    }

    override fun getItemCount(): Int = list.size
}