package com.marco.pocsafetypenavigationwithbottomnavigation.core.di.intent

import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.navigation.home.HomeScreen2NavigationImpl
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.navigation.home.HomeScreen3NavigationImpl
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.navigation.home.HomeScreenNavigationImpl
import com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen.HomeScreenNavigation
import com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen2.HomeScreen2Navigation
import com.marco.pocsafetypenavigationwithbottomnavigation.features.home.home_screen3.HomeScreen3Navigation
import org.koin.dsl.module

val intentHomeModule = module {
    single<HomeScreenNavigation> { HomeScreenNavigationImpl(get()) }
    single<HomeScreen2Navigation> { HomeScreen2NavigationImpl(get()) }
    single<HomeScreen3Navigation> { HomeScreen3NavigationImpl(get()) }
}