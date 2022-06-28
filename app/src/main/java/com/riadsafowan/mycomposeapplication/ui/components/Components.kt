package com.riadsafowan.mycomposeapplication.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun NavBar(navController: NavController, previous: String? = null, next: String? = null){
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color(0xFF1A237E))
    ) {
        val textStyle = TextStyle(color = Color.White, fontSize = 20.sp)
        val textModifier = Modifier.padding(15.dp, 15.dp)
        ClickableText(text = buildAnnotatedString { append("Previous Screen") },
            modifier = textModifier,
            style = textStyle
        ) {
            if (previous != null) {
                navController.navigate(previous)
            }
        }

        ClickableText(text = buildAnnotatedString { append("Next Screen") },
            modifier = textModifier,
            style = textStyle,
            onClick = {
                if (next != null) {
                    navController.navigate(next)
                }
            })
    }
}