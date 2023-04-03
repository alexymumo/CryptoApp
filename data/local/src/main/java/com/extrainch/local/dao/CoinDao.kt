package com.extrainch.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.extrainch.local.entity.CoinEntity

@Dao
interface CoinDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveCoin(coinEntity: List<CoinEntity>)

    @Delete
    suspend fun deleteCoin(coinEntity: CoinEntity)
}