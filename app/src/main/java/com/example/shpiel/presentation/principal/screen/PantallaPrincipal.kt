package com.example.shpiel.presentation.principal.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.tooling.preview.Preview
import com.example.shpiel.presentation.principal.components.Carousel

@Composable
@Preview(showBackground = true)
public fun PantallaPrincipal(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row {
            Text("Pantalla de busqueda")
        }
        Row {
            Carousel(listOf("https://picsum.photos/200/300","https://picsum.photos/200/301","https://picsum.photos/200/302"))
        }
        Row {
            Carousel(listOf("https://picsum.photos/200/300","https://picsum.photos/200/301","https://picsum.photos/200/302"))
        }
        Row {
            Carousel(listOf("https://picsum.photos/200/300","https://picsum.photos/200/301","https://picsum.photos/200/302"))
        }

    }

}