package com.alexmumo.cryptoapp.viemmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alexmumo.common.Resource
import com.alexmumo.cryptoapp.state.CoinState
import com.alexmumo.domain.usecases.GetCoinUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val getCoinUseCase: GetCoinUseCase): ViewModel() {
    private val _coins = mutableStateOf(CoinState())
    val coins: State<CoinState> = _coins

    init {
        getCoins()
    }

    private fun getCoins() {
        viewModelScope.launch(Dispatchers.IO) {
            getCoinUseCase().collectLatest { coins ->
                when(coins) {
                    is Resource.Success -> {
                        _coins.value = _coins.value.copy(
                            coins = coins.data?: emptyList()
                        )
                    }
                    is Resource.Error -> {
                        _coins.value = _coins.value.copy(
                            errors = "An error occurred"
                        )
                    }
                    is Resource.Loading -> {
                        _coins.value = _coins.value.copy(
                            isLoading = false
                        )
                    }
                }
            }
        }
    }
}