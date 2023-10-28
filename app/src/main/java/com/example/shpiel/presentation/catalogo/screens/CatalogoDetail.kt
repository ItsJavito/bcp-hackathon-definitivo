package com.example.shpiel.presentation.catalogo.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shpiel.R

@Composable
fun CatalogoDetail(){
    var clic by remember { mutableStateOf(false) }
    val azulColor = Color(0xFF00498d)
    val naranjaColor = Color(0xFFfe7901)
    Column(modifier = Modifier
        .fillMaxSize()) {

        val colorHexadecimal = "#fe7901" // Cambia este valor al color hexadecimal que desees
        val color = Color(android.graphics.Color.parseColor(colorHexadecimal))


        Image(painter = painterResource(id = R.drawable.pajerete), contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp),
                )

        Row(horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 15.dp)) {
            Text(text = "Tech",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Image(painter = painterResource(id = R.drawable.outline_star_border_24), contentDescription = null)
        }

        Text(text = "Tecnología",
            modifier = Modifier.padding(start = 20.dp,top = 15.dp),
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold)

        Text(text = "Tech S.A. es una empresa líder en el campo de la tecnología con sede en Lima, Perú. Fundada en 2015, nuestra empresa se ha centrado en el desarrollo de soluciones tecnológicas innovadoras para satisfacer las necesidades cambiantes del mercado peruano y global.",
            modifier = Modifier.padding(start = 20.dp,top = 15.dp, end = 30.dp),
            textAlign = TextAlign.Justify)

        Spacer(modifier = Modifier.size(20.dp))

        Column(
                modifier = Modifier.padding(start = 20.dp).fillMaxSize(),
            verticalArrangement = Arrangement.Bottom) {
            Text(text = "Monto mínimo de inversión", fontWeight = FontWeight.SemiBold)

            Card(
                modifier = Modifier
                    .padding(2.dp)
                    .height(30.dp)
                    .width(50.dp),
                backgroundColor = color,
                elevation = 4.dp,
                shape = MaterialTheme.shapes.small // Radio de las esquinas
            ) {
                Text(
                    text = "$10.00",
                    color = Color.White,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .wrapContentSize()
                )

            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Button(
                    onClick = {
                        clic =! clic
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentSize(align = Alignment.BottomCenter)
                        ,
                    colors = ButtonDefaults.buttonColors(if (clic) naranjaColor else azulColor)// Posición en la parte inferior
                ) {
                    Text(text = if (clic) "Realizado" else "Invertir", color = Color.White)
                }
            }
        }



    }
}

@Composable
@Preview(showBackground = true)
fun ShowCatalogoDetail() {
    CatalogoDetail()
}