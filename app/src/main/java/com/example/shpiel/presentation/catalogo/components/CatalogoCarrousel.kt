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
import androidx.compose.ui.unit.dp

@Composable
fun CatalogoCarrousel(){

    LazyRow {
        items(5) { index ->
            CatalogoCarrouselItem(
                modifier = Modifier
                    .fillParentMaxWidth()
                    .height(250.dp)
                    .padding(top = 0.dp),
                colorFondo = if (index % 2 == 0) Color.Blue else Color.Red
            )
        }
    }

}