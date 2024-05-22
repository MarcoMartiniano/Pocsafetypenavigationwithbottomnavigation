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
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.FavoritesHome
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.HomeScreen
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.QuizHome
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination.StatisticsHome
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.utils.isBottomBarVisible
import com.marco.pocsafetypenavigationwithbottomnavigation.core.uikit.components.BottomNavigationBar
import com.marco.pocsafetypenavigationwithbottomnavigation.domain.models.BottomNavItem

@Composable
fun MainScreen(
    navHostController: NavHostController,
    content: @Composable (PaddingValues) -> Unit,
) {
    var showBottomBar by rememberSaveable { mutableStateOf(true) }
    val navBackStackEntry by navHostController.currentBackStackEntryAsState()

    showBottomBar =
        isBottomBarVisible(backStackEntryRouteValue = navBackStackEntry?.destination?.route)

    Scaffold(
        modifier = Modifier.background(
            color = Black,
            shape = RoundedCornerShape(16.dp)
        ),
        bottomBar = {
            if (showBottomBar) {
                BottomNavigationBar(
                    items = listOf(
                        BottomNavItem(
                            name = "Home",
                            icon = ImageVector.vectorResource(id = R.drawable.ic_home),
                            route = HomeScreen
                        ),
                        BottomNavItem(
                            name = "Quiz",
                            icon = ImageVector.vectorResource(id = R.drawable.ic_quiz),
                            route = QuizHome
                        ),
                        BottomNavItem(
                            name = "Statistcs",
                            icon = ImageVector.vectorResource(id = R.drawable.ic_encyclopedia),
                            route = StatisticsHome
                        ),
                        BottomNavItem(
                            name = "Favorites",
                            icon = ImageVector.vectorResource(id = R.drawable.ic_favorite),
                            route = FavoritesHome
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