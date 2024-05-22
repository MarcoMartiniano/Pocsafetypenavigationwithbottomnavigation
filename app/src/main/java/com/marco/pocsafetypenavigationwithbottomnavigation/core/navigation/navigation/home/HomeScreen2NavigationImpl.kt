package com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.navigation.home

import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.core.NavigationManager
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.HomeScreen3
import com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen2.HomeScreen2Navigation

class HomeScreen2NavigationImpl(
    private val navigationManager: NavigationManager,
) : HomeScreen2Navigation {
    override fun navigateBackToHome() {
        navigationManager.popStackBack()
    }

    override fun navigateToHomeScreen3() {
        navigationManager.navigate(
            HomeScreen3
        )
    }
}