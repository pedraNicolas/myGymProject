package com.melvin.ongandroid.view.adapters.testimonials

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mygymproject.databinding.ItemActivitiesBinding


class ActivitiesViewHolder(
    private val binding: ItemActivitiesBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun render() {
        Glide.with(binding.ivActivities.context)
            .load("https://img2.freepng.es/20180407/zve/kisspng-logo-physical-fitness-fitness-centre-gym-5ac8cacc6a0366.8946320415231085564342.jpg")
            .into(binding.ivActivities)

    }

}