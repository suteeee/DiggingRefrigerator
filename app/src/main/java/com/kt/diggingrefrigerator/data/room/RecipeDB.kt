package com.kt.diggingrefrigerator.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.kt.diggingrefrigerator.model.RecipeDefaultEntry
import com.kt.diggingrefrigerator.model.RecipeExplainEntity
import com.kt.diggingrefrigerator.model.RecipeIngredientEntry

@Database(entities = [RecipeDefaultEntry::class, RecipeExplainEntity::class, RecipeIngredientEntry::class], version = 1)
abstract class RecipeDB: RoomDatabase() {
    abstract fun recipeDAO() : RecipeDAO
}