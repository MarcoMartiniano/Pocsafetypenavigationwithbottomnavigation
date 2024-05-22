package com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.koin.androidx.compose.koinViewModel


@Composable
fun HomeScreen2() {
    val viewModel: HomeScreen2ViewModel = koinViewModel()
    val action: (HomeScreen2ViewAction) -> Unit = { viewModel.dispatchViewAction(it) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Home2")
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {
            action(HomeScreen2ViewAction.Navigation.BackHome)
        }) {
            Text(text = "Navigate back to Home")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {
            action(HomeScreen2ViewAction.Navigation.HomeScreen3)
        }) {
            Text(text = "Navigate to Home3")
        }
    }
}