package com.kt.diggingrefrigerator.presentation.base

import android.app.Application
import androidx.room.RoomDatabase
import com.kt.diggingrefrigerator.data.RoomDB

object App: Application() {

    override fun onCreate() {
        super.onCreate()

        RoomDB.initialize(applicationContext)
    }
}