package com.alexmumo.domain.usecases

import com.alexmumo.common.Resource
import com.alexmumo.domain.model.Coin
import com.alexmumo.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(private val coinRepository: CoinRepository) {
    operator fun invoke() : Flow<Resource<List<Coin>>> = flow {
        try {
            val coins = coinRepository.fetchCoins().map { it }
            emit(Resource.Success(data = null))
        } catch (e: IOException) {
            emit(Resource.Error("An error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("An error occurred"))
        }
    }
}