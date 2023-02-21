package com.kt.diggingrefrigerator.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.kt.diggingrefrigerator.R
import com.kt.diggingrefrigerator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        initNavigation()
    }


    private fun initNavigation() {

        NavigationUI.setupWithNavController(binding.bottomNavigationView, findNavController(R.id.fragmentContainerView))
    }
}