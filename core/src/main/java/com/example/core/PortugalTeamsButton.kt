package com.example.core

import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun PortugalTeamsButton(modifier: Modifier = Modifier, onClick: () -> Unit, text: String) {
    val colors = LocalThemeColors.current

    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(backgroundColor = colors.buttonColor)
    ) {
        Text(text = text, color = colors.buttonTextColor)
    }
}