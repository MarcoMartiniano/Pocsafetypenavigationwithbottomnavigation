package com.marco.pocsafetypenavigationwithbottomnavigation.features.quiz.quiz_screen


sealed class QuizScreenViewAction {
    object Navigation {
        data object QuizScreen2 : QuizScreenViewAction()
    }
}