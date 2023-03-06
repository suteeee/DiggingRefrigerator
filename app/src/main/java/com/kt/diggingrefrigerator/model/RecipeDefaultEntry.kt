package com.kt.diggingrefrigerator.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "RecipeDefualtInfo")
data class RecipeDefaultEntry(
    @PrimaryKey(autoGenerate = true) val recipeCode: Int,
    val recipeName: String,
    val recipeSummary: String,
    val recipeTypeCode: Int,
    val recipeTypeName: String,
    val foodTypeCode: Int,
    val foodTypeName: String,
    val cookingTime: String,
    val kcal: String,
    val foodAmount: String,
    val cookDifficulty: String,
    val foodIngredientTypeName: String?,
    val foodPrice: String?,
    val recipeImageURL: String,
    val recipeDetailURL: String
)
