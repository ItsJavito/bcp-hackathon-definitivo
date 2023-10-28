package com.example.shpiel.presentation.inversionistas.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.shpiel.presentation.catalogo.components.TopBarHead
import com.example.shpiel.presentation.inversionistas.Components.InversionisaItem

@Composable
fun InversionistasScreen(){

    Column {
        TopBarHead()

        Column(modifier = Modifier.padding(20.dp)) {

            InversionisaItem("María Lopez", "Interesada en tecnología")
            InversionisaItem("Giancarlo Castro", "Interesado en aviación")
            InversionisaItem("Brillitt Salazar", "Interesada en negocios diversos")

        }
    }

}

@Composable
@Preview(showBackground = true)
fun ShowInversionistasScreen() {
    InversionistasScreen()
}