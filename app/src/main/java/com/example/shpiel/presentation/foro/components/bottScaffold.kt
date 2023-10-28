package com.example.shpiel.presentation.foro.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.shpiel.R
@Composable
fun bottScaffold(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp, top = 10.dp, bottom = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween

    ){
        Column {
            Image(
                painterResource(R.drawable.chat),
                contentDescription = "chat",
                Modifier.size(size = 40.dp)
            )
            Text(text = "Chats")
        }
        Column {
            Image(
                painterResource(R.drawable.user),
                contentDescription = "user",
                Modifier.size(size = 40.dp)
            )
            Text(text = "Friends")
        }

        Column {
            Image(
                painterResource(R.drawable.settings),
                contentDescription = "settt",
                Modifier.size(size = 40.dp)

            )
            Text(text = "Settings")
        }

    }
}