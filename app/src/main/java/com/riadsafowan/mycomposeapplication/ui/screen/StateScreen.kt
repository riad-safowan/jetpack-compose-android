package com.riadsafowan.mycomposeapplication.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.riadsafowan.mycomposeapplication.Screen
import com.riadsafowan.mycomposeapplication.fontFamily
import com.riadsafowan.mycomposeapplication.ui.components.NavBar

@Composable
fun StateScreen(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth(),
    ) {
        NavBar(
            navController = navController,
            previous = Screen.TextScreen.route
        )
        Row {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(IntrinsicSize.Min)
                    .background(Color(0xFF000000))
            ) {
                Column() {
                    Text(
                        text = "statefull compose",
                        color = Color.White,
                        fontSize = 30.sp,
                        fontFamily = fontFamily
                    )
                    Text(
                        text = "hello world",
                        style = TextStyle(color = Color.Blue)
                    )
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun MyView() {
    Box(modifier = Modifier.fillMaxSize()) {
        StateScreen(navController = rememberNavController())
    }
}