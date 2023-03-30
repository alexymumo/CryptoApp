package com.alexmumo.network.api

import com.alexmumo.network.dto.CoinDto
import retrofit2.http.GET

interface CoinMapApi {
    @GET("v1/coins/")
    suspend fun getCoins(): List<CoinDto>
}