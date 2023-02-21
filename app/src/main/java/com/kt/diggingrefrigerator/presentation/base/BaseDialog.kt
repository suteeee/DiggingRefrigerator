package com.kt.diggingrefrigerator.presentation.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseDialog<V:ViewDataBinding>(@LayoutRes val layoutID: Int) : AppCompatDialogFragment(), BaseUI<V> {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DataBindingUtil.bind(inflater.inflate(layoutID, null))
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initialize()
        setupUI()
    }

    override fun onDestroy() {
        super.onDestroy()
        deinitialize()
        _binding = null
    }

}