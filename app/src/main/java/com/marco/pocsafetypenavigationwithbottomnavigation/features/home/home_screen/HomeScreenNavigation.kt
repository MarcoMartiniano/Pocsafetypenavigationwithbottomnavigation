package com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen

import com.marco.pocsafetypenavigationwithbottomnavigation.domain.model.User

interface HomeScreenNavigation {
    fun navigateToHomeScreen2()
    fun navigateToHomeScreen3()
    fun navigateToHomeScreen4(name: String)
    fun navigateToHomeScreen5(user: User)
    fun navigateToHomeScreen6(user: User)
    fun navigateToQuizTab()
}