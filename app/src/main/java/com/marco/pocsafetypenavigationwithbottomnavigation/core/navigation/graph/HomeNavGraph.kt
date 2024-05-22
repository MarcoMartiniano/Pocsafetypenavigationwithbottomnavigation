package com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.Routes
import com.marco.pocsafetypenavigationwithbottomnavigation.features.home.HomeScreen

internal fun NavGraphBuilder.addHomeNavGraph() {
    navigation<Routes.Home>(
        startDestination = Routes.Home.Home
    ) {
        composable<Routes.Home.Home> {
            HomeScreen()
        }
    }
}