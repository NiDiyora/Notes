package com.example.notes.features.presentation.notes

import com.example.notes.features.domain.model.Note
import com.example.notes.features.domain.utils.NoteOrder
import com.example.notes.features.domain.utils.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
