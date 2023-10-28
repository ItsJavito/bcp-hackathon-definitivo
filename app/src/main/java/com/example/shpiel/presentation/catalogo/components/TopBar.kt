package com.example.shpiel.presentation.catalogo.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun TopBarHead(){
    TopAppBar(
        title = {
            Text(
                text = "A Y L L U",
                color = Color.Black,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Light,
                modifier = Modifier.fillMaxWidth()
            )
        },
        backgroundColor = Color.White
    )
}