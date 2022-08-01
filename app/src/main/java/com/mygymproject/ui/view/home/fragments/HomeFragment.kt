package com.mygymproject.ui.view.home.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.melvin.ongandroid.view.adapters.testimonials.ActivitiesAdapter
import com.mygymproject.R
import com.mygymproject.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.apply {
            lifecycleOwner = viewLifecycleOwner
        }
        initComponent()
    }

    private fun initComponent() {
        initRecyclerView()

//        viewModel.apiStatus.observe(viewLifecycleOwner, Observer {
//            if (it == Errors.ALL) {
//                onLoadError(resources.getString(R.string.generalError)) { viewModel.refresh() }
//            }
//        })
    }

    //This function init the recyclerView
    private fun initRecyclerView() {
        binding.rvActivities.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.rvActivities.adapter = ActivitiesAdapter()

    }

}