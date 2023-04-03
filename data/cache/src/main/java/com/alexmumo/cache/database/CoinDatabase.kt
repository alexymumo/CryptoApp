package com.alexmumo.cache.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.alexmumo.cache.dao.CoinDao
import com.alexmumo.cache.entity.CoinEntity

@Database(entities = [CoinEntity::class], version = 1, exportSchema = false)
abstract class CoinDatabase : RoomDatabase() {
    abstract fun coinDao(): CoinDao
}