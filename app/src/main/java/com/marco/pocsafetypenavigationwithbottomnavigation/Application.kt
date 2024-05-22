package com.marco.pocsafetypenavigationwithbottomnavigation

import android.app.Application
import com.marco.pocsafetypenavigationwithbottomnavigation.core.di.intent.intentModule
import com.marco.pocsafetypenavigationwithbottomnavigation.core.di.presentationModule

import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class Application : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@Application)
            modules(
                intentModule
                        +
                        listOf(
//                            dataModule,
//                            dataRemoteModule,
//                            dataLocalModule,
//                            useCaseModule,
                            presentationModule
                        )
            )
        }
    }
}