package com.example.notes.di

import android.app.Application
import androidx.room.Room
import com.example.notes.features.data.data_source.NoteDB
import com.example.notes.features.data.repository.NoteRepositoryImpl
import com.example.notes.features.domain.repository.NoteRepository
import com.example.notes.features.domain.usecases.AddNote
import com.example.notes.features.domain.usecases.DeleteNote
import com.example.notes.features.domain.usecases.GetNote
import com.example.notes.features.domain.usecases.GetNotes
import com.example.notes.features.domain.usecases.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDB {
        return Room.databaseBuilder(
            app,
            NoteDB::class.java,
            NoteDB.DB_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDB): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository),
            addNote = AddNote(repository),
            getIndividualNote = GetNote(repository)
        )
    }

}