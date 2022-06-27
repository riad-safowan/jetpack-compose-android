package com.riadsafowan.mycomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.riadsafowan.mycomposeapplication.ui.theme.MyComposeApplicationTheme
import com.riadsafowan.mycomposeapplication.ui.theme.Shapes


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyView()
        }
    }
}
val fontFamily= FontFamily(
        Font(R.font.dancing_script_medium, FontWeight.Medium),
        Font(R.font.dancing_script_regular, FontWeight.Normal),
        Font(R.font.dancing_script_semi_bold, FontWeight.SemiBold),
        Font(R.font.dancing_script_bold, FontWeight.Bold),
)

@Composable
@Preview(showBackground = true)
private fun MyView() {
    val painter = painterResource(id = R.drawable.ic_launcher_background)
    Column() {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            ImageCard(painter, "adf", "Hello from Android")
            ImageCard(painter, "adf", "another from Android")
        }
        Spacer(
            modifier = Modifier
                .border(width = 2.5.dp, color = Color.Black)
                .fillMaxWidth()
                .height(10.dp)
                .background(Color.Red)
        )
        Row {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(IntrinsicSize.Min)
                    .background(Color(0xFF000000))
            ) {
                Column() {
                    Text(text = "hello world",
                        color = Color.White,
                        fontSize = 30.sp,
                        fontFamily = fontFamily
                        )
                    Text(text = "hello world",
                    style = TextStyle(color = Color.Blue)
                    )
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