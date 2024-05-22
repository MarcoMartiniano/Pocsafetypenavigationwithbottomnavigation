package com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.Quiz
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.Quiz2
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.Quiz3
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.QuizHome
import com.marco.pocsafetypenavigationwithbottomnavigation.features.quiz.quiz_screen.QuizScreen
import com.marco.pocsafetypenavigationwithbottomnavigation.features.quiz.quiz_screen2.QuizScreen2
import com.marco.pocsafetypenavigationwithbottomnavigation.features.quiz.quiz_screen3.QuizScreen3

internal fun NavGraphBuilder.addQuizNavGraph() {
    navigation<Quiz>(
        startDestination = QuizHome
    ) {
        composable<QuizHome> {
            QuizScreen()
        }
        composable<Quiz2> {
            QuizScreen2()
        }
        composable<Quiz3> {
            QuizScreen3()
        }
    }
}