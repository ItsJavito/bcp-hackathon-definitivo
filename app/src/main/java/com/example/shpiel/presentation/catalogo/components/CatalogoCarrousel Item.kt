package com.example.shpiel.presentation.catalogo.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CatalogoCarrouselItem(modifier: Modifier = Modifier, nombre: String, lema: String, calificacion: String, imagen: Painter){
    val itemColor = Color(0xFF00498d  )

    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(0.dp),
        elevation = 4.dp

    ) {
        Box(modifier = Modifier.fillMaxSize()){
            Image(
                painter = imagen,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize().alpha(0.4f)
            )

            Column(modifier = Modifier.fillMaxHeight()) {
                Text(
                    text = nombre,
                    color = itemColor,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(12.dp)
                )
                Text(
                    text = lema,
                    color = itemColor,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 0.dp, start = 12.dp),
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = calificacion,
                    color = itemColor,
                    fontSize = 16.sp,
                    modifier = Modifier.fillMaxSize().padding(bottom = 10.dp, start = 12.dp),
                    fontWeight = FontWeight.SemiBold
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