package composelab.dajee.home.navigation


import composelab.dajee.core.navigation.IFeatureNavigation


object Feature1Navigation : IFeatureNavigation {

    private val baseRoute = "Home"
    private val homeScreenRoute = "feature1Home"

    val testScreenRoute = "feature1TestScreen"
    private val _testScreen2Route = "feature1TestScreen2"
    val navParameterKey = "parameterKey"

    fun getHomeRoute() =  homeScreenRoute
    fun getTestScreenRouteTemplate() = "$testScreenRoute/{$navParameterKey}"
    fun getTestScreenRoute(username:String) = "$testScreenRoute/$username"

    fun getTestScreen2Route() = _testScreen2Route

    override fun baseRoute() = baseRoute

}