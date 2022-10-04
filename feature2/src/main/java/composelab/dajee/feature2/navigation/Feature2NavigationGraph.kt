package composelab.dajee.feature2.navigation

import androidx.navigation.*
import androidx.navigation.compose.composable
import composelab.dajee.core.navigation.IFeatureNavigationGraph
import composelab.dajee.feature2.screens.Feature2HomeScreen
import composelab.dajee.feature2.screens.Feature2TestScreen

object Feature2NavigationGraph : IFeatureNavigationGraph {

    override fun baseRoute() = Feature2Navigation.baseRoute()

    override fun buildNavigationGraph(navGraphBuilder: NavGraphBuilder, navController: NavController) {

        navGraphBuilder.apply {
            navigation(startDestination = Feature2Navigation.getHomeRoute(), route = Feature2Navigation.baseRoute()){

                composable( Feature2Navigation.getHomeRoute(),deepLinks = listOf(navDeepLink { uriPattern = "dajee://example.com" })){
                    Feature2HomeScreen(navController)
                }
                composable(Feature2Navigation.getTestScreenRoute()){
                    Feature2TestScreen(navController)
                }
            }
        }

    }

}