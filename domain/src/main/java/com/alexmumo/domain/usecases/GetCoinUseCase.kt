package com.alexmumo.domain.usecases

import com.alexmumo.common.Resource
import com.alexmumo.domain.model.Coin
import com.alexmumo.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException

class GetCoinUseCase(private val coinRepository: CoinRepository) {

    operator fun invoke() : Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading())
            val coins = coinRepository.fetchCoins()
            emit(Resource.Success(data = null))
        } catch (e: IOException) {
            emit(Resource.Error("An error occurred"))
        }
    }
}