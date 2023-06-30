package com.esrefnifteliyev.fourthmonthexam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.esrefnifteliyev.fourthmonthexam.adapter.DayAdapter
import com.esrefnifteliyev.fourthmonthexam.databinding.FragmentHomeBinding
import com.esrefnifteliyev.fourthmonthexam.model.Day

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
         var dayList = mutableListOf<Day>(
             Day(7),
             Day(8),
             Day(9),
             Day(10),
             Day(11),
             Day(12),
             Day(13),
             Day(14),
             Day(15),
             Day(16),
         )

        val dayAdapter = DayAdapter(requireContext(),dayList)
        binding.recyclerView.adapter = dayAdapter
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)


        binding.firstMini.setOnClickListener {
            findNavController().navigate(R.id.courseFragment)
        }

        binding.secondMini.setOnClickListener {
            findNavController().navigate(R.id.subjectsFragment)
        }

        binding.forthMini.setOnClickListener {
            findNavController().navigate(R.id.presencesFragment)
        }

    }
}