package com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.Quiz
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.QuizHome
import com.marco.pocsafetypenavigationwithbottomnavigation.features.quiz.QuizScreen

internal fun NavGraphBuilder.addQuizNavGraph() {
    navigation<Quiz>(
        startDestination = QuizHome
    ) {
        composable<QuizHome> {
            QuizScreen()
        }
    }
}