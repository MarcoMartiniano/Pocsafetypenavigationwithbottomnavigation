package com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.Favorites
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.FavoritesHome
import com.marco.pocsafetypenavigationwithbottomnavigation.features.favorites.FavoritesScreen

internal fun NavGraphBuilder.addFavoritesNavGraph() {
    navigation<Favorites>(
        startDestination = FavoritesHome
    ) {
        composable<FavoritesHome> {
            FavoritesScreen()
        }
    }
}