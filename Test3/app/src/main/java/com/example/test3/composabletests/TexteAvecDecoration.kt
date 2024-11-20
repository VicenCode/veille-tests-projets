package com.example.test3.composabletests

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TexteAvecDecoration() {
    Box (
        Modifier.fillMaxSize(),
        Alignment.Center,
    ){
        Box(
            Modifier
                .border(
                    border = BorderStroke(2.dp, Color.Magenta),
                    shape = RoundedCornerShape(5.dp)
                )
                .padding(all= 7.dp)
        ) {
            Text(
                text = "Novice",
                style = TextStyle(
                    fontStyle = FontStyle.Italic,
                    fontSize = 16.sp
                )
            )
        }
    }
}