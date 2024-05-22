package com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.Main
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.graph.addMainNavGraph

@Composable
fun AppNavigation(
    mainNavHostController: NavHostController,
) {
    val navHostController: NavHostController = rememberNavController()
    NavHost(
        navController = navHostController,
        startDestination = Main
    ) {
        addMainNavGraph(
            mainNavHostController = mainNavHostController,
        )
    }
}