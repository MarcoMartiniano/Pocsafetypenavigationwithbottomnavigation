package com.marco.pocsafetypenavigationwithbottomnavigation.features.quiz.quiz_screen

import androidx.lifecycle.ViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class QuizScreenViewModel : ViewModel(), KoinComponent {

    val navigation: QuizScreenNavigation by inject()

    fun dispatchViewAction(viewAction: QuizScreenViewAction) {
        when (viewAction) {
            QuizScreenViewAction.Navigation.QuizScreen2 -> navigation.navigateToQuizScreen2()
        }
    }
}