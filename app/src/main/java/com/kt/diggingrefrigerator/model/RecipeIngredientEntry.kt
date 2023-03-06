package com.kt.diggingrefrigerator.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "RecipeIngredients")
data class RecipeIngredientEntry(
    @PrimaryKey(autoGenerate = true) val ingredientIndex: Int,
    val recipeCode: Int,
    val ingredientName: String,
    val ingredientVolume: String,
    val ingredientTypeCode: Int,
    val ingredientTypeName: String
)



