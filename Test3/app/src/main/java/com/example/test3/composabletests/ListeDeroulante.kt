package com.example.test3.composabletests

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ListeDeroulante() {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(count = 50) { index ->
            Box (
                Modifier.padding(all= 20.dp)
            ){
                Text(text = "un item $index")
            }
        }
    }
}