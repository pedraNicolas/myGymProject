package com.melvin.ongandroid.view.adapters.testimonials

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mygymproject.databinding.ItemActivitiesBinding

class ActivitiesAdapter(

) : RecyclerView.Adapter<ActivitiesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActivitiesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemActivitiesBinding.inflate(
            layoutInflater,
            parent,
            false
        )
        return ActivitiesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ActivitiesViewHolder, position: Int) {
        //val item = list[position]
        holder.render()
    }

    override fun getItemCount(): Int = 4
}