package com.alexmumo.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.alexmumo.local.dao.CoinDao
import com.alexmumo.local.entity.CoinEntity

@Database(entities = [CoinEntity::class], version = 2, exportSchema = false)
abstract class CoinDatabase: RoomDatabase() {
    abstract fun coinDao(): CoinDao
}