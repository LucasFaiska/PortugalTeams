package com.example.core

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun AppTheme(theme: PortugalTeamsTheme, content: @Composable () -> Unit) {
    MaterialTheme

    CompositionLocalProvider(
        LocalThemeColors provides theme.colors,
        content = content
    )
}