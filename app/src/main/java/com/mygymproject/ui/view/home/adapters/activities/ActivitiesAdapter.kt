package com.melvin.ongandroid.view.adapters.testimonials

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mygymproject.data.model.activities.ActivityModel
import com.mygymproject.databinding.ItemActivitiesBinding

class ActivitiesAdapter(
private val list:List<ActivityModel>
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
        val item = list[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = list.size
}