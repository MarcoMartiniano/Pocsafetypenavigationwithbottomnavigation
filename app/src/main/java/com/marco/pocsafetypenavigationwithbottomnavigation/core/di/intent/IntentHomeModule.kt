package com.marco.pocsafetypenavigationwithbottomnavigation.core.di.intent

import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.navigation.HomeScreenNavigationImpl
import com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen.HomeScreenNavigation
import org.koin.dsl.module

val intentHomeModule = module {
    single<HomeScreenNavigation> { HomeScreenNavigationImpl(get()) }
}