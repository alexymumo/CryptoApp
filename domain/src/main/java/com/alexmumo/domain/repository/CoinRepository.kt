package com.alexmumo.domain.repository

import com.alexmumo.domain.model.Coin

interface CoinRepository {
    suspend fun fetchCoins(): List<Coin>
}