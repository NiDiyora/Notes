package com.example.notes.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val LightColorScheme = lightColorScheme(
    primary = LightColors.Primary,
    onPrimary = LightColors.OnPrimary,
    primaryContainer = LightColors.PrimaryVariant,
    onPrimaryContainer = LightColors.OnPrimary,
    
    secondary = LightColors.Secondary,
    onSecondary = LightColors.OnSecondary,
    secondaryContainer = LightColors.SecondaryVariant,
    onSecondaryContainer = LightColors.OnSecondary,
    
    tertiary = LightColors.Accent1,
    onTertiary = LightColors.OnPrimary,
    
    error = LightColors.Error,
    onError = LightColors.OnError,
    errorContainer = LightColors.Error,
    onErrorContainer = LightColors.OnError,
    
    background = LightColors.Background,
    onBackground = LightColors.OnBackground,
    
    surface = LightColors.Surface,
    onSurface = LightColors.OnSurface,
    surfaceVariant = LightColors.SurfaceVariant,
    onSurfaceVariant = LightColors.OnSurfaceVariant,
    
    outline = LightColors.Outline,
    outlineVariant = LightColors.OutlineVariant,
    
    inverseSurface = LightColors.OnBackground,
    inverseOnSurface = LightColors.Background,
    inversePrimary = LightColors.PrimaryVariant
)

private val DarkColorScheme = darkColorScheme(
    primary = DarkColors.Primary,
    onPrimary = DarkColors.OnPrimary,
    primaryContainer = DarkColors.PrimaryVariant,
    onPrimaryContainer = DarkColors.OnPrimary,
    
    secondary = DarkColors.Secondary,
    onSecondary = DarkColors.OnSecondary,
    secondaryContainer = DarkColors.SecondaryVariant,
    onSecondaryContainer = DarkColors.OnSecondary,
    
    tertiary = DarkColors.Accent1,
    onTertiary = DarkColors.OnPrimary,
    
    error = DarkColors.Error,
    onError = DarkColors.OnError,
    errorContainer = DarkColors.Error,
    onErrorContainer = DarkColors.OnError,
    
    background = DarkColors.Background,
    onBackground = DarkColors.OnBackground,
    
    surface = DarkColors.Surface,
    onSurface = DarkColors.OnSurface,
    surfaceVariant = DarkColors.SurfaceVariant,
    onSurfaceVariant = DarkColors.OnSurfaceVariant,
    
    outline = DarkColors.Outline,
    outlineVariant = DarkColors.OutlineVariant,
    
    inverseSurface = DarkColors.OnBackground,
    inverseOnSurface = DarkColors.Background,
    inversePrimary = DarkColors.PrimaryVariant
)

@Composable
fun NotesappcomposeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true, // Enable Material You dynamic colors on Android 12+
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
