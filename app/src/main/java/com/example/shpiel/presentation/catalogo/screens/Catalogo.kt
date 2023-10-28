package com.example.shpiel.presentation.catalogo.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.shpiel.presentation.catalogo.components.CardCarrousel
import com.example.shpiel.presentation.catalogo.components.CatalogoCarrousel
import com.example.shpiel.presentation.catalogo.components.Header
import com.example.shpiel.presentation.catalogo.components.Subtitles
import com.example.shpiel.presentation.catalogo.components.TopBarHead

@Composable
fun CatalogoScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize(),

        ) {
        TopBarHead()
        //Header()

        CatalogoCarrousel()

        Subtitles(texto = "Podría interesarte")

        CardCarrousel()

        Subtitles(texto = "Destacados")

        CardCarrousel()

    }
}