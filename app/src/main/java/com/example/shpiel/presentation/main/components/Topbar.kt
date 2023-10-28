package com.example.shpiel.presentation.main.components

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.ui.text.style.TextAlign

@Composable
fun Topbar(
    onOpenDrawer: () -> Unit
){
    TopAppBar(
        title = {
            Text(text = ""
            )
        },
        navigationIcon = {
            IconButton(
                onClick = {onOpenDrawer()}
            ) {
                Icon(
                   imageVector = Icons.Filled.Menu ,
                    contentDescription = "Drawer"
                )
            }
        }
    )
}