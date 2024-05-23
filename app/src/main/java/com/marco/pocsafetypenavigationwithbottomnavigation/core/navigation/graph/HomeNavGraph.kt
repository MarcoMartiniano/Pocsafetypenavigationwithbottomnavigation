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
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.HomeScreen5
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.HomeScreen6
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.utils.parcelableType
import com.marco.pocsafetypenavigationwithbottomnavigation.domain.model.User
import com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen.HomeScreen
import com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen2.HomeScreen2
import com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen3.HomeScreen3
import com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen4.Home4
import com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen5.Home5
import com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen6.Home6
import kotlin.reflect.typeOf

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
        composable<HomeScreen5>(
            typeMap = mapOf(typeOf<User>() to parcelableType<User>())

        ) {
            val args = it.toRoute<HomeScreen5>()
            Home5(user = args.user)
        }
        composable<HomeScreen6>(
            typeMap = mapOf(typeOf<User>() to parcelableType<User>())

        ) {
            val args = it.toRoute<HomeScreen6>()
            Home6(user = args.user)
        }
    }
}