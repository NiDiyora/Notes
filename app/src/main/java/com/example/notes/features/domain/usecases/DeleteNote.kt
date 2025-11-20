package com.example.notes.features.domain.usecases

import com.example.notes.features.domain.model.Note
import com.example.notes.features.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}