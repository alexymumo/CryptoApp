package com.alexmumo.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "coin_table")
data class CoinEntity(
    @PrimaryKey
    val id: Int,
    val logo: String,
    val name: String,
    val priority: Int,
    val symbol: String
)
