package com.example.shpiel.presentation.catalogo.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shpiel.R

@Composable
fun CardCarrouselItem(nombre: String, calificacion: String, imagen: Painter){
    Card(
        modifier = Modifier
            .height(200.dp)
            .padding(10.dp)
            .width(170.dp)
            .clickable {
            },
        elevation = 2.dp,
        shape = RoundedCornerShape(12.dp),
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            // Imagen de fondo
            Image(
                painter = imagen,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

            // Contenido en la parte inferior con fondo blanco
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White.copy(alpha = 1f))
                    .height(55.dp)
                    .align(Alignment.BottomCenter),
                verticalArrangement = Arrangement.Bottom
            ) {
                Text(
                    text = nombre,
                    style = MaterialTheme.typography.body2,
                    modifier = Modifier.padding(start = 20.dp, top = 5.dp)
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = calificacion,
                    modifier = Modifier.padding(start = 20.dp, bottom = 5.dp),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }
}