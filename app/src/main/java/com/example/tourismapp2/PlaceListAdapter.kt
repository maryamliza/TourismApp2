package com.example.tourismapp2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tourismapp2.databinding.ItemPlaceBinding

class PlaceListAdapter(
    private val objList: List<Place>
) : RecyclerView.Adapter<PlaceListAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemPlaceBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemPlaceBinding.inflate(inflater,parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val obj = objList[position]
        val binding = holder.binding
        binding.tvName.text = obj.name
        binding.tvStatus.text=obj.status
    }

    override fun getItemCount(): Int {
        return objList.size
    }
}