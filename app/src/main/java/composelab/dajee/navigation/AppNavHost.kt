package composelab.dajee.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import composelab.dajee.home.navigation.Feature1NavigationGraph
import composelab.dajee.payees.navigation.PayeesNavigationGraph

@Composable
fun ApplicationNavHost(
    navController: NavHostController = rememberNavController(),
    startDestination: String = Feature1NavigationGraph.baseRoute()
) {
    NavHost(navController = navController, startDestination = startDestination){
        Feature1NavigationGraph.buildNavigationGraph(this,navController)
        PayeesNavigationGraph.buildNavigationGraph(this,navController)
    }

}