package com.marco.pocsafetypenavigationwithbottomnavigation.features.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.marco.pocsafetypenavigationwithbottomnavigation.R
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.Routes
import com.marco.pocsafetypenavigationwithbottomnavigation.domain.models.BottomNavItem
import com.marco.pocsafetypenavigationwithbottomnavigation.uikit.components.BottomNavigationBar

@Composable
fun MainScreen(
    navHostController: NavHostController,
    content: @Composable (PaddingValues) -> Unit,
) {
    var showBottomBar by rememberSaveable { mutableStateOf(true) }
    val navBackStackEntry by navHostController.currentBackStackEntryAsState()

//    showBottomBar = when (navBackStackEntry?.destination?.route) {
//        NavItemRoute.Routes.HOME_SCREEN,
//        NavItemRoute.Routes.HOME_QUIZ_SCREEN,
//        NavItemRoute.Routes.ENCYCLOPEDIA_SCREEN,
//        NavItemRoute.Routes.FAVORITES_SCREEN,
//        -> true
//
//        else -> false
//    }
    Scaffold(
        modifier = Modifier.background(
            color = Black,
            shape = RoundedCornerShape(16.dp)
        ),
        bottomBar = {
            val a = Routes.Home
            if (showBottomBar) {
                BottomNavigationBar(
                    items = listOf(
                        BottomNavItem(
                            name = "Home",
                            icon = ImageVector.vectorResource(id = R.drawable.ic_home),
                            route = Routes.Home.Home
                        ),
                        BottomNavItem(
                            name = "Quiz",
                            icon = ImageVector.vectorResource(id = R.drawable.ic_quiz),
                            route = Routes.Quiz.Home
                        ),
                        BottomNavItem(
                            name = "Statistcs",
                            icon = ImageVector.vectorResource(id = R.drawable.ic_encyclopedia),
                            route = Routes.Statistics.Home
                        ),
                        BottomNavItem(
                            name = "Favorites",
                            icon = ImageVector.vectorResource(id = R.drawable.ic_favorite),
                            route = Routes.Favorites.Home
                        ),
                    ),
                    navController = navHostController,
                    onItemClick = {
                        navHostController.navigate(it.route) {
                            popUpTo(navHostController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                )
            }
        },
        content = { innerPadding ->
            content(innerPadding)
        }
    )
}