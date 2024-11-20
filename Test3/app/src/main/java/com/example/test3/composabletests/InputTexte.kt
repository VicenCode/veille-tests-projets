package com.example.test3.composabletests

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue

@Composable
fun InputTexte() {
    var valeurInput by remember {
        mutableStateOf(TextFieldValue(""))
    }

    TextField(
        value = valeurInput,
        onValueChange = {value -> valeurInput = value},
        label = { Text("Entrez votre nom")}
    )
}