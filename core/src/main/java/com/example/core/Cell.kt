package com.example.core

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ListCell(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    Box(
        modifier = Modifier.padding(8.dp).background(Color.Blue)
    ) {
        content()
    }
}