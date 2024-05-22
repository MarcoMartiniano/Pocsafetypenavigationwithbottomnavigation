package com.marco.pocsafetypenavigationwithbottomnavigation.features.quiz.quiz_screen2


sealed class QuizScreen2ViewAction {
    object Navigation {
        data object QuizScreen3 : QuizScreen2ViewAction()
        data object HomeScreen : QuizScreen2ViewAction()
        data object HomeSwitchTab : QuizScreen2ViewAction()
    }
}