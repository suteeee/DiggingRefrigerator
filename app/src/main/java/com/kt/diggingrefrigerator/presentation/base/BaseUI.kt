package com.kt.diggingrefrigerator.presentation.base

interface BaseUI<V> {
    var _binding: V?
    val binding get() = _binding!!

    fun initialize() {}
    fun setupUI() {}
    fun deinitialize() {}
}