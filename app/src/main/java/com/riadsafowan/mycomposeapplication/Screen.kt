package com.riadsafowan.mycomposeapplication

sealed class Screen(val route: String){
    object MainScreen : Screen("main_screen")
    object TextScreen : Screen("text_screen")
    object StateScreen : Screen("state_screen")
}
