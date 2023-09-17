package com.example.shared_calendar.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.shared_calendar.R
import com.example.shared_calendar.databinding.FragmentAddBinding

class addFragment : Fragment() {

    private lateinit var binding:FragmentAddBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add, container, false)

        binding.calendarTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_addFragment_to_calendarFragment)
        }

        binding.memoTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_addFragment_to_memoFragment)
        }

        binding.notifyTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_addFragment_to_notifyFragment)
        }

        binding.settingTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_addFragment_to_settingFragment)
        }

        return binding.root
    }
}