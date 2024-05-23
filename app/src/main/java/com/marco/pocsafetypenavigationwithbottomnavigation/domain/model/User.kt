package com.marco.pocsafetypenavigationwithbottomnavigation.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Parcelize
@Serializable
data class User(
    val name: String,
) : Parcelable