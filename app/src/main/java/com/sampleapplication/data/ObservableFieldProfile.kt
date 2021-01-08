package com.sampleapplication.data

import androidx.databinding.ObservableInt

data class ObservableFieldProfile(
    val name: String,
    val lastName: String,
    val likes: ObservableInt
)