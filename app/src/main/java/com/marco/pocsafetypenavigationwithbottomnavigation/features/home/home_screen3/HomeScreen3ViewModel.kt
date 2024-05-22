package com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen3

import androidx.lifecycle.ViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class HomeScreen3ViewModel : ViewModel(), KoinComponent {

    val navigation: HomeScreen3Navigation by inject()

    fun dispatchViewAction(viewAction: HomeScreen3ViewAction) {
        when (viewAction) {
            HomeScreen3ViewAction.Navigation.BackHome -> navigation.navigateBackToHome()
            HomeScreen3ViewAction.Navigation.BackHome2 -> navigation.navigateBackToHome2()
        }
    }
}