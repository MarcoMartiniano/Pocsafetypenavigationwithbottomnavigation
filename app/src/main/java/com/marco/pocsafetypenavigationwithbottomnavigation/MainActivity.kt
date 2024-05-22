package com.marco.pocsafetypenavigationwithbottomnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.navigation.AppNavigation
import com.marco.pocsafetypenavigationwithbottomnavigation.ui.theme.POCSafeTypeNavigationWithBottomNavigationTheme

class MainActivity : ComponentActivity() {
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            POCSafeTypeNavigationWithBottomNavigationTheme(
                darkTheme = isSystemInDarkTheme(),
                content = {
                    val mainNavHostController: NavHostController = rememberNavController()
                    viewModel.initNavigation(
                        mainNavHostController = mainNavHostController
                    )
                    AppNavigation(
                        mainNavHostController = mainNavHostController
                    )
                }
            )
        }
    }
}