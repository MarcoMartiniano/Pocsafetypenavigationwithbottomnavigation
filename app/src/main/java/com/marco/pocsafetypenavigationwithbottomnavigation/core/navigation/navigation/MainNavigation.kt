package com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.Home
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.graph.addFavoritesNavGraph
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.graph.addHomeNavGraph
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.graph.addQuizNavGraph
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.graph.addStatisticsNavGraph

@Composable
fun MainNavigation(tabNavHostController: NavHostController) {
    NavHost(
        navController = tabNavHostController,
        startDestination = Home
    ) {
        addHomeNavGraph()
        addQuizNavGraph()
        addFavoritesNavGraph()
        addStatisticsNavGraph()
    }
}