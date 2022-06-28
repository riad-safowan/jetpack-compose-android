package com.riadsafowan.mycomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.riadsafowan.mycomposeapplication.ui.Navigation


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navigation()
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
}

