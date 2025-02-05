package com.alexmumo.cryptoapp.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.alexmumo.cryptoapp.ui.screens.HomeScreen
import com.alexmumo.cryptoapp.ui.screens.MainScreen
import com.alexmumo.cryptoapp.ui.theme.CryptoAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptoAppTheme {
                MainScreen()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CryptoAppTheme {

    }
}