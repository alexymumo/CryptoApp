package com.alexmumo.cryptoapp.navigation

import com.alexmumo.cryptoapp.R

sealed class NavigationItem(val route: String, val icon: Int, val title: String) {
    object Home: NavigationItem("home", R.drawable.ic_launcher_foreground, "Home")
    object Settings: NavigationItem("settings", R.drawable.ic_launcher_foreground, "settings")
}
