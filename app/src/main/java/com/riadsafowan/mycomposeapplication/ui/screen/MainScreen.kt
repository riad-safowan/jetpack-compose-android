package com.riadsafowan.mycomposeapplication.ui.screen

import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.riadsafowan.mycomposeapplication.Screen
import com.riadsafowan.mycomposeapplication.R
import com.riadsafowan.mycomposeapplication.ui.components.NavBar

@Composable
fun MainScreen(navController: NavController) {
    val painter = painterResource(id = R.drawable.ic_launcher_background)
    val scrollState = rememberScrollState()
    Column() {
        NavBar(
            navController = navController,
            destination = Screen.TextScreen.route,
        )
//        Column(modifier = Modifier.verticalScroll(scrollState)) {
//            for (i in 1..5)
//                Row(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(0.dp, 10.dp),
//                    horizontalArrangement = Arrangement.SpaceEvenly,
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    ImageCard(painter, "adf", "Hello from Android:")
//                    ImageCard(painter, "adf", "another from Android")
//                }
//            Spacer(
//                modifier = Modifier
//                    .border(width = 2.5.dp, color = Color.Black)
//                    .fillMaxWidth()
//                    .height(10.dp)
//                    .background(Color.Red)
//            )
//        }
        LazyColumn {
            items(5000) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(0.dp, 10.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    ImageCard(painter, "adf", "Hello from Android: ${it}")
                    ImageCard(painter, "adf", "another from Android")
                }
            }
        }
    }
}

@Composable
fun ImageCard(
    painter: Painter,
    contentDes: String,
    title: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(10.dp),
        elevation = 5.dp,

        ) {
        Box(
            modifier = Modifier
                .height(300.dp)
                .width(200.dp)
                .background(Color.Green)
        ) {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painter,
                contentDescription = contentDes,
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black
                            ),
                            startY = 500f,
                        )
                    )
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomCenter
            ) {
                Text(text = title, style = TextStyle(color = Color.White, fontSize = 16.sp))
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun MyView() {
    Box(modifier = Modifier.fillMaxSize()) {
        MainScreen(navController = rememberNavController())
    }
}