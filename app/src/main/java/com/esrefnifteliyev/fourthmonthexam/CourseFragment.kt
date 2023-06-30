package com.esrefnifteliyev.fourthmonthexam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.esrefnifteliyev.fourthmonthexam.adapter.CourseAdapter
import com.esrefnifteliyev.fourthmonthexam.databinding.FragmentCourseBinding
import com.esrefnifteliyev.fourthmonthexam.model.Course

class CourseFragment : Fragment() {
    private lateinit var binding: FragmentCourseBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCourseBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val courseList = mutableListOf<Course>(
            Course(R.drawable.recyc1,"How to make your design more artful & lyrical","Lorem ipsum dolor sit amet, consec tetur adipiscing elit."),
            Course(R.drawable.recyc2,"How to make your paper more powerful and high value","Lorem ipsum dolor sit amet, consec tetur adipiscing elit."),
            Course(R.drawable.recyc3,"How to prepare your documentation assigment","Lorem ipsum dolor sit amet, consec tetur adipiscing elit."),
        )

        val courseAdapter = CourseAdapter(requireContext(),courseList)
        binding.courseRecyclerView.adapter = courseAdapter
        binding.courseRecyclerView.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)

    }


}