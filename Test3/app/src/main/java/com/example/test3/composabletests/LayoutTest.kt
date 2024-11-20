package com.example.test3.composabletests

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LayoutTest() {
    var modifieurCommun = Modifier.background(
        color = Color.Magenta,
        shape = RoundedCornerShape(5.dp)
    )

    Box (
        Modifier
            .fillMaxSize()
            .padding(all = 20.dp)
    ){
        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Row (
                //Modifier.fillMaxWidth()
            ){
                Box (
                    modifier = modifieurCommun
                        .size(width = 400.dp, height = 80.dp)
                )
            }

            Row (
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ){
                Column(
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Box (
                        modifier = modifieurCommun
                            .size(width = 80.dp, height = 200.dp)
                    )
                }
                Column(
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Box (
                        modifier = modifieurCommun
                            .size(width = 80.dp, height = 95.dp)
                    )
                    Box (
                        modifier = modifieurCommun
                            .size(width = 80.dp, height = 95.dp)
                    )
                }
                Column(
                ) {
                    Box (
                        modifier = modifieurCommun
                            .fillMaxWidth()
                            .height(200.dp)
                    )
                }
            }
        }
    }
}