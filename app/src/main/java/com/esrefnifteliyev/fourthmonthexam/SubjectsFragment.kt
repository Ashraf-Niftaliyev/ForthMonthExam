package com.esrefnifteliyev.fourthmonthexam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.esrefnifteliyev.fourthmonthexam.adapter.SubjectsAdapter
import com.esrefnifteliyev.fourthmonthexam.databinding.FragmentSubjectsBinding
import com.esrefnifteliyev.fourthmonthexam.model.Subjects

class SubjectsFragment : Fragment() {
    private lateinit var binding: FragmentSubjectsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSubjectsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val subjectsList = mutableListOf<Subjects>(
            Subjects(R.drawable.math,"Math"),
            Subjects(R.drawable.physics,"Physics"),
            Subjects(R.drawable.arts,"Arts"),
            Subjects(R.drawable.biology,"Biology"),
            Subjects(R.drawable.technology,"Technology"),
            Subjects(R.drawable.economy,"Economy"),
            Subjects(R.drawable.english,"English"),
            Subjects(R.drawable.geography,"Geography"),
            Subjects(R.drawable.chemical,"Chemical"),
        )

        val subjectsAdapter = SubjectsAdapter(requireContext(),subjectsList)
        binding.subjectsRecycler.adapter = subjectsAdapter
        binding.subjectsRecycler.layoutManager = GridLayoutManager(requireContext(),3,GridLayoutManager.VERTICAL,false)

    }

}