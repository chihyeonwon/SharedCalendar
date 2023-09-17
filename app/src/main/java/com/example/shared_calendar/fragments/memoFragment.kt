package com.example.shared_calendar.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.shared_calendar.R
import com.example.shared_calendar.databinding.FragmentMemoBinding

class memoFragment : Fragment() {

    private lateinit var binding: FragmentMemoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_memo, container, false)

        binding.addTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_memoFragment_to_addFragment)
        }

        binding.notifyTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_memoFragment_to_notifyFragment)
        }

        binding.calendarTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_memoFragment_to_calendarFragment)
        }

        binding.settingTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_memoFragment_to_settingFragment)
        }

        return binding.root
    }
}