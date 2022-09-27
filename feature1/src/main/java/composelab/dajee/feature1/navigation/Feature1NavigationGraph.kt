package composelab.dajee.feature1.navigation

import androidx.navigation.*
import androidx.navigation.compose.composable
import composelab.dajee.core.navigation.IFeatureNavigationGraph
import composelab.dajee.feature1.navigation.Feature1Navigation.navParameterKey
import composelab.dajee.feature1.screens.Feature1HomeScreen
import composelab.dajee.feature1.screens.Feature1TestScreen


object Feature1NavigationGraph : IFeatureNavigationGraph {

    override fun baseRoute() = Feature1Navigation.baseRoute()
    override fun buildNavigationGraph(navGraphBuilder: NavGraphBuilder, navController:NavController) {

        navGraphBuilder.apply {
            navigation(startDestination = Feature1Navigation.getHomeRoute(), route = Feature1Navigation.baseRoute()){

                composable( Feature1Navigation.getHomeRoute()){
                    Feature1HomeScreen(navController)
                }
                composable(Feature1Navigation.getTestScreenRouteTemplate() , arguments = listOf(navArgument(navParameterKey) { type = NavType.StringType } )){
                    Feature1TestScreen( it.arguments?.getString(navParameterKey)?:"")
                }

            }
        }

    }

}