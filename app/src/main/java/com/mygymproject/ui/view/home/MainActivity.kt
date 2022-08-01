package com.mygymproject.ui.view.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.mygymproject.R
import com.mygymproject.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.util.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Retrieve NavController from the NavHostFragment
        val navHostFragment = binding.navHostFragment.getFragment() as NavHostFragment
        navController = navHostFragment.navController

        //  binding.bnvMainNavigation.setOnNavigationItemSelectedListener(this)
        binding.bnvMainNavigation.setupWithNavController(navController)
    }
}