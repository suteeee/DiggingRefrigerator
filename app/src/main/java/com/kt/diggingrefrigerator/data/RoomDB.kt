package com.kt.diggingrefrigerator.data

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.kt.diggingrefrigerator.data.room.RecipeDB

object RoomDB {
    lateinit var recipeDB: RecipeDB

    fun initialize(context: Context) {
        recipeDB = initDB(context, RecipeDB::class.java, "Recipe.db")
    }

    private  fun <T: RoomDatabase> initDB(context:Context, klass: Class<T>, name: String): T {
        return Room.databaseBuilder(context, klass, name)
            .createFromAsset("database/$name")
            .build()
    }
}