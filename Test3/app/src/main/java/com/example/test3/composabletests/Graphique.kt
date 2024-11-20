package com.example.test3.composabletests

//import android.util.Half.
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import ir.ehsannarmani.compose_charts.LineChart
import ir.ehsannarmani.compose_charts.models.DotProperties
import ir.ehsannarmani.compose_charts.models.LabelProperties
import ir.ehsannarmani.compose_charts.models.Line


@Composable
fun Graphique() {
//    Column(
//        Modifier
//            .fillMaxSize()
//            .padding(20.dp)
//    ) {
//        Canvas(
//            Modifier.fillMaxWidth()
//                .height(300.dp)
//        ) {
//            val canvasWidth = size.width
//            val canvasHeight = size.height
//            drawLine(
//                start = Offset(x = canvasWidth, y = 0f),
//                end = Offset(x = 0f, y = canvasHeight),
//                color = Color.Magenta
//            )
//        }
//    }

    val listeValeurs = listOf<Double>(
        500.toDouble(),
        1000.toDouble(),
        1200.toDouble(),
        700.toDouble(),
        900.toDouble(),
        1300.toDouble(),
        1500.toDouble(),
    );

    LineChart(
        data = remember {
            listOf(
                Line(
                    label = "Weekly Progress",
                    values = listeValeurs,
                    color = SolidColor(Color.Magenta),
                    curvedEdges = false,
                    dotProperties = DotProperties(
                        enabled = true,
                        color = SolidColor(Color.White),
                        strokeWidth = 3.dp,
                        radius = 5.dp,
                        strokeColor = SolidColor(Color.Red)
                    ),

                )
            )
        },
        labelProperties = LabelProperties(
            enabled = true,
            textStyle = MaterialTheme.typography.labelSmall,
            labels = listOf(
                "LUN",
                "MAR",
                "MER",
                "JEU",
                "VEN",
                "SAM",
                "DIM"
            )
        )
    )
}