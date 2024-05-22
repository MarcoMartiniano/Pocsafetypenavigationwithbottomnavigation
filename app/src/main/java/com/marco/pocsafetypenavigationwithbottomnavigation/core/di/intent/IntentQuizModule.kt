package com.marco.pocsafetypenavigationwithbottomnavigation.core.di.intent

import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.navigation.quiz.QuizScreen2NavigationImpl
import com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.navigation.quiz.QuizScreenNavigationImpl
import com.marco.pocsafetypenavigationwithbottomnavigation.features.quiz.quiz_screen.QuizScreenNavigation
import com.marco.pocsafetypenavigationwithbottomnavigation.features.quiz.quiz_screen2.QuizScreen2Navigation
import org.koin.dsl.module

val intentQuizModule = module {
    single<QuizScreenNavigation> { QuizScreenNavigationImpl(get()) }
    single<QuizScreen2Navigation> { QuizScreen2NavigationImpl(get()) }
}