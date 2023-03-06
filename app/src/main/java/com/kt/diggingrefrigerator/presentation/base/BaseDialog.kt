package com.kt.diggingrefrigerator.presentation.base

import android.content.Context
import android.graphics.Point
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseDialog<V:ViewDataBinding>(@LayoutRes val layoutID: Int) : AppCompatDialogFragment(), BaseUI<V> {
    override var _binding: V? = null

    var width = 0.8f
    var height = 0.6f

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

    override fun onResume() {
        super.onResume()
        initDialogSize()
    }

    private fun initDialogSize() {
        val wm = requireContext().getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val window = dialog?.window

        val x: Int
        val y: Int

        if (Build.VERSION.SDK_INT < 30) {
            val display = wm.defaultDisplay
            val size = Point()
            display.getSize(size)
            x = (size.x * width).toInt()
            y = (size.y * height).toInt()

            window?.setLayout(x, y)
        } else {
            val rect = wm.currentWindowMetrics.bounds
            x = (rect.width() * width).toInt()
            y = (rect.height() * height).toInt()
        }

        window?.setLayout(x, y)
    }


}