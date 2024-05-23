package com.marco.pocsafetypenavigationwithbottomnavigation.core.uikit.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.utils.isButtonItemSelected
import com.marco.pocsafetypenavigationwithbottomnavigation.domain.model.BottomNavItem

@Composable
fun BottomNavigationBar(
    items: List<BottomNavItem>,
    navController: NavController,
    modifier: Modifier = Modifier,
    onItemClick: (BottomNavItem) -> Unit,
    testTag: String? = null,
) {
    val backStackEntry = navController.currentBackStackEntryAsState()

    NavigationBar(
        modifier = modifier
            .fillMaxWidth(),
        containerColor = Color.Yellow
    ) {
        items.forEach { item ->
            val backStackEntryValue = backStackEntry.value?.destination?.route
            val navButtonItemRoute = item.route.javaClass.name

            val selected = isButtonItemSelected(
                navButtonItemRoute = navButtonItemRoute,
                backStackEntryRouteValue = backStackEntryValue
            )

            NavigationBarItem(
                modifier = Modifier.testTag(testTag ?: "BooksBottomNavigationBarItem"),
                selected = selected,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color.Red,
                    unselectedIconColor = Color.Blue,
                    indicatorColor = Color.DarkGray
                ),
                onClick = { onItemClick(item) },
                icon = {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.name
                        )
                        Spacer(Modifier.height(5.dp))
                        Text(
                            text = item.name,
                            textAlign = TextAlign.Center,
                            fontSize = 10.sp
                        )
                    }
                }
            )
        }
    }
}