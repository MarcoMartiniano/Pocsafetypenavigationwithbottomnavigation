package com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination

import com.marco.pocsafetypenavigationwithbottomnavigation.domain.model.User
import kotlinx.serialization.Serializable


@Serializable
object HomeScreen

@Serializable
object HomeScreen2

@Serializable
object HomeScreen3

@Serializable
data class HomeScreen4(
    val name: String?,
)

@Serializable
data class HomeScreen5(
    val user: User,
)

@Serializable
data class HomeScreen6(
    val user: User,
)