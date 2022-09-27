package composelab.dajee.core.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder

interface IFeatureNavigationGraph {

    fun baseRoute():String
    fun buildNavigationGraph(navGraphBuilder:NavGraphBuilder, navController: NavController)
}