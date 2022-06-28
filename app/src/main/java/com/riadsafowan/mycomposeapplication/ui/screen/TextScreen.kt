package com.riadsafowan.mycomposeapplication.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.riadsafowan.mycomposeapplication.Screen
import com.riadsafowan.mycomposeapplication.fontFamily
import com.riadsafowan.mycomposeapplication.ui.components.NavBar

@Composable
fun TextScreen(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth(),
    ) {
        Column() {
            NavBar(
                navController = navController,
                previous = Screen.MainScreen.route,
                next = Screen.StateScreen.route
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
                            text = "hello world",
                            color = Color.White,
                            fontSize = 30.sp,
                            fontFamily = fontFamily
                        )
                        Text(fontFamily = fontFamily,
                            color = Color.White,
                            fontSize = 50.sp,
                            text = buildAnnotatedString {
                                withStyle(style = SpanStyle(color = Color.Red, fontSize = 70.sp)) {
                                    append("R")
                                }
                                append("iad ")

                                withStyle(
                                    style = SpanStyle(
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Green,
                                        fontSize = 60.sp
                                    )
                                ) {
                                    append("S")
                                }
                                append("afowan")
                            }
                        )
                    }
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun MyView() {
    Box(modifier = Modifier.fillMaxSize()) {
        TextScreen(navController = rememberNavController())
    }
}