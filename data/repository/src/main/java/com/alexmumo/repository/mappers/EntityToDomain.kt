package com.alexmumo.repository.mappers

import com.alexmumo.domain.model.Coin
import com.alexmumo.local.entity.CoinEntity

internal fun CoinEntity.toDomain(): Coin {
    return Coin(
        this.id,
        this.is_active,
        this.is_new,
        this.name,
        this.rank,
        this.symbol,
        this.type
    )
}