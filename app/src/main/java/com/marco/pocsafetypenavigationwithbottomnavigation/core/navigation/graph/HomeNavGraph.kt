package com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import androidx.navigation.toRoute
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.Home
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.HomeScreen
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.HomeScreen2
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.HomeScreen3
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.HomeScreen4
import com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen.HomeScreen
import com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen2.HomeScreen2
import com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen3.HomeScreen3
import com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen4.Home4

internal fun NavGraphBuilder.addHomeNavGraph() {
    navigation<Home>(
        startDestination = HomeScreen
    ) {
        composable<HomeScreen> {
            HomeScreen()
        }
        composable<HomeScreen2> {
            HomeScreen2()
        }
        composable<HomeScreen3> {
            HomeScreen3()
        }
        composable<HomeScreen4> {
            val args = it.toRoute<HomeScreen4>()
            Home4(name = args.name)
        }
    }
}