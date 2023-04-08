package com.alexmumo.cryptoapp.state

import com.alexmumo.domain.model.Coin

data class CoinState(
    val coins: List<Coin> = emptyList(),
    val isLoading: Boolean = false,
    val errors: String? = null
)