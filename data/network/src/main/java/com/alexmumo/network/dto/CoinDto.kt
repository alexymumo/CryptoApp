package com.alexmumo.network.dto

import kotlinx.serialization.Serializable

@Serializable
data class CoinDto(
    val id: Int,
    val logo: String,
    val name: String,
    val priority: Int,
    val symbol: String
)
