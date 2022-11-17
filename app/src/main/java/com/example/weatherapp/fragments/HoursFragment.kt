package com.example.weatherapp.fragments

import adapters.WeatherAdapter
import adapters.WeatherModel
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weatherapp.R
import com.example.weatherapp.databinding.FragmentHoursBinding

class HoursFragment : Fragment() {
    private lateinit var binding: FragmentHoursBinding
    private lateinit var adapter: WeatherAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHoursBinding.inflate(inflater, container, false)
        return binding.root //inflater.inflate(R.layout.fragment_hours, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRcView()
    }

    private fun initRcView() = with(binding){
        rcView.layoutManager = LinearLayoutManager(activity)
        adapter = WeatherAdapter()
        rcView.adapter = adapter
        val list = listOf(
            WeatherModel(
                "",
                "12:00",
                "Sunny",
                "25 C",
                "",
                "",
                "",
                ""
            ),
            WeatherModel(
                "",
                "15:00",
                "Sunny",
                "15 C",
                "",
                "",
                "",
                ""
            ),
            WeatherModel(
                "",
                "18:00",
                "Sunny",
                "25 C",
                "",
                "",
                "",
                ""
            ),
            WeatherModel(
                "",
                "19:00",
                "Sunny",
                "25 C",
                "",
                "",
                "",
                ""
            ),
        )
        adapter.submitList(list)
    }

    companion object {

        @JvmStatic
        fun newInstance() = HoursFragment()
    }
}