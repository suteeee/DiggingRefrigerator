package com.kt.diggingrefrigerator.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavHost
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.kt.diggingrefrigerator.R
import com.kt.diggingrefrigerator.databinding.ActivityMainBinding
import com.kt.diggingrefrigerator.presentation.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override var _binding: ActivityMainBinding? = null
    val navHostFragment get() = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initNavigation()
    }


    private fun initNavigation() {
        binding.bottomNavigationView.setupWithNavController(navHostFragment.navController)
    }
}