package com.alexmumo.cryptoapp.viemmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alexmumo.common.Resource
import com.alexmumo.cryptoapp.state.CoinState
import com.alexmumo.domain.usecases.GetCoinUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val getCoinUseCase: GetCoinUseCase): ViewModel() {
    private val _coins = mutableStateOf(CoinState())
    val coins: State<CoinState> = _coins

    init {
        getCoins()
    }

    private fun getCoins() {
        getCoinUseCase().onEach { coin ->
            when(coin) {
                is Resource.Success -> {
                    _coins.value = CoinState(coins = coin.data ?: emptyList())
                }
                is Resource.Error -> {

                }
                is Resource.Loading -> {

                }
            }
        }.launchIn(viewModelScope)
    }
}