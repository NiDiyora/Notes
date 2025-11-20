package com.example.notes.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

// Modern, rounded shapes for premium feel
val Shapes = Shapes(
    // Small components (chips, buttons, badges)
    small = RoundedCornerShape(8.dp),
    // Medium components (cards, dialogs)
    medium = RoundedCornerShape(16.dp),
    // Large components (sheets, surfaces)
    large = RoundedCornerShape(24.dp)
)

// Custom shapes for specific use cases
object CustomShapes {
    val NoteCard = RoundedCornerShape(20.dp)
    val FAB = RoundedCornerShape(16.dp)
    val ColorPicker = RoundedCornerShape(12.dp)
    val TextField = RoundedCornerShape(12.dp)
    val SortSection = RoundedCornerShape(16.dp)
    val Chip = RoundedCornerShape(20.dp)
}
