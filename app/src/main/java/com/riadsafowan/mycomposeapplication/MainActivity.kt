package com.riadsafowan.mycomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.riadsafowan.mycomposeapplication.ui.theme.MyComposeApplicationTheme
import com.riadsafowan.mycomposeapplication.ui.theme.Shapes


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DefaultPreview()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyComposeApplicationTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Red)
                .padding(all = 50.dp)
            ,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row (modifier = Modifier
                .border(15.dp, Color.Black , shape = Shapes.medium)
                .padding(25.dp))
            {
                Text(text = "Riad Safowan")
                Spacer(modifier = Modifier.width(20.dp))
                Text(text = "Safowan Riad")
            }
            Greeting("Riwertwretbrtwer  werg ergread")
            Greeting(name = "safodfvbwan")
        }
    }
}