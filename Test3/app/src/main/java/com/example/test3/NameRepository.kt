package com.example.test3

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class NameRepository(private val dataStore: DataStore<Preferences>){
    private companion object {
        val USER_NAME = stringPreferencesKey("user_name")
        //val TEST_SAVE = arrayP
    }

    val currentName : Flow<String> = dataStore.data.map { preferences ->
        preferences[USER_NAME] ?: "No data Found"
    }

    suspend fun saveUserName(newUsername: String) {
        dataStore.edit { preferences ->
            preferences[USER_NAME] =  newUsername
        }
    }
}