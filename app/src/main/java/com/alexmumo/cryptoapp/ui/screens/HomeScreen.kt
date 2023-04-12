package com.alexmumo.cryptoapp.ui.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import com.alexmumo.cryptoapp.viemmodel.HomeViewModel
import com.alexmumo.domain.model.Coin

@Composable
fun HomeScreen(
    homeViewModel: HomeViewModel = hiltViewModel()
) {
    val state = homeViewModel.coins.value
    val coinState by homeViewModel.coins
    LazyColumn {
        items(state.coins) {coin ->
            CoinItem(coin = coin)
        }
    }
}

@Composable
fun CoinItem(
    coin: Coin
) {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = coin.name,
            color = Color.Blue
        )
        Text(text = coin.symbol)
    }
}

