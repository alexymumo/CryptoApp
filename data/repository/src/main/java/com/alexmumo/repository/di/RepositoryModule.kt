package com.alexmumo.repository.di

import com.alexmumo.domain.repository.CoinRepository
import com.alexmumo.local.dao.CoinDao
import com.alexmumo.local.database.CoinDatabase
import com.alexmumo.network.api.CoinMapApi
import com.alexmumo.repository.repository.CoinRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideCoinRepository(coinDatabase: CoinDatabase, coinMapApi: CoinMapApi): CoinRepository {
        return CoinRepositoryImpl(coinDatabase.coinDao(), coinMapApi)
    }
}