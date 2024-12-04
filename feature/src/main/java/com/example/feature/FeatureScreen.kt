package com.example.feature

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.core.ListCell
import com.example.core.LocalThemeColors
import com.example.core.PortugalTeamsButton

@Composable
fun FeatureScreen(modifier: Modifier = Modifier) {
    val backgroundColor = LocalThemeColors.current.background

    Box(
        modifier = Modifier.fillMaxSize().padding(16.dp).background(color = backgroundColor),
        contentAlignment = Alignment.Center,
    ) {
        PortugalTeamsButton(onClick = { }, text = "Click Here")



    }
}

data class Password(
    val title: String,
    val value: String,
)

@Composable
fun PasswordCell(password: Password) {
    ListCell {
        Text(text = password.title)
        Text(text = password.value)
    }
}