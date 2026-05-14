package com.example.porto

import android.content.Context
import com.example.feature.FeatureStringsResourceProvider

class PortoStrings(val context: Context) : FeatureStringsResourceProvider {
    override fun getButtonTitle(): String {
        return context.getString(R.string.button_title)
    }
}