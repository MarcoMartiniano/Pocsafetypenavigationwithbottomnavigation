package com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.Routes
import com.marco.pocsafetypenavigationwithbottomnavigation.features.quiz.QuizScreen

internal fun NavGraphBuilder.addQuizNavGraph() {
    navigation<Routes.Quiz>(
        startDestination = Routes.Quiz.Home
    ) {
        composable<Routes.Quiz.Home> {
            QuizScreen()
        }
    }
}