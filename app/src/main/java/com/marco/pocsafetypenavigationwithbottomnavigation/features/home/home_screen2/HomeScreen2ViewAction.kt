package com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen2


sealed class HomeScreen2ViewAction {
    object Navigation {
        data object BackHome : HomeScreen2ViewAction()
        data object HomeScreen3 : HomeScreen2ViewAction()
    }
}