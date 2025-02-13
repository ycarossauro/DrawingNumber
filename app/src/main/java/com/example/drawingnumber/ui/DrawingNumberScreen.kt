package com.example.drawingnumber.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import kotlin.random.Random


@Preview
@Composable
fun DrawingNumberPreview() {
    DrawingNumberApp()
}

@Composable
fun DrawingNumberApp() {
    var number by remember { mutableStateOf("Resultado") }

    ConstraintLayout(
        modifier = Modifier.background(color = Color.White).fillMaxSize()
    ) {
        val (appNameRef, btnRef, resultRef) = createRefs()

        Text(text = "App de Sorteio", modifier = Modifier.constrainAs(appNameRef) {
            top.linkTo(parent.top, 32.dp)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        })

        Button(
            onClick = { number = Random.nextInt(11).toString() },
            modifier = Modifier.constrainAs(btnRef) {
                top.linkTo(appNameRef.bottom, 32.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }) {
            Text(text = "Sortear Número")
        }

        Text(text = number, modifier = Modifier.constrainAs(resultRef) {
            top.linkTo(btnRef.bottom, 32.dp)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            bottom.linkTo(parent.bottom)
        }
        )
    }
}