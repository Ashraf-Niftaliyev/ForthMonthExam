package com.esrefnifteliyev.fourthmonthexam.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.esrefnifteliyev.fourthmonthexam.databinding.CourseRecyclerviewBinding
import com.esrefnifteliyev.fourthmonthexam.model.Course

class CourseAdapter(var context: Context, var list: List<Course>): RecyclerView.Adapter<CourseAdapter.CourseViewModel>() {

    inner class CourseViewModel(val binding: CourseRecyclerviewBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewModel {
        val binding = CourseRecyclerviewBinding.inflate(LayoutInflater.from(context),parent,false)
        return CourseViewModel(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: CourseViewModel, position: Int) {
        val view = holder.binding
        val element = list[position]

        view.recycImage.setImageResource(element.image)
        view.recycText1.text = element.title1
        view.recycText2.text = element.title2
    }


}