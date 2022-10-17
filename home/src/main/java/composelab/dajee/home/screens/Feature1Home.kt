package composelab.dajee.home.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import composelab.dajee.home.navigation.Feature1Navigation
import composelab.dajee.payees.navigation.Feature2Navigation
import composelab.dajee.shared.ui.components.DajeeButton
import composelab.dajee.shared.ui.theme.Typography


@Composable
fun HomeScreen(
    navigator: NavController
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = MaterialTheme.colorScheme.surfaceVariant)
            .padding(top = 32.dp, start = 16.dp, end = 16.dp, bottom = 16.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "Hello, Gesoo",
                    style = Typography.headlineMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                Text(
                    text = "Your available balance",
                    style = Typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.padding(top = 4.dp)
                )
            }
            Text(text = "$1400", style = Typography.headlineSmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
        }
        Column {
            DajeeButton(onClick = {
                navigator.navigate(Feature1Navigation.getTestScreenRoute("akka"))
            }, modifier = Modifier.fillMaxWidth(), text = "Test 1")
            DajeeButton(onClick = {
                navigator.navigate(
                    Feature2Navigation.getHomeRoute()
                )
            }, modifier = Modifier.fillMaxWidth().padding(top = 8.dp), text = "Test 2")
            DajeeButton(onClick = {
                navigator.navigate(Feature2Navigation.getTestScreenRoute())

            }, modifier = Modifier.fillMaxWidth().padding(top = 8.dp), text = "Test 2 home")
        }
    }
}

@Preview
@Composable
fun ScreenPreview() {
    HomeScreen(rememberNavController())
}