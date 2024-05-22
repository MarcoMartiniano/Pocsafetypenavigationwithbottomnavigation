package com.marco.pocsafetypenavigationwithbottomnavigation.domain.models

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val name: String,
    val icon: ImageVector,
    val route: Any,
)
