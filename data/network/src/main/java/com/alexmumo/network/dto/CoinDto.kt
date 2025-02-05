package com.alexmumo.network.dto


import kotlinx.serialization.Serializable

@Serializable
data class CoinDto(
    val id: String,
    val is_active: Boolean,
    val is_new: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)
