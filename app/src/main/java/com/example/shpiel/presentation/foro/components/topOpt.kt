package com.example.shpiel.presentation.foro.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun topOpt(){
    Row(
        modifier = Modifier.fillMaxWidth()
            .background(Color.Blue)

    ){
        Row(
            modifier = Modifier.padding(horizontal = 15.dp, vertical=20.dp)
        ){
            Column(
                modifier = Modifier.weight(1f)

            ) {
                Text(
                    text = "Nuevo",
                    color = Color.White
                )
            }
            Column(
                modifier = Modifier.weight(1f)

            ) {
                Text(
                    text = "Destacado",
                    color = Color.White
                )
            }
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "Frecuente",
                    color = Color.White
                )
            }
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "Más visitados",
                    color = Color.White
                )
            }

        }
        }
}