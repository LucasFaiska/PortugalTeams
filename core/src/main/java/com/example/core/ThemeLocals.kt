package com.example.core

import androidx.compose.runtime.compositionLocalOf

val LocalThemeColors = compositionLocalOf<CustomColors> { error("No colors provided") }