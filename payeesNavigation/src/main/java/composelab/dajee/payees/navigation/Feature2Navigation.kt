package composelab.dajee.payees.navigation


import composelab.dajee.core.navigation.IFeatureNavigation


object Feature2Navigation : IFeatureNavigation {

    private val baseRoute = "feature2"
    private val homeScreenRoute = "feature2Home"
    private val testScreenRoute = "feature2Test"

    fun getHomeRoute() =  homeScreenRoute
    fun getTestScreenRoute() = testScreenRoute

    override fun baseRoute() = baseRoute

}