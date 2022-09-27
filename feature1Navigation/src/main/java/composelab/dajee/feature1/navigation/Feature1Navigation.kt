package composelab.dajee.feature1.navigation


import composelab.dajee.core.navigation.IFeatureNavigation


object Feature1Navigation : IFeatureNavigation {

    private val baseRoute = "Home"
    private val homeScreenRoute = "feature1Home"

    val testScreenRoute = "feature1TestScreen"
    val navParameterKey = "parameterKey"

    fun getHomeRoute() =  homeScreenRoute
    fun getTestScreenRouteTemplate() = "$testScreenRoute/{$navParameterKey}"
    fun getTestScreenRoute(username:String) = "$testScreenRoute/$username"
    override fun baseRoute() = baseRoute

}