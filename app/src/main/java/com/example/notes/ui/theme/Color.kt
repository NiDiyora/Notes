package com.example.notes.ui.theme

import androidx.compose.ui.graphics.Color

// Legacy colors (kept for backward compatibility with Note model)
val RedOrange = Color(0xFFFFAB91)
val RedPink = Color(0xFFF48FB1)
val BabyBlue = Color(0xFF81DEEA)
val Violet = Color(0xFFCF94DA)
val LightGreen = Color(0xFFE7ED9B)

// Light Theme Colors - Clean, Bright, Modern
object LightColors {
    val Primary = Color(0xFF6366F1) // Indigo
    val PrimaryVariant = Color(0xFF4F46E5)
    val Secondary = Color(0xFF8B5CF6) // Purple
    val SecondaryVariant = Color(0xFF7C3AED)
    
    val Background = Color(0xFFFAFAFA) // Soft white
    val Surface = Color(0xFFFFFFFF) // Pure white
    val SurfaceVariant = Color(0xFFF5F5F5) // Light gray
    
    val OnPrimary = Color(0xFFFFFFFF)
    val OnSecondary = Color(0xFFFFFFFF)
    val OnBackground = Color(0xFF1F2937) // Dark gray
    val OnSurface = Color(0xFF1F2937)
    val OnSurfaceVariant = Color(0xFF6B7280) // Medium gray
    
    val Error = Color(0xFFEF4444)
    val OnError = Color(0xFFFFFFFF)
    
    val Outline = Color(0xFFE5E7EB) // Light border
    val OutlineVariant = Color(0xFFF3F4F6)
    
    // Accent colors for cards and highlights
    val Accent1 = Color(0xFF10B981) // Emerald
    val Accent2 = Color(0xFF3B82F6) // Blue
    val Accent3 = Color(0xFFF59E0B) // Amber
    
    // Note card colors (enhanced)
    val NoteColor1 = Color(0xFFFFAB91) // Coral
    val NoteColor2 = Color(0xFFE7ED9B) // Lime
    val NoteColor3 = Color(0xFFCF94DA) // Lavender
    val NoteColor4 = Color(0xFF81DEEA) // Sky
    val NoteColor5 = Color(0xFFF48FB1) // Pink
}

// Dark Theme Colors - Bold, Elegant, Premium
object DarkColors {
    val Primary = Color(0xFF818CF8) // Light Indigo
    val PrimaryVariant = Color(0xFF6366F1)
    val Secondary = Color(0xFFA78BFA) // Light Purple
    val SecondaryVariant = Color(0xFF8B5CF6)
    
    val Background = Color(0xFF0F172A) // Deep navy
    val Surface = Color(0xFF1E293B) // Slate
    val SurfaceVariant = Color(0xFF334155) // Dark slate
    
    val OnPrimary = Color(0xFF0F172A)
    val OnSecondary = Color(0xFF0F172A)
    val OnBackground = Color(0xFFF8FAFC) // Almost white
    val OnSurface = Color(0xFFF1F5F9) // Light gray
    val OnSurfaceVariant = Color(0xFFCBD5E1) // Medium gray
    
    val Error = Color(0xFFF87171)
    val OnError = Color(0xFF0F172A)
    
    val Outline = Color(0xFF475569) // Medium border
    val OutlineVariant = Color(0xFF334155)
    
    // Accent colors for cards and highlights
    val Accent1 = Color(0xFF34D399) // Emerald
    val Accent2 = Color(0xFF60A5FA) // Blue
    val Accent3 = Color(0xFFFBBF24) // Amber
    
    // Note card colors (enhanced for dark theme)
    val NoteColor1 = Color(0xFFFF8A80) // Bright Coral
    val NoteColor2 = Color(0xFFD4E157) // Bright Lime
    val NoteColor3 = Color(0xFFCE93D8) // Bright Lavender
    val NoteColor4 = Color(0xFF80DEEA) // Bright Sky
    val NoteColor5 = Color(0xFFF48FB1) // Bright Pink
}

// Gradient colors for premium effects
object GradientColors {
    val LightPrimary = listOf(
        Color(0xFF6366F1),
        Color(0xFF8B5CF6)
    )
    val LightBackground = listOf(
        Color(0xFFFAFAFA),
        Color(0xFFFFFFFF)
    )
    val DarkPrimary = listOf(
        Color(0xFF818CF8),
        Color(0xFFA78BFA)
    )
    val DarkBackground = listOf(
        Color(0xFF0F172A),
        Color(0xFF1E293B)
    )
}