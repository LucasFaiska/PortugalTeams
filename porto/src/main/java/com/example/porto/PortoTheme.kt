package com.example.porto

import androidx.compose.ui.graphics.Color
import com.example.core.CustomColors
import com.example.core.PortugalTeamsTheme

class PortoTheme : PortugalTeamsTheme {
    override val colors: CustomColors
        get() = CustomColors(
            background = Color.White,
            buttonColor = Color(0xFF004B87),
            buttonTextColor = Color.White,
        )
}