package com.alexmumo.repository.repository

import com.alexmumo.common.Resource
import com.alexmumo.domain.model.Coin
import com.alexmumo.domain.repository.CoinRepository
import com.alexmumo.network.api.CoinMapApi
import com.extrainch.local.dao.CoinDao
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException

class CoinRepositoryImpl(private val coinDao: CoinDao, private val coinMapApi: CoinMapApi): CoinRepository {
    override suspend fun fetchCoins(): Flow<Resource<List<Coin>>> = flow {

        emit(Resource.Loading())
        val getDataFromDb = coinDao
        //emit(Resource.Success(data = getDataFromDb))
        try {
            val response = coinMapApi.getCoins()
            coinDao.deleteCoin()
            //coinDao.saveCoin(response.map {  })
            Resource.Success(data = response)
        } catch (e: IOException) {
            emit(Resource.Error(message = "An error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error(message = "An error occurred"))
        }
        val coins = coinDao.getCoins()

        TODO("Mappers")
        ///emit(Resource.Success(coins))
    }

}