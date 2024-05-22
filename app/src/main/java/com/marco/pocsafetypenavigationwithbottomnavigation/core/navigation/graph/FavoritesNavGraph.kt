package com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.Routes
import com.marco.pocsafetypenavigationwithbottomnavigation.features.favorites.FavoritesScreen

internal fun NavGraphBuilder.addFavoritesNavGraph() {
    navigation<Routes.Favorites>(
        startDestination = Routes.Favorites.Home
    ) {
        composable<Routes.Favorites.Home> {
            FavoritesScreen()
        }
    }
}