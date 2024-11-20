package com.example.test3.composabletests

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DropdownTest() {
    val listeValeurDropdown = listOf<String>(
        "V0",
        "V1",
        "V2",
        "V3",
        "V4",
        "V5",
        "V0",
        "V1",
        "V2",
        "V3",
        "V4",
        "V5",
        "V0",
        "V1",
        "V2",
        "V3",
        "V4",
        "V5",
        "V0",
        "V1",
        "V2",
        "V3",
        "V4",
        "V5",
        "V0",
        "V1",
        "V2",
        "V3",
        "V4",
        "V5"
    );

    var selectedOption by remember { mutableStateOf("V0") }
    var isExpanded by remember { mutableStateOf(false) }


    Column(
        Modifier.fillMaxSize(),
        Arrangement.Center,
        Alignment.CenterHorizontally
    ) {
        Box (
            modifier = Modifier
                .width(80.dp)
                .wrapContentSize(Alignment.TopCenter)
        ){
            Row(
                Modifier.clickable(onClick = { isExpanded = !isExpanded })
            ) {
                Text(text = selectedOption)

                Icon(
                    Icons.Default.ArrowDropDown,
                    contentDescription = "Select Level"
                )
            }

            DropdownMenu(
                expanded = isExpanded,
                onDismissRequest = { isExpanded = !isExpanded },
                modifier = Modifier.height(200.dp)
            ) {
                for (niveau in listeValeurDropdown) {
                    DropdownMenuItem(
                        text = { Text(niveau) },
                        onClick = { selectedOption = niveau }
                    )
                }
            }
        }

    }
}