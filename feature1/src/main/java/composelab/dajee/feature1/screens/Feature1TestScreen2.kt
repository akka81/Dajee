package composelab.dajee.feature1.screens

import android.print.PrintAttributes.Margins
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import composelab.dajee.feature2.navigation.Feature2Navigation

@Composable
fun Feature1TestScreen2(
    userName: String
) {
    Column(
        Modifier
            .background(Color.White)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            color = Color.Black,
            fontSize = 15.sp,
            text = "hello $userName",
            textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
fun TestScreen2() {
    Feature1TestScreen2("Marco")
}

