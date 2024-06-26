package com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.utils

import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.FavoritesHome
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.HomeScreen
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.HomeScreen2
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.HomeScreen6
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.Quiz2
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.QuizHome
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.StatisticsHome


fun isBottomBarVisible(
    backStackEntryRouteValue: String?,
): Boolean = when (backStackEntryRouteValue) {
    HomeScreen.javaClass.name,
    HomeScreen2.javaClass.name,
    HomeScreen6.Companion::class.java.name.removeRouteArgs("$"),
    QuizHome.javaClass.name,
    Quiz2.javaClass.name,
    FavoritesHome.javaClass.name,
    StatisticsHome.javaClass.name,
    -> true

    else -> false
}

fun isButtonItemSelected(
    navButtonItemRoute: String,
    backStackEntryRouteValue: String?,
): Boolean = when (navButtonItemRoute) {
    HomeScreen.javaClass.name -> {
        when (backStackEntryRouteValue) {
            HomeScreen.javaClass.name, HomeScreen2.javaClass.name,
            HomeScreen6.Companion::class.java.name.removeRouteArgs(
                "$"
            ),
            -> true

            else -> false
        }
    }

    QuizHome.javaClass.name -> {
        when (backStackEntryRouteValue) {
            QuizHome.javaClass.name -> true
            Quiz2.javaClass.name -> true
            else -> false
        }
    }

    FavoritesHome.javaClass.name -> {
        when (backStackEntryRouteValue) {
            FavoritesHome.javaClass.name -> true
            else -> false
        }
    }

    StatisticsHome.javaClass.name -> {
        when (backStackEntryRouteValue) {
            StatisticsHome.javaClass.name -> true
            else -> false
        }
    }

    else -> {
        false
    }
}

fun String.removeRouteArgs(separator: String): String = this.split(separator)[0]