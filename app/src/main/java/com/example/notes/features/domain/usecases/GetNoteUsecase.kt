package com.example.notes.features.domain.usecases

import com.example.notes.features.domain.model.Note
import com.example.notes.features.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}