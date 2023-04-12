package com.alexmumo.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Coin(
    val id: String,
    val is_active: Boolean,
    val is_new: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)