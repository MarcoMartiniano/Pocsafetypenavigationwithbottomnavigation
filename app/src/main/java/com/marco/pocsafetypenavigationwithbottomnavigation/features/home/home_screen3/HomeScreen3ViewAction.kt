package com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen3

sealed class HomeScreen3ViewAction {
    object Navigation {
        data object BackHome : HomeScreen3ViewAction()
        data object BackHome2 : HomeScreen3ViewAction()
    }
}