package com.kt.diggingrefrigerator.presentation.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kt.diggingrefrigerator.R
import com.kt.diggingrefrigerator.databinding.FragmentHomeBinding
import com.kt.diggingrefrigerator.presentation.base.BaseFragment
import com.kt.diggingrefrigerator.presentation.view.dialog.AddIngredientDialog
import com.kt.diggingrefrigerator.presentation.viewModel.HomeViewModel

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {

    override fun initialize() {
        super.initialize()

        binding.homeAddIngredient.setOnClickListener {
            showAddDialog()
        }

    }

    override fun onResume() {
        super.onResume()
    }

    private fun showAddDialog() {
        AddIngredientDialog().show(childFragmentManager, null)
    }

}