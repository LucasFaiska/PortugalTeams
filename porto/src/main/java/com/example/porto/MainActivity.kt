package com.example.porto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.core.AppTheme
import com.example.feature.FeatureScreen
import com.example.feature.FeatureStringsResourceProvider

class MainActivity : ComponentActivity() {

    val stringsResourceProvider = PortoStrings(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme(theme = PortoTheme()) {
                FeatureScreen(stringsResourceProvider = stringsResourceProvider)
            }
        }
    }
}