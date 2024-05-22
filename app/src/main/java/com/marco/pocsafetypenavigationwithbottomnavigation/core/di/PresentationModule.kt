package com.marco.pocsafetypenavigationwithbottomnavigation.core.di

import com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen.HomeScreenViewModel
import com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen2.HomeScreen2ViewModel
import com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen3.HomeScreen3ViewModel
import com.marco.pocsafetypenavigationwithbottomnavigation.features.quiz.quiz_screen.QuizScreenViewModel
import com.marco.pocsafetypenavigationwithbottomnavigation.features.quiz.quiz_screen2.QuizScreen2ViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel { HomeScreenViewModel() }
    viewModel { HomeScreen2ViewModel() }
    viewModel { HomeScreen3ViewModel() }

    viewModel { QuizScreenViewModel() }
    viewModel { QuizScreen2ViewModel() }
}