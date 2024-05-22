package com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen2

import androidx.lifecycle.ViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class HomeScreen2ViewModel : ViewModel(), KoinComponent {

    val navigation: HomeScreen2Navigation by inject()

    fun dispatchViewAction(viewAction: HomeScreen2ViewAction) {
        when (viewAction) {
            HomeScreen2ViewAction.Navigation.BackHome -> navigation.navigateBackToHome()
            HomeScreen2ViewAction.Navigation.HomeScreen3 -> navigation.navigateToHomeScreen3()
        }
    }
}