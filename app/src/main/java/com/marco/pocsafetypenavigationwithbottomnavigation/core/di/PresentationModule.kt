package com.marco.pocsafetypenavigationwithbottomnavigation.core.di

import com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen.HomeScreenViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel { HomeScreenViewModel() }
}