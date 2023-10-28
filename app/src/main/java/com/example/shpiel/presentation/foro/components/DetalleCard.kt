package com.example.shpiel.presentation.foro.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.shpiel.R

@Composable
fun DetalleCard(
    name: String,
    title: String,
    comment: String,
    tag1 : String,
    tag2: String,
    tag3: String,
    date: String,
    likes: String,
    answers: String,
    views: String
){
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ){
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 20.dp)
            ) {
                Image(
                    painterResource(R.drawable.user),
                    contentDescription = "user",
                    Modifier
                        .size(size = 30.dp)
                )
            }
            Column(
                modifier = Modifier
                    .weight(6f)
                    .padding(start = 20.dp)
            ) {
                Text(
                    text=name,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Hace 6 horas"
                )
                Text(
                    text = answers +" respuestas",
                    fontWeight = FontWeight.Bold
                )
            }
            Column(
                modifier = Modifier.weight(3f),
                horizontalAlignment = Alignment.End
            ) {
                Image(
                    painterResource(R.drawable.like),
                    contentDescription = "like",
                    Modifier
                        .size(size = 35.dp)
                )
                Text(
                    text = date
                )
            }
        }
        //Fin primer Row
        Row(
            modifier = Modifier.padding(start = 20.dp, bottom = 10.dp)
        ){
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )
        }
        Row(
            modifier = Modifier.padding(start = 20.dp, top = 5.dp)
        ){
            Text(
                text = comment,
                color = Color.Gray
            )
        }
        Row(
            modifier = Modifier.padding(start = 20.dp, top = 5.dp)
        ){
            OutlinedButton(
                onClick = { /*XD*/ },
                shape= RoundedCornerShape(50),

            ) {
                Text(tag1)
            }
            OutlinedButton(
                onClick = { /*XD*/ },
                shape= RoundedCornerShape(50),
                modifier = Modifier.padding(horizontal=10.dp)
            ) {
                Text(tag2)
            }
            OutlinedButton(
                onClick = { /*XD*/ },
                shape= RoundedCornerShape(50)
            ) {
                Text(tag2)
            }
        }
        Divider(
            modifier=Modifier.padding(vertical = 20.dp)
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ){
            Column (

            ){
                Text(
                    text = likes,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Likes",
                    color = Color.Gray
                )
            }
            Column (

            ){
                Text(
                    text = answers,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Respuestas",
                    color = Color.Gray
                )
            }
            Column (

            ){
                Text(
                    text = views,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Vistas",
                    color = Color.Gray
                )
            }
        }
    }
}

@Preview (showBackground = true)
@Composable
fun XD(){
    DetalleCard(name = "XD",
        title="XD",
        comment = "XD",
        tag1="v",
        tag2="v",
        tag3="v",
        date="29 de 29 de 29",
        likes = "123",
        answers = "100000",
        views = "2")
}