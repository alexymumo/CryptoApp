package com.alexmumo.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Coin(
    val id: Int,
    val logo: String,
    val name: String,
    val priority: Int,
    val symbol: String
)