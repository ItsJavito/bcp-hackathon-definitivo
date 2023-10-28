package com.example.shpiel.presentation.main.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun DrawerMenu(
    navController: NavController,
    name: String?,
    onCloseDrawer: () -> Unit,
){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ){
            //Por cambiar
            Text(
                text = name!!,
                modifier = Modifier
                    .height(90.dp)
                    .fillMaxWidth()
                    .padding(30.dp),
                textAlign = TextAlign.Center,
                fontSize = 25.sp
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ){
            Text(
                modifier = Modifier
                    .padding(vertical = 20.dp, horizontal = 25.dp)
                    .clickable { navController.navigate("Principal")
                               onCloseDrawer()},
                text = "Principal"
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth()
        ){
            Text(
                modifier = Modifier
                    .padding(vertical = 20.dp, horizontal = 25.dp)
                    .clickable { navController.navigate("Participaciones")
                               onCloseDrawer() },
                text = "Participaciones"
            )
        }
    }
}