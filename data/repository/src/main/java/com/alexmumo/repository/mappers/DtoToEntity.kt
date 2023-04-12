package com.alexmumo.repository.mappers

import com.alexmumo.local.entity.CoinEntity
import com.alexmumo.network.dto.CoinDto

internal fun CoinDto.toEntity(): CoinEntity {
    return CoinEntity(
        this.id,
        this.is_active,
        this.is_new,
        this.name,
        this.rank,
        this.symbol,
        this.type
    )
}