package com.extrainch.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.extrainch.local.entity.CoinEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface CoinDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveCoin(coinEntity: List<CoinEntity>)

    @Query("DELETE FROM coin_table")
    suspend fun deleteCoin()

    @Query("SELECT * FROM coin_table")
    fun getCoins(): List<CoinEntity>
}