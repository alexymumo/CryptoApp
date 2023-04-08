package com.alexmumo.cryptoapp.ui.screens

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.alexmumo.cryptoapp.navigation.BottomNav
import com.alexmumo.cryptoapp.navigation.NavigationGraph

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        topBar = {

        },
        bottomBar = {
            BottomNav(navController = navController)
        }
    ) {
        NavigationGraph(navController = navController)
    }
}