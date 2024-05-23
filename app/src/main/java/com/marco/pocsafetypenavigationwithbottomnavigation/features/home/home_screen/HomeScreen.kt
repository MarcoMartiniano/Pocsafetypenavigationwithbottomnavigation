package com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen

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
import com.marco.pocsafetypenavigationwithbottomnavigation.domain.model.User
import org.koin.androidx.compose.koinViewModel


@Composable
fun HomeScreen() {
    val viewModel: HomeScreenViewModel = koinViewModel()
    HomeScreenFactory(viewModel = viewModel)
}

@Composable
fun HomeScreenFactory(viewModel: HomeScreenViewModel) {
    val action: (HomeScreenViewAction) -> Unit = { viewModel.dispatchViewAction(it) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Home")
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {
            action(HomeScreenViewAction.Navigation.QuizTab)
        }) {
            Text(text = "Navigate to Quiz tab")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {
            action(HomeScreenViewAction.Navigation.HomeScreen2)
        }) {
            Text(text = "Navigate to Home2")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {
            action(HomeScreenViewAction.Navigation.HomeScreen3)
        }) {
            Text(text = "Navigate to Home3 without navBar")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {
            action(HomeScreenViewAction.Navigation.HomeScreen4)
        }) {
            Text(text = "Navigate to Home4 without navBar and with argument: name")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {
            action(HomeScreenViewAction.Navigation.HomeScreen5(user = User(name = "Marco")))
        }) {
            Text(text = "Navigate to Home5 without navBar and with argument: User(name = Marco)")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {
            action(HomeScreenViewAction.Navigation.HomeScreen6(user = User(name = "Marco")))
        }) {
            Text(text = "Navigate to Home6 with navBar and with argument: User(name = Marco)")
        }
    }

}