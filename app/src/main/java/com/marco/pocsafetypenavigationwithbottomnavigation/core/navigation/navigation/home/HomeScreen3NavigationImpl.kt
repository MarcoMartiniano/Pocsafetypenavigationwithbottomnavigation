package com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.navigation.home

import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.core.NavigationManager
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.HomeScreen
import com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen3.HomeScreen3Navigation

class HomeScreen3NavigationImpl(
    private val navigationManager: NavigationManager,
) : HomeScreen3Navigation {
    override fun navigateBackToHome() {
        navigationManager.popStackBackInclusive(
            routeDestination = HomeScreen,
            routeRoot = HomeScreen
        )
    }

    override fun navigateBackToHome2() {
        navigationManager.popStackBack()
    }
}