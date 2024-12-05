package com.example.porto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.core.AppTheme
import com.example.feature.FeatureScreen
import com.example.feature.FeatureStringsResourceProvider

class MainActivity : ComponentActivity(), FeatureStringsResourceProvider {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme(theme = PortoTheme()) {
                FeatureScreen(stringsResourceProvider = this)
            }
        }
    }

    override fun getButtonTitle(): String {
        return this.getString(R.string.button_title)
    }
}