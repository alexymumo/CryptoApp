package com.alexmumo.cryptoapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.alexmumo.cryptoapp.ui.screens.HomeScreen
import com.alexmumo.cryptoapp.ui.screens.SettingScreen

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = NavigationItem.Home.route) {
        composable(NavigationItem.Home.route) {
            HomeScreen()
        }
        composable(NavigationItem.Settings.route) {
            SettingScreen()
        }
    }
}