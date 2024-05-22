package com.marco.pocsafetypenavigationwithbottomnavigation.core.di.intent

import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.core.NavigationManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import org.koin.dsl.module

val intentCoreModule = module {
    single {
        NavigationManager(
            CoroutineScope(
                SupervisorJob() + Dispatchers.Main
            )
        )
    }
}