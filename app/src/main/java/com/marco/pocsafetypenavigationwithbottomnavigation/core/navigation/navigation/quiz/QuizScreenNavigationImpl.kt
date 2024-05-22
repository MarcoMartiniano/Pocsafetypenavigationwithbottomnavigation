package com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.navigation.quiz

import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.core.NavigationManager
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.Quiz2
import com.marco.pocsafetypenavigationwithbottomnavigation.features.quiz.quiz_screen.QuizScreenNavigation

class QuizScreenNavigationImpl(
    private val navigationManager: NavigationManager,
) : QuizScreenNavigation {
    override fun navigateToQuizScreen2() {
        navigationManager.navigate(
            Quiz2
        )
    }
}