package com.marco.pocsafetypenavigationwithbottomnavigation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.core.NavigationCommand
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.core.NavigationManager
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class MainViewModel : ViewModel(), KoinComponent {

    private val navigationManager: NavigationManager by inject()

    fun initNavigation(
        mainNavHostController: NavHostController,
    ) {
        viewModelScope.launch {
            navigationManager.commands.collect { command ->
                when (command) {
                    NavigationCommand.NavigateUp -> mainNavHostController.navigateUp()
                    NavigationCommand.PopStackBack -> mainNavHostController.popBackStack()
                    is NavigationCommand.Navigate -> mainNavHostController.navigate(
                        route = command.destination,
                        navOptions = command.navOptions
                    )

                    is NavigationCommand.SwitchTabs -> mainNavHostController.navigate(command.route) {
                        popUpTo(mainNavHostController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }

                    is NavigationCommand.PopStackBackInclusive -> {
                        mainNavHostController.navigate(command.routeDestination) {
                            popUpTo(command.routeRoot) {
                                inclusive = true
                            }
                        }
                    }
                }
            }
        }
    }
}