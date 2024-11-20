package com.example.test3.composabletests

import androidx.compose.animation.core.EaseInOutElastic
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.style.TextMotion
import androidx.compose.ui.unit.dp

@Composable
fun AnimationTexteChargement() {

    var currentScale by remember { mutableStateOf(1f) }

    LaunchedEffect(Unit) {
        currentScale = 2f
    }

    val scale by animateFloatAsState(
        targetValue = currentScale,
        animationSpec = tween(1400, easing = EaseInOutElastic)
    )

    Row (
        Modifier
            .fillMaxSize()
            .padding(50.dp),
        Arrangement.Center,
        Alignment.CenterVertically
    ){
        Text(
            text = "Un simple Texte Animé",
            Modifier.graphicsLayer {
                scaleX = scale
                scaleY = scale
                transformOrigin = TransformOrigin.Center
            },
            style = LocalTextStyle.current.copy(textMotion = TextMotion.Animated)
        )
    }
}