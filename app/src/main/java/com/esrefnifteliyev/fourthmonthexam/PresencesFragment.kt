package com.esrefnifteliyev.fourthmonthexam

import android.animation.LayoutTransition
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.esrefnifteliyev.fourthmonthexam.databinding.FragmentPresencesBinding

class PresencesFragment : Fragment() {
    private lateinit var binding: FragmentPresencesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPresencesBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.layout.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
        binding.layout2.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
        binding.layout3.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)

        binding.click.setOnClickListener {
            val v = if (binding.layout.visibility == View.GONE) View.VISIBLE else View.GONE
            binding.layout.visibility = v
        }

        binding.click2.setOnClickListener {
            val v = if (binding.layout2.visibility == View.GONE) View.VISIBLE else View.GONE
            binding.layout2.visibility = v
        }

        binding.click3.setOnClickListener {
            val v = if (binding.layout3.visibility == View.GONE) View.VISIBLE else View.GONE
            binding.layout3.visibility = v
        }

    }


}