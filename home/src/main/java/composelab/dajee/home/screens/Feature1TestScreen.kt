package composelab.dajee.home.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import composelab.dajee.home.navigation.Feature1Navigation

@Composable
fun HomeTestScreen(
    userName: String,
    navigator: NavController
) {

    val vmInstance: HomeTestScreenViewModel = viewModel()

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
            text = "hello ${vmInstance.getTetValue()}",
            textAlign = TextAlign.Center
        )
        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green),
            contentPadding = PaddingValues(
                start = 20.dp,
                top = 12.dp,
                end = 20.dp,
                bottom = 12.dp
            ),
            onClick = {
                vmInstance.setTestValue()
                navigator.navigate(Feature1Navigation.getTestScreen2Route()){
                    popUpTo(Feature1Navigation.getTestScreenRouteTemplate()){inclusive = true}
                }

            }
        ) {
            Text(text = "set value", fontSize = 15.sp)
        }
    }
}

@Preview
@Composable
fun TestScreen() {
    HomeTestScreen("Marco", rememberNavController())
}

