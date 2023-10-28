package com.example.shpiel.presentation.catalogo.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CatalogoCarrouselItem(modifier: Modifier = Modifier, colorFondo: Color){
    val itemColor = Color(0xFFfe7901 )
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(0.dp),
        elevation = 4.dp

    ) {
        Column(modifier = Modifier.background(itemColor)) {
            Text(
                text = "Perú Innovation",
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(12.dp)
            )
            Text(
                text = "Haciendo a Perú un centro de inovación",
                color = Color.White,
                fontSize = 10.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 0.dp, start = 12.dp),
                fontWeight = FontWeight.Light
            )
            Row () {
                Text(
                    text = "Calificación: 4.5",
                    fontSize = 10.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp, start = 12.dp),

                )

            }
        }


    }
}
/*
@Composable
@Preview(showBackground = true)
fun ShowCatalogoCarrouselItem() {
    CatalogoCarrouselItem()
}*/