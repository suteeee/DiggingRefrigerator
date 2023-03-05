package com.kt.diggingrefrigerator.presentation.view.dialog

import android.widget.ArrayAdapter
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.kt.diggingrefrigerator.R
import com.kt.diggingrefrigerator.databinding.DialogAddIngredientBinding
import com.kt.diggingrefrigerator.presentation.base.BaseDialog
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class AddIngredientDialog(override var _binding: DialogAddIngredientBinding?) : BaseDialog<DialogAddIngredientBinding>(R.layout.dialog_add_ingredient) {
    val viewModel: AddIngredientViewModel by viewModels()

    override fun setupUI() {
        super.setupUI()

        initList()
    }

    private fun initList() = lifecycleScope.launch(Dispatchers.Main) {
        val adapter = withContext(Dispatchers.IO) {
            val list = viewModel.loadAllIngredients()
            ArrayAdapter(requireContext(), android.R.layout.simple_dropdown_item_1line, list)
        }

        binding.addIngTypeInput.setAdapter(adapter)
    }

}