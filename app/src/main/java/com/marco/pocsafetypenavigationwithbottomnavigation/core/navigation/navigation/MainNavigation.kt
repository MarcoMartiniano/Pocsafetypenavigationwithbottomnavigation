package com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.graph.addStatisticsNavGraph
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.graph.addFavoritesNavGraph
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.graph.addQuizNavGraph
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.graph.addHomeNavGraph
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.Routes

@Composable
fun MainNavigation(tabNavHostController: NavHostController) {
    NavHost(
        navController = tabNavHostController,
        startDestination = Routes.Home
    ) {
        addHomeNavGraph()
        addQuizNavGraph()
        addFavoritesNavGraph()
        addStatisticsNavGraph()
    }
}