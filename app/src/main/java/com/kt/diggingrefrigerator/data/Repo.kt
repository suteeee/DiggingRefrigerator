package com.kt.diggingrefrigerator.data

import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

object Repo {

    suspend fun loadAllIngredients(): List<String> {
        return suspendCoroutine { continuation ->
            continuation.resume(RoomDB.recipeDB.recipeDAO().loadAllIngredients())
        }
    }


}