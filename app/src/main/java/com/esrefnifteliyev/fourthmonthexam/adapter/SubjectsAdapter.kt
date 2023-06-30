package com.esrefnifteliyev.fourthmonthexam.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.esrefnifteliyev.fourthmonthexam.databinding.SubjectsRecyclerviewBinding
import com.esrefnifteliyev.fourthmonthexam.model.Subjects

class SubjectsAdapter(val context: Context,val list: List<Subjects>): RecyclerView.Adapter<SubjectsAdapter.SubjectsViewHolder>() {

    inner class SubjectsViewHolder(val binding: SubjectsRecyclerviewBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubjectsViewHolder {
        val binding = SubjectsRecyclerviewBinding.inflate(LayoutInflater.from(context),parent,false)
        return SubjectsViewHolder(binding)
    }

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onBindViewHolder(holder: SubjectsViewHolder, position: Int) {
        val view = holder.binding
        val element = list[position]

        view.imageSubjects.setImageResource(element.image)
        view.subText.text = element.title
    }

}