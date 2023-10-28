package com.example.shpiel.presentation.perfil.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.shpiel.R

@Composable
fun perfilFields(){
    Column(
        modifier = Modifier.fillMaxSize()
    ){
        Row(
            modifier= Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ){
            Text(
                text = "NOMBRE DE PROYECTO {PLACEHOLDER}"
            )
        }
        Row(
            modifier= Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ){
            Image(
                painterResource(R.drawable.user),
                contentDescription = "user",
                Modifier
                    .size(size = 30.dp)
            )
            Text(text = "XD")

        }
    }
}

@Preview(showBackground = true)
@Composable
fun llll(){
    perfilFields()
}