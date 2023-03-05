package com.kt.diggingrefrigerator.presentation.view.dialog

import androidx.lifecycle.ViewModel
import com.kt.diggingrefrigerator.data.Repo

class AddIngredientViewModel: ViewModel() {

    suspend fun loadAllIngredients(): List<String> {
        return Repo.loadAllIngredients()
    }
}