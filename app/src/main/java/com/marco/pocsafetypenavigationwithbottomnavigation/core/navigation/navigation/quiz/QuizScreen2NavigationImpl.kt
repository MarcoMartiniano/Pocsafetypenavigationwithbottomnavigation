package com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.navigation.quiz

import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.core.NavigationManager
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.Home
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.HomeScreen
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.Quiz3
import com.marco.pocsafetypenavigationwithbottomnavigation.features.quiz.quiz_screen2.QuizScreen2Navigation

class QuizScreen2NavigationImpl(
    private val navigationManager: NavigationManager,
) : QuizScreen2Navigation {
    override fun navigateToQuizScreen3() {
        navigationManager.navigate(
            Quiz3
        )
    }

    override fun navigateToHome() {
        navigationManager.popStackBackInclusive(
            routeRoot = HomeScreen,
            routeDestination = HomeScreen
        )
    }

    override fun navigateToHomeSwitchTabs() {
        navigationManager.switchTabs(
            Home
        )
    }
}