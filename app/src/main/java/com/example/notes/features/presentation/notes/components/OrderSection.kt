package com.example.notes.features.presentation.notes.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.notes.features.domain.utils.NoteOrder
import com.example.notes.features.domain.utils.OrderType
import com.example.notes.ui.theme.CustomShapes

@Composable
fun OrderSection(
    modifier: Modifier = Modifier,
    noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    onOrderChange: (NoteOrder) -> Unit
) {
    Box(
        modifier = modifier
            .clip(CustomShapes.SortSection)
            .background(MaterialTheme.colorScheme.surfaceVariant)
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            // Sort By Section
            Text(
                text = "Sort by",
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontWeight = FontWeight.SemiBold
            )
            
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                FilterChip(
                    text = "Title",
                    selected = noteOrder is NoteOrder.Title,
                    onClick = { onOrderChange(NoteOrder.Title(noteOrder.orderType)) },
                    modifier = Modifier.weight(1f)
                )
                FilterChip(
                    text = "Date",
                    selected = noteOrder is NoteOrder.Date,
                    onClick = { onOrderChange(NoteOrder.Date(noteOrder.orderType)) },
                    modifier = Modifier.weight(1f)
                )
                FilterChip(
                    text = "Color",
                    selected = noteOrder is NoteOrder.Color,
                    onClick = { onOrderChange(NoteOrder.Color(noteOrder.orderType)) },
                    modifier = Modifier.weight(1f)
                )
            }

            Spacer(modifier = Modifier.height(4.dp))

            // Order Type Section
            Text(
                text = "Order",
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontWeight = FontWeight.SemiBold
            )
            
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                FilterChip(
                    text = "Ascending",
                    selected = noteOrder.orderType is OrderType.Ascending,
                    onClick = {
                        onOrderChange(noteOrder.copyNoteHelper(OrderType.Ascending))
                    },
                    modifier = Modifier.weight(1f)
                )
                FilterChip(
                    text = "Descending",
                    selected = noteOrder.orderType is OrderType.Descending,
                    onClick = {
                        onOrderChange(noteOrder.copyNoteHelper(OrderType.Descending))
                    },
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}

@Composable
private fun FilterChip(
    text: String,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .clip(CustomShapes.Chip)
            .background(
                color = if (selected) {
                    MaterialTheme.colorScheme.primaryContainer
                } else {
                    MaterialTheme.colorScheme.surface
                }
            )
            .clickable(onClick = onClick)
            .padding(horizontal = 16.dp, vertical = 10.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelMedium,
            color = if (selected) {
                MaterialTheme.colorScheme.onPrimaryContainer
            } else {
                MaterialTheme.colorScheme.onSurface
            },
            fontWeight = if (selected) FontWeight.SemiBold else FontWeight.Normal
        )
    }
}

@Preview(showBackground = true)
@Composable
fun OrderSectionPreview() {
    MaterialTheme {
        OrderSection(onOrderChange = {})
    }
}