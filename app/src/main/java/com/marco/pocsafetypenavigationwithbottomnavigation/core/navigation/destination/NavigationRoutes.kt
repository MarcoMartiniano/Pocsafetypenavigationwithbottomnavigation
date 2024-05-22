package com.marco.pocsafetypenavigationwithbottomnavigation.core.navigation.destination

import kotlinx.serialization.Serializable


@Serializable
object Routes {
    @Serializable
    object Main

    @Serializable
    object Home {
        @Serializable
        object Home
    }

    @Serializable
    object Quiz {
        @Serializable
        object Home
    }

    @Serializable
    object Favorites {
        @Serializable
        object Home
    }

    @Serializable
    object Statistics {
        @Serializable
        object Home
    }
}