package composelab.dajee.feature2.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Feature2TestScreen(
    navigator: NavController
) {
    Box(
        Modifier
            .background(Color.White)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            color = Color.Black,
            fontSize = 15.sp,
            text = "Hello Feature 2 Test",
            textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
fun feature2Test(){
    Feature2HomeScreen(navigator = rememberNavController())
}