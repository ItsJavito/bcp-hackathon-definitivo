package com.example.shpiel.presentation.catalogo.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.shpiel.R

@Composable
fun CardCarrousel(){
    //val cardBackground = painterResource(id = R.drawable.background_image)

    Row {
        CardCarrouselItem("EcoTech ", "4.2", painterResource(id = R.drawable.verdeee))
        CardCarrouselItem("InfinityWave  ", "3.2", painterResource(id = R.drawable.teccc))
        CardCarrouselItem("SolarSolutions ", "4.8", painterResource(id = R.drawable.estrellas))
        CardCarrouselItem("BioGenius  ", "3.7", painterResource(id = R.drawable.verdeee))
    }
}