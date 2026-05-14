package com.example.sporting

import android.content.Context
import androidx.compose.ui.graphics.Color
import com.example.core.CustomColors
import com.example.core.PortugalTeamsTheme
import com.example.feature.FeatureStringsResourceProvider

class SportingStrings(val context: Context) : FeatureStringsResourceProvider {
    override fun getButtonTitle(): String {
        return context.getString(R.string.button_title)
    }
}