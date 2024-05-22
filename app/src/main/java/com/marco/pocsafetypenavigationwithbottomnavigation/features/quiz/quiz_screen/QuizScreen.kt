package com.marco.pocsafetypenavigationwithbottomnavigation.features.quiz.quiz_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.koin.androidx.compose.koinViewModel


@Composable
fun QuizScreen() {
    val viewModel: QuizScreenViewModel = koinViewModel()
    val action: (QuizScreenViewAction) -> Unit = { viewModel.dispatchViewAction(it) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Quiz")
        Button(onClick = {
            action(QuizScreenViewAction.Navigation.QuizScreen2)
        }) {
            Text(text = "Navigate to Quiz2")
        }
    }
}