package com.example.shpiel.presentation.catalogo.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.shpiel.R

@Composable
fun CatalogoCarrousel(){
    val scrollState = rememberScrollState()
    Row(modifier = Modifier
        .horizontalScroll(scrollState)
        .fillMaxWidth()) {
        CatalogoCarrouselItem(
            Modifier
                .fillMaxWidth()
                .height(250.dp)
                .padding(top = 0.dp),
            "TechFusion ",
            "Fusionando Tecnología, Creando Futuro",
            "4.5",
            painterResource(id = R.drawable.tec)
        )
        CatalogoCarrouselItem(
            Modifier
                .fillMaxWidth()
                .height(250.dp)
                .padding(top = 0.dp),
            "GreenWave Innovations",
            "Innovación Verde para un Mundo Sostenible",
            "3.8",
            painterResource(id = R.drawable.verdeee)
        )
        CatalogoCarrouselItem(
            Modifier
                .fillMaxWidth()
                .height(250.dp)
                .padding(top = 0.dp),
            "StellarCraft Industries",
            "Donde la Creatividad se Convierte en Estrellas",
            "4.7",
            painterResource(id = R.drawable.estrella)
        )
        CatalogoCarrouselItem(
            Modifier
                .fillMaxWidth()
                .height(250.dp)
                .padding(top = 0.dp),
            "AquaTech Dynamics",
            "Navegando hacia un Futuro Acuático",
            "2.0",
            painterResource(id = R.drawable.agua)
        )
    }

}