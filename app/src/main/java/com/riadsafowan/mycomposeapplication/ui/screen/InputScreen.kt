package com.riadsafowan.mycomposeapplication.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
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
import kotlinx.coroutines.launch
import kotlin.random.Random

@Composable
fun InputScreen(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth(),
    ) {
        NavBar(
            navController = navController,
        )

        val scaffoldState = rememberScaffoldState()
        var textState by remember {
            mutableStateOf("Riad")
        }
        val scope = rememberCoroutineScope()

        Scaffold(modifier = Modifier.fillMaxSize().padding(20.dp), scaffoldState = scaffoldState) {
            Column(
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.Center
            ) {
                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = textState,
                    label = { "Enter your name" },
                    singleLine = true,
                    onValueChange = {
                        textState = it
                    },
                )

                Button(
                    onClick = {
                    scope.launch {
                        scaffoldState.snackbarHostState.showSnackbar(
                            textState,
                            "Close",
                            SnackbarDuration.Short
                        )
                    }
                }) {
                    Text(text = "Please greet me")
                }
            }
        }
    }
}


@Composable
@Preview(showBackground = true)
private fun MyView() {
    Box(modifier = Modifier.fillMaxSize()) {
        InputScreen(navController = rememberNavController())
    }
}