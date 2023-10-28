package com.example.shpiel.presentation.inversionistas.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DetailComp(lugar: String, porcentaje: String){
    val itemColor = Color(0xFF00498d  )

    Card(shape = RoundedCornerShape(12.dp), elevation = 2.dp) {
        Row(modifier = Modifier
            .padding(12.dp)
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column() {
                Row {
                    Text(text = "Invirtió en ")
                    Text(text = lugar)
                }
                Row {
                    Text(text = "Invirtió el ", fontWeight = FontWeight.Light)
                    Text(text = porcentaje, fontWeight = FontWeight.Light)
                    Text(text = " de su capital ", fontWeight = FontWeight.Light)
                }
            }
            Card (modifier = Modifier,
                shape = RoundedCornerShape(12.dp),
                backgroundColor = itemColor
            ) {
                Text(text = porcentaje, color = Color.White, modifier = Modifier.padding(5.dp))
            }
        }
    }


}

@Composable
@Preview(showBackground = true)
fun ShowDetailComp() {
    DetailComp("Starbucks", "20%")
}