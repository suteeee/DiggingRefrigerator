package com.kt.diggingrefrigerator.presentation.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class BaseFragment<V: ViewDataBinding>(@LayoutRes val layoutID: Int) : Fragment(), BaseUI<V> {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DataBindingUtil.bind(layoutInflater.inflate(layoutID, null))
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initialize()
        setupUI()
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        deinitialize()
        _binding = null
    }

}