package com.example.test3.composabletests

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun UIDynamique() {
    var valeurCompteur by remember { mutableStateOf(0) }

    Box (
        Modifier
            .fillMaxSize()
            .padding(all = 20.dp),
        Alignment.Center,
    ){
        Column {
            Text(text = valeurCompteur.toString())
            Spacer(modifier = Modifier.height(15.dp))
            Button(onClick = { valeurCompteur++ }) {
                Icon(
                    Icons.Default.Add,
                    contentDescription = "Incrementer Compteur"
                )
            }
        }
    }
}