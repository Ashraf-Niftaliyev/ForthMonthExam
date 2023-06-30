package com.esrefnifteliyev.fourthmonthexam.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.esrefnifteliyev.fourthmonthexam.databinding.LineRecyclerviewBinding
import com.esrefnifteliyev.fourthmonthexam.model.Day

class DayAdapter(var context: Context,var list: List<Day>) : RecyclerView.Adapter<DayAdapter.DayViewHolder>(){

   inner class DayViewHolder(val binding: LineRecyclerviewBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DayViewHolder {
        val binding = LineRecyclerviewBinding.inflate(LayoutInflater.from(context),parent,false)
        return DayViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: DayViewHolder, position: Int) {
         val view = holder.binding
         val element = list[position]

         view.day.text = element.day.toString()
    }


}