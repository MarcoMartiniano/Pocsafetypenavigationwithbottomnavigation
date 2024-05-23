package com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen

import androidx.lifecycle.ViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class HomeScreenViewModel : ViewModel(), KoinComponent {

    val navigation: HomeScreenNavigation by inject()

    fun dispatchViewAction(viewAction: HomeScreenViewAction) {
        when (viewAction) {
            HomeScreenViewAction.Navigation.HomeScreen2 -> navigation.navigateToHomeScreen2()
            HomeScreenViewAction.Navigation.HomeScreen3 -> navigation.navigateToHomeScreen3()
            HomeScreenViewAction.Navigation.QuizTab -> navigation.navigateToQuizTab()
            HomeScreenViewAction.Navigation.HomeScreen4 -> navigation.navigateToHomeScreen4(name = "Marco")
            is HomeScreenViewAction.Navigation.HomeScreen5 -> navigation.navigateToHomeScreen5(user = viewAction.user)
            is HomeScreenViewAction.Navigation.HomeScreen6 -> navigation.navigateToHomeScreen6(user = viewAction.user)
        }
    }
}