package com.example.test3.composabletests

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.test3.MyAppViewModel

@Composable
fun EcritureLectureLocale(
    myAppViewModel: MyAppViewModel
) {

    var userInput by remember { mutableStateOf("") }
    val savedUsername by myAppViewModel.uiState.collectAsState()

    Column(
        Modifier
            .fillMaxSize()
            .padding(all = 20.dp)
    ) {
        TextField(
            value = userInput,
            onValueChange = { userInput = it }
        )
        Spacer(modifier = Modifier
            .size(20.dp)
            .fillMaxWidth())
        Button(
            onClick = { myAppViewModel.saveUsername(userInput) }
        ) {
            Text(text = "Sauvegarder")
        }
        Spacer(modifier = Modifier.size(40.dp))
        Text(
            text = "Bonjour ${savedUsername.username}",
            style = MaterialTheme.typography.displayMedium
        )
    }
}