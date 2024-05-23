package com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.navigation.home

import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.core.NavigationManager
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.HomeScreen2
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.HomeScreen3
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.HomeScreen4
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.HomeScreen5
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.Quiz
import com.marco.pocsafetypenavigationwithbottomnavigation.domain.model.User
import com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen.HomeScreenNavigation

class HomeScreenNavigationImpl(
    private val navigationManager: NavigationManager,
) : HomeScreenNavigation {
    override fun navigateToHomeScreen2() {
        navigationManager.navigate(
            HomeScreen2
        )
    }

    override fun navigateToHomeScreen3() {
        navigationManager.navigate(
            HomeScreen3
        )
    }

    override fun navigateToHomeScreen4(name: String) {
        navigationManager.navigate(
            HomeScreen4(
                name = name
            )
        )
    }

    override fun navigateToHomeScreen5(user: User) {
        navigationManager.navigate(
            HomeScreen5(
                user = user
            )
        )
    }

    override fun navigateToQuizTab() {
        navigationManager.switchTabs(
            Quiz
        )
    }
}