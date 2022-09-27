package composelab.dajee.feature1.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import composelab.dajee.feature1.navigation.Feature1Navigation
import composelab.dajee.feature2.navigation.Feature2Navigation


@Composable
fun Feature1HomeScreen(
    navigator: NavController
) {

    ConstraintLayout(
        modifier = Modifier.fillMaxSize(),
    ) {

        val (
            toTestScreenBtn, toFeature2Home, toFeature2Test
        ) = createRefs()

        Button(
            modifier = Modifier
                .constrainAs(toTestScreenBtn) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                }
                .width(200.dp),
            contentPadding = PaddingValues(
                start = 20.dp,
                top = 12.dp,
                end = 20.dp,
                bottom = 12.dp
            ),
            onClick = {
                navigator.navigate(
                    Feature1Navigation.getTestScreenRoute("akka")
                )
            }
        ) {
            Text(text = "to test screen", fontSize = 15.sp)
        }

        Button(
            modifier = Modifier
                .constrainAs(toFeature2Home) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    linkTo(toTestScreenBtn.bottom, parent.bottom, bias = 0F, topMargin = 10.dp)

                }
                .width(200.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green),
            contentPadding = PaddingValues(
                start = 20.dp,
                top = 12.dp,
                end = 20.dp,
                bottom = 12.dp
            ),
            onClick = {
                navigator.navigate(
                    Feature2Navigation.getHomeRoute()
                )
            }
        ) {
            Text(text = "to feature 2 home", fontSize = 15.sp)
        }

        Button(
            modifier = Modifier
                .constrainAs(toFeature2Test) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    linkTo(toFeature2Home.bottom, parent.bottom, bias = 0F, topMargin = 10.dp)

                }
                .width(200.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow),
            contentPadding = PaddingValues(
                start = 20.dp,
                top = 12.dp,
                end = 20.dp,
                bottom = 12.dp
            ),
            onClick = {
                navigator.navigate(Feature2Navigation.getTestScreenRoute())
            }
        ) {
            Text(text = "to feature 2 Test", fontSize = 15.sp)
        }
    }
}

@Preview
@Composable
fun ScreenPreview() {
    Feature1HomeScreen(rememberNavController())
}