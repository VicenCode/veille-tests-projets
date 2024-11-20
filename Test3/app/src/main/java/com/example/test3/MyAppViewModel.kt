package com.example.test3

import android.text.Spannable.Factory
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

data class UiState(
    val username : String
)

class MyAppViewModel(private val nameRepository: NameRepository) : ViewModel() {
    val uiState: StateFlow<UiState> = nameRepository.currentName.map { username ->
        UiState(username)
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(3000),
        initialValue = UiState("No Data Found")
    )

    fun saveUsername(username: String) {
        viewModelScope.launch {
            nameRepository.saveUserName(username);
        }
    }

    companion object {
        fun provideFactory(dataStore: DataStore<Preferences>): ViewModelProvider.Factory =
            viewModelFactory {
                initializer {
                    val repository = NameRepository(dataStore)
                    MyAppViewModel(repository)
                }
            }
    }
}