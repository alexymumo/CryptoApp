package com.alexmumo.repository.repository

import com.alexmumo.common.Resource
import com.alexmumo.domain.model.Coin
import com.alexmumo.domain.repository.CoinRepository
import com.alexmumo.network.api.CoinMapApi
import com.alexmumo.local.dao.CoinDao
import com.alexmumo.repository.mappers.toDomain
import com.alexmumo.repository.mappers.toEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(private val coinDao: CoinDao, private val coinMapApi: CoinMapApi): CoinRepository {
    override suspend fun fetchCoins(): Flow<Resource<List<Coin>>> = flow {
        emit(Resource.Loading())
        val getDataFromDb = coinDao.getCoins().map { it.toDomain() }
        emit(Resource.Success(data = getDataFromDb))
        try {
            val response = coinMapApi.getCoins().map { it.toEntity() }
            coinDao.deleteCoin()
            coinDao.saveCoin(response)
        } catch (e: IOException) {
            emit(Resource.Error(message = "An error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error(message = "An error occurred"))
        }
        val coins = coinDao.getCoins().map { it.toDomain() }
        emit(Resource.Success(coins))
    }
}