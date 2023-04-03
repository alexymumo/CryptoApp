package com.alexmumo.domain.repository

import com.alexmumo.common.Resource
import com.alexmumo.domain.model.Coin
import kotlinx.coroutines.flow.Flow

interface CoinRepository {
    suspend fun fetchCoins(): Flow<Resource<List<Coin>>>
}