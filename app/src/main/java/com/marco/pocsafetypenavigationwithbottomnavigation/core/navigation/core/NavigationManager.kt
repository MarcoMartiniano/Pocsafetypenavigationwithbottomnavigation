package com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.core

import androidx.navigation.NavOptions
import androidx.navigation.NavOptionsBuilder
import androidx.navigation.navOptions
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

@Suppress("unused")
class NavigationManager(
    private val applicationScope: CoroutineScope,
) {
    private val _commands: Channel<NavigationCommand> = Channel(Channel.BUFFERED)
    val commands = _commands.receiveAsFlow()

    private fun navigate(
        route: Any,
        navOptions: NavOptions? = null,
    ) {
        applicationScope.launch {
            _commands.send(
                NavigationCommand.Navigate(
                    destination = route,
                    type = NavigationType.NavigateTo,
                    navOptions = navOptions
                )
            )
        }
    }

    fun navigate(
        route: Any,
        builder: NavOptionsBuilder.() -> Unit = {
            launchSingleTop = true
        },
    ) {
        navigate(route, navOptions(builder))
    }

    fun navigateUp() {
        applicationScope.launch {
            _commands.send(NavigationCommand.NavigateUp)
        }
    }

    fun popStackBack() {
        applicationScope.launch {
            _commands.send(NavigationCommand.PopStackBack)
        }
    }

    fun switchTabs(route: Any) {
        applicationScope.launch {
            _commands.send(NavigationCommand.SwitchTabs(route = route))
        }
    }

    fun popStackBackInclusive(routeDestination: Any, routeRoot: Any) {
        applicationScope.launch {
            _commands.send(
                NavigationCommand.PopStackBackInclusive(
                    routeDestination = routeDestination,
                    routeRoot = routeRoot
                )
            )
        }
    }
}

sealed class NavigationType {

    data object NavigateTo : NavigationType()
}

sealed class NavigationCommand {

    data class Navigate(
        val destination: Any,
        val navOptions: NavOptions? = null,
        val type: NavigationType,
    ) : NavigationCommand()

    data object NavigateUp : NavigationCommand()

    data object PopStackBack : NavigationCommand()
    data class PopStackBackInclusive(val routeDestination: Any, val routeRoot: Any) :
        NavigationCommand()

    data class SwitchTabs(
        val route: Any,
    ) : NavigationCommand()
}