package com.example.play_juegos.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = naranjaBrillante,
    onPrimary = Color.Black,
    primaryContainer = naranjaBrillante,
    onPrimaryContainer = Color.Black,
    secondary = amarilloNeon,
    onSecondary = Color.Black,
    tertiary = verdeLima,
    onTertiary = Color.Black,
    background = grisOscuro,
    onBackground = Color.Black,
    surface = grisOscuro,
    onSurface = Color.Black,
    error = rojoClaro,
    onError = Color.Black
)

private val LightColorScheme = lightColorScheme(
    primary = naranjaBrillante,
    onPrimary = Color.Black,
    primaryContainer = naranjaBrillante,
    onPrimaryContainer = Color.White,
    secondary = amarilloNeon,
    onSecondary = Color.Black,
    tertiary = verdeLima,
    onTertiary = Color.Black,
    background = grisOscuro,
    onBackground = amarilloNeon,
    surface = grisOscuro,
    onSurface = Color.White,
    error = rojoClaro,
    onError = Color.Black
)

@Composable
fun Play_JuegosTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColorScheme else LightColorScheme
    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        content = content
    )
}
