package com.example.shpiel.presentation.catalogo.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Header(){
    val headerText = "TOP Semanal"




    LazyRow(
        contentPadding = PaddingValues(start = 8.dp, top = 20.dp, bottom = 5.dp),
        modifier = Modifier
            .fillMaxWidth()
    ) {
        item {
            Text(
                text = headerText,
                fontSize = 20.sp,
                fontWeight = FontWeight.Light,
                color = Color.Black,
                modifier = Modifier.padding(start = 8.dp)
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun ShowHeader() {
    Header()
}