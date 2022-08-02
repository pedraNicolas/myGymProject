package com.mygymproject.ui.view.home.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.melvin.ongandroid.view.adapters.testimonials.ActivitiesAdapter
import com.mygymproject.R
import com.mygymproject.data.model.activities.ActivityModel
import com.mygymproject.databinding.FragmentHomeBinding
import com.mygymproject.ui.viewmodel.HomeViewModel
import com.mygymproject.ui.viewmodel.Status
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val viewModel: HomeViewModel by viewModels()

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
        getActivities()

//        viewModel.apiStatus.observe(viewLifecycleOwner, Observer {
//            if (it == Errors.ALL) {
//                onLoadError(resources.getString(R.string.generalError)) { viewModel.refresh() }
//            }
//        })
    }

    //This function start the activities query, an gives the response to the recyclerview
    private fun getActivities() {
        viewModel.onCreate()
        viewModel.activityStatus.observe(viewLifecycleOwner) { status ->
            when (status!!) {
                Status.LOADING -> {}
                Status.SUCCESS -> {
                    viewModel.activity.observe(viewLifecycleOwner, Observer {
                        initRecyclerView(it)
                    })
                }
                Status.ERROR -> onLoadError(resources.getString(R.string.on_activities_loading_error)) {
                    viewModel.onCreate()
                }
            }
        }
    }
    private fun onLoadError(message: String, retryCB: () -> Unit) {
        Snackbar.make(binding.root, message, Snackbar.LENGTH_INDEFINITE)
            .setAction(resources.getString(R.string.retry)) { retryCB() }
            .show()
    }

    //This function init the recyclerView
    private fun initRecyclerView(list: List<ActivityModel>) {
        binding.rvActivities.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.rvActivities.adapter = ActivitiesAdapter(list)
    }

}