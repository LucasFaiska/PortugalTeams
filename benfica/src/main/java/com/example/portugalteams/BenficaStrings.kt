package com.example.portugalteams

import android.content.Context
import androidx.compose.ui.graphics.Color
import com.example.core.CustomColors
import com.example.core.PortugalTeamsTheme
import com.example.feature.FeatureStringsResourceProvider

class BenficaStrings(val context: Context) : FeatureStringsResourceProvider {
    override fun getButtonTitle(): String {
        return context.getString(R.string.button_title)
    }
}