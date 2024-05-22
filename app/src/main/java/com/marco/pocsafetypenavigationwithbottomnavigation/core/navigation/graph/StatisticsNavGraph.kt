package com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.Statistics
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.StatisticsHome
import com.marco.pocsafetypenavigationwithbottomnavigation.features.statistics.StatisticScreen

internal fun NavGraphBuilder.addStatisticsNavGraph() {
    navigation<Statistics>(
        startDestination = StatisticsHome
    ) {
        composable<StatisticsHome> {
            StatisticScreen()
        }
    }
}