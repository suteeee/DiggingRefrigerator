package com.kt.diggingrefrigerator.data.room

import androidx.room.Dao
import androidx.room.Query

@Dao
interface RecipeDAO {

    @Query("select distinct IngredientName from RecipeIngredients")
    fun loadAllIngredients(): List<String>

}