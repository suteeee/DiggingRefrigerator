package com.kt.diggingrefrigerator.presentation.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<V: ViewDataBinding>(@LayoutRes val layoutID: Int = 0): AppCompatActivity(), BaseUI<V> {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = DataBindingUtil.setContentView(this, layoutID)

        initialize()
        setupUI()
    }

    override fun onDestroy() {
        super.onDestroy()

        deinitialize()

        _binding = null
    }
}