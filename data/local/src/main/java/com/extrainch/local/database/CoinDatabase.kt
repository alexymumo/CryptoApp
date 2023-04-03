package com.extrainch.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.extrainch.local.dao.CoinDao
import com.extrainch.local.entity.CoinEntity

@Database(entities = [CoinEntity::class], version = 1, exportSchema = false)
abstract class CoinDatabase: RoomDatabase() {
    abstract fun coinDao(): CoinDao
}