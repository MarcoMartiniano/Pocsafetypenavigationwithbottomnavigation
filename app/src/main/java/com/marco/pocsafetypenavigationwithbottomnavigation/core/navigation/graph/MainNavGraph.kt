package com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.graph

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.navigation.MainNavigation
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.Routes
import com.marco.pocsafetypenavigationwithbottomnavigation.features.main.MainScreen

internal fun NavGraphBuilder.addMainNavGraph(
    mainNavHostController: NavHostController,
) {
    composable<Routes.Main> {
        MainScreen(
            navHostController = mainNavHostController,
            content = {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues = it)
                ) {
                    MainNavigation(
                        tabNavHostController = mainNavHostController
                    )
                }
            }
        )
    }
}