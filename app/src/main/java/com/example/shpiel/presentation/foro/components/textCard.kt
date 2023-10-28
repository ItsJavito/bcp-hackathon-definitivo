package com.example.shpiel.presentation.foro.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.Image
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.shpiel.R
import com.example.shpiel.presentation.login.components.LoginFields

@Composable
fun textCard(
    name: String,
    comment: String,
){
    Row (
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.padding(horizontal = 8.dp,
            vertical=15.dp)
    ){
        Column(
            modifier = Modifier.weight(1f)
        ) {
        Image(
            painterResource(R.drawable.user),
            contentDescription = "user",
            Modifier
                .size(size = 35.dp)
        )
        }
        Column(
            Modifier.weight(7f)
                .padding(horizontal = 6.dp )
        ) {
            Text(
                text = name,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = comment
            )
        }
        Column(
            Modifier.weight(1f)
                .padding(start = 5.dp)
        )
        {
            Image(
                painterResource(R.drawable.eo_circle_blue_number_2_svg),
                contentDescription = "crc",
                Modifier
                    .size(size = 20.dp)
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
// fondo blanco
fun test(){
    textCard(
        name = "XDDD",
        comment = "lalalalal"
    )
}