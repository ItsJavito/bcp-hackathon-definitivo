package com.example.shpiel.presentation.catalogo.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Subtitles(texto: String){
    Row(modifier = Modifier.fillMaxWidth().padding(top = 20.dp, start = 8.dp, bottom = 15.dp)) {
        Text( text = texto,
                fontWeight = FontWeight.Light,
                fontSize = 16.sp
            )

    }
}
