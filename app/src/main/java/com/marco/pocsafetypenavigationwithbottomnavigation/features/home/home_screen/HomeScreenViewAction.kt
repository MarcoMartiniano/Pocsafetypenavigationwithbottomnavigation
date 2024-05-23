package com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen

import com.marco.pocsafetypenavigationwithbottomnavigation.domain.model.User


sealed class HomeScreenViewAction {
    object Navigation {
        data object HomeScreen2 : HomeScreenViewAction()
        data object HomeScreen3 : HomeScreenViewAction()
        data object HomeScreen4 : HomeScreenViewAction()
        data class HomeScreen5(val user: User) : HomeScreenViewAction()
        data class HomeScreen6(val user: User) : HomeScreenViewAction()
        data object QuizTab : HomeScreenViewAction()
    }
}