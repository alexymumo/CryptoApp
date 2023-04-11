package com.alexmumo.cryptoapp.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import com.alexmumo.cryptoapp.viemmodel.HomeViewModel
import com.alexmumo.domain.model.Coin

@Composable
fun HomeScreen(
    homeViewModel: HomeViewModel = hiltViewModel()
) {
    val coinState by homeViewModel.coins
    LazyColumn {
        items(coinState.coins) {coin ->
            CoinItem(coin = coin)
        }
    }
}

@Composable
fun CoinItem(
    coin: Coin
) {
    Text(text = coin.name)
}

