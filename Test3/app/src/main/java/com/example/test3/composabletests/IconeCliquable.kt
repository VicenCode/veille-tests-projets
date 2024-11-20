package com.example.test3.composabletests

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun IconeCliquable() {
    Column(
        modifier = Modifier.fillMaxSize(),
        Arrangement.Center
    ) {
        IconButton(onClick = { print("Icône Cliqué!")}) {
            Icon(
                Icons.Default.AccountCircle,
                contentDescription = "profile"
            )
        }
    }
}