package com.marco.pocsafetypenavigationwithbottomnavigation.features.quiz.quiz_screen2

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
fun QuizScreen2() {
    val viewModel: QuizScreen2ViewModel = koinViewModel()
    val action: (QuizScreen2ViewAction) -> Unit = { viewModel.dispatchViewAction(it) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Quiz2")
        Button(onClick = {
            action(QuizScreen2ViewAction.Navigation.QuizScreen3)
        }) {
            Text(text = "Navigate to Quiz3")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {
            action(QuizScreen2ViewAction.Navigation.HomeScreen)
        }) {
            Text(text = "Navigate to Home")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {
            action(QuizScreen2ViewAction.Navigation.HomeSwitchTab)
        }) {
            Text(text = "Navigate to Home switching tabs")
        }
    }
}