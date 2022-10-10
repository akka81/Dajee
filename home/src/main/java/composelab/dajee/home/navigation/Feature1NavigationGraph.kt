package composelab.dajee.home.navigation

import androidx.navigation.*
import androidx.navigation.compose.composable
import composelab.dajee.core.navigation.IFeatureNavigationGraph
import composelab.dajee.home.navigation.Feature1Navigation.navParameterKey
import composelab.dajee.home.screens.HomeScreen
import composelab.dajee.home.screens.HomeTestScreen
import composelab.dajee.home.screens.HomeTestScreen2


object Feature1NavigationGraph : IFeatureNavigationGraph {

    override fun baseRoute() = Feature1Navigation.baseRoute()
    override fun buildNavigationGraph(navGraphBuilder: NavGraphBuilder, navController:NavController) {

        navGraphBuilder.apply {
            navigation(startDestination = Feature1Navigation.getHomeRoute(), route = Feature1Navigation.baseRoute()){

                composable(Feature1Navigation.getHomeRoute()){
                    HomeScreen(navController)
                }
                composable(Feature1Navigation.getTestScreenRouteTemplate() , arguments = listOf(navArgument(navParameterKey) { type = NavType.StringType } )){
                    HomeTestScreen( it.arguments?.getString(navParameterKey)?:"", navController)
                }

                composable(Feature1Navigation.getTestScreen2Route()){
                    HomeTestScreen2("")
                }
            }
        }

    }

}