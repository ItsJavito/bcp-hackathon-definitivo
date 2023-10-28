package com.example.shpiel.presentation.principal.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
@Composable
fun Carousel(carouselItems: List<String>) {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 8.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        items(carouselItems) { item ->
            CarouselItem(imageUrl = item)
        }
    }
}

@Composable
fun CarouselItem(imageUrl: String) {
    val painter = rememberImagePainter(imageUrl)
    Image(
        painter = painter,
        contentDescription = null,
        modifier = Modifier
            .padding(4.dp)
            .size(200.dp, 150.dp),
        contentScale = ContentScale.Crop
    )
}




