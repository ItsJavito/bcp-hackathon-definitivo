package com.example.shpiel.presentation.inversionistas.Components

import androidx.compose.foundation.Image
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shpiel.R

@Composable
fun InversionisaItem(nombre: String, descp: String){
    val itemColor = Color(0xFF00498d  )
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .padding(15.dp)
            ,
        shape = RoundedCornerShape(12.dp),
        elevation = 4.dp
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            // Imagen de fondo
            Image(
                painter = painterResource(id = R.drawable.pajerete ),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth()
            )

            // Contenido en la parte inferior con fondo blanco
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                    //.background(Color.White)
                    //.padding(16.dp),
                    //.height(50.dp),
                verticalArrangement = Arrangement.Bottom
            ) {
                Column(modifier = Modifier
                    .height(120.dp)
                    .background(Color.White)
                    .fillMaxWidth(), verticalArrangement = Arrangement.Bottom) {
                    Text(
                        text = nombre,
                        style = MaterialTheme.typography.h6,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 20.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = descp,
                        style = MaterialTheme.typography.body1,
                        modifier = Modifier.padding(start = 20.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Button(
                        onClick = {
                            // Acción al hacer clic en el botón "Seguir"
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp),
                        colors = ButtonDefaults.buttonColors(itemColor),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Text(text = "Seguir", color = Color.White)
                    }
                }
            }

            // Etiqueta en la esquina superior derecha
            Text(
                text = "TAG",
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(8.dp)
                    .background(itemColor)
                    .padding(4.dp),
                color = Color.White
            )
        }
    }
}


@Composable
@Preview(showBackground = true)
fun ShowInversionisaItem() {
    InversionisaItem("Juanita", "Ingeniería Electrónica")
}