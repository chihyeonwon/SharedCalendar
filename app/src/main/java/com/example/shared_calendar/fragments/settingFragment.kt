package com.example.shared_calendar.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.shared_calendar.R
import com.example.shared_calendar.databinding.FragmentCalendarBinding
import com.example.shared_calendar.databinding.FragmentSettingBinding


class settingFragment : Fragment() {

    private lateinit var binding: FragmentSettingBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_setting, container, false)

        binding.addTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_settingFragment_to_addFragment)
        }

        binding.notifyTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_settingFragment_to_notifyFragment)
        }

        binding.memoTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_settingFragment_to_memoFragment)
        }

        binding.calendarTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_settingFragment_to_calendarFragment)
        }

        return binding.root
    }
}