package com.alexmumo.repository.mappers

import com.alexmumo.domain.model.Coin
import com.alexmumo.local.entity.CoinEntity


internal fun Coin.toEntity(): CoinEntity {
    return CoinEntity(
        this.id,
        this.logo,
        this.name,
        this.priority,
        this.symbol
    )
}