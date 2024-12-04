package com.example.portugalteams

import androidx.compose.ui.graphics.Color
import com.example.core.CustomColors
import com.example.core.PortugalTeamsTheme

class BenficaTheme : PortugalTeamsTheme {
    override val colors: CustomColors
        get() = CustomColors(
            background = Color.White,
            buttonColor = Color(0xFFD50032),
            buttonTextColor = Color.White,
        )
}