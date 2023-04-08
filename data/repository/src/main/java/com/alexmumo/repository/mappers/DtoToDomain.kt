package com.alexmumo.repository.mappers

import com.alexmumo.local.entity.CoinEntity
import com.alexmumo.network.dto.CoinDto

internal fun CoinDto.toDomain(): CoinEntity {
    return CoinEntity(
        this.id,
        this.logo,
        this.name,
        this.priority,
        this.symbol
    )
}