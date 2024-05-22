package com.marco.pocsafetypenavigationwithbottomnavigation.features.quiz.quiz_screen2

import androidx.lifecycle.ViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class QuizScreen2ViewModel : ViewModel(), KoinComponent {

    val navigation: QuizScreen2Navigation by inject()

    fun dispatchViewAction(viewAction: QuizScreen2ViewAction) {
        when (viewAction) {
            QuizScreen2ViewAction.Navigation.QuizScreen3 -> navigation.navigateToQuizScreen3()
            QuizScreen2ViewAction.Navigation.HomeScreen -> navigation.navigateToHome()
            QuizScreen2ViewAction.Navigation.HomeSwitchTab -> navigation.navigateToHomeSwitchTabs()
        }
    }
}