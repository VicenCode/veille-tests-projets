package com.example.test3.composabletests

import android.annotation.SuppressLint
import androidx.compose.animation.core.EaseInBounce
import androidx.compose.animation.core.EaseOutElastic
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@Composable
fun BarreProgres() {
    var currentProgress by remember { mutableStateOf(0f) }

    LaunchedEffect(Unit) {
        loadProgress { progress ->
            currentProgress = progress
        }
    }

    val animatedProgress by animateFloatAsState(
        targetValue = currentProgress,
        animationSpec = tween(1500, easing = EaseOutElastic)
    )

    Row (
        Modifier
            .fillMaxWidth()
            .padding(all = 20.dp),
        Arrangement.Center
    ){
        LinearProgressIndicator(
            progress = animatedProgress,
            Modifier.fillMaxWidth()
        )
    }
}

suspend fun loadProgress(updateProgress: (Float) -> Unit) {
    for (i in 1..75) {
        updateProgress(i.toFloat() / 100)
        delay(10)
    }
}