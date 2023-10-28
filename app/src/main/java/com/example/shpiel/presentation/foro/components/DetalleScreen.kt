package com.example.shpiel.presentation.foro.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DetalleScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .padding(bottom=10.dp)
        ) {
            topOpt()
        }
        Row(
            modifier = Modifier.fillMaxWidth()
                .border(1.dp, Color.Gray)
                .padding(all=20.dp)
        ){
            DetalleCard(
                name = "XD",
                title = "XD",
                comment = "XD",
                tag1 = "v",
                tag2 = "v",
                tag3 = "v",
                date = "29 de 29 de 29",
                likes = "123",
                answers = "100000",
                views = "2"
            )
        }
    }
}

@Preview (showBackground = true)
@Composable
fun lmao(){
    DetalleScreen()
}