package com.alexmumo.repository.repository

import com.alexmumo.domain.model.Coin
import com.alexmumo.domain.repository.CoinRepository
import com.extrainch.local.dao.CoinDao

class CoinRepositoryImpl(private val coinDao: CoinDao, private val coinRepository: CoinRepository): CoinRepository {
    override suspend fun fetchCoins(): List<Coin> {
        TODO("Not yet implemented")
    }
}