package com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.graph.addMainNavGraph
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.Routes

@Composable
fun AppNavigation(
    mainNavHostController: NavHostController,
) {
    val navHostController: NavHostController = rememberNavController()
    NavHost(
        navController = navHostController,
        startDestination = Routes.Main
    ) {
        addMainNavGraph(
            mainNavHostController = mainNavHostController,
        )
    }
}