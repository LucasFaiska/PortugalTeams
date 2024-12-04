package com.example.sporting

import androidx.compose.ui.graphics.Color
import com.example.core.CustomColors
import com.example.core.PortugalTeamsTheme

class SportingTheme : PortugalTeamsTheme {
    override val colors: CustomColors
        get() = CustomColors(
            background = Color.White,
            buttonColor = Color(0xFF4B9B3C),
            buttonTextColor = Color.White,
        )
}