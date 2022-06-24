package com.example.tourismapp2

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tourismapp2.databinding.ActivityMainBinding.inflate
import com.example.tourismapp2.databinding.FragmentCulturalBinding

class CulturalFragment : Fragment() {

    private lateinit var binding: FragmentCulturalBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCulturalBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
    }

    private fun setupViews() {
        val service = RetrofitManager.getService()
        service.getPlaces().onSuccess {
            Log.e("ML", it.toString())
        }

        val placeList = listOf<Place>(
            Place("Playa","","Abierto","",10.5,100.0,100.0,"8:00","20:00")
        )
        val recycler = binding.rcPlaces
        recycler.adapter= PlaceListAdapter(placeList)


    }

}