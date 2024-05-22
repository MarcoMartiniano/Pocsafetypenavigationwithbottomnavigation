package com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen


sealed class HomeScreenViewAction {
//    object Set {
//        data class SetGameConfiguration(val gameConfiguration: GameConfiguration) :
//            QuizViewAction()
//
//        data class SetGamePage(val pageIndex: Int) : QuizViewAction()
//        data class SetSelectedAnswer(val verb: Verb) : QuizViewAction()
//        data class SetGameSteps(val gameSteps: GameSteps) : QuizViewAction()
//        data class Timer(val remainingSeconds: Int, val gameTimer: GameTimer) : QuizViewAction()
//
//    }


    object Navigation {
        data object HomeScreen2 : HomeScreenViewAction()
        data object HomeScreen3 : HomeScreenViewAction()
        data object HomeScreen4 : HomeScreenViewAction()
        data object QuizTab : HomeScreenViewAction()
    }
}