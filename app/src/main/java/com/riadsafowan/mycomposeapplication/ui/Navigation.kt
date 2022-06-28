package com.riadsafowan.mycomposeapplication.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.riadsafowan.mycomposeapplication.Screen
import com.riadsafowan.mycomposeapplication.ui.screen.*

@Composable
fun Navigation() {
    var navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
        composable(route = Screen.MainScreen.route) {
            MainScreen(navController = navController)
        }
        composable(route = Screen.TextScreen.route) {
            TextScreen(navController = navController)
        }
        composable(route = Screen.StateScreen.route) {
            StateScreen(navController = navController)
        }
    }
}

