package com.example.test3.composabletests

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BoutonFlottant() {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(count = 50) {
            Box(
                modifier = Modifier.padding(all= 20.dp)
            ){
                Text(text = "Un item")
            }
        }
    }
    Row (
      //modifier = Modifier.
        Modifier.fillMaxSize(),
        Arrangement.Absolute.Center,
        Alignment.Bottom
    ){
        FloatingActionButton(onClick = { print("Bouton Flottant Appuyé!") }) {
            Icon(Icons.Default.Add, contentDescription = "Bouton Flottant")
        }
    }
}