package com.kt.diggingrefrigerator.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class RecipeExplainEntity(
    @PrimaryKey(autoGenerate = true) val explainIndex: Int,
    val recipeCode: Int,
    val cookExplainIndex: Int,
    val cookExplain: String,
    val cookExplainImageURL: String?,
    val cookTip: String?
)
