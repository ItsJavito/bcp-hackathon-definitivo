package com.example.shpiel.presentation.inversionistas.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.shpiel.presentation.inversionistas.Components.DetailComp
import com.example.shpiel.presentation.inversionistas.Components.InversionisaItem

@Composable
fun InversionistasDetail(){
    Column {
        InversionisaItem("María Lopez", "Interesada en tecnología" )
        Column(modifier = Modifier.padding(top = 15.dp)) {
            DetailComp("Tecnología", "10%")
            DetailComp("Alimentos", "15%")
            DetailComp("Camiones", "20%")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun ShowInversionistasDetail() {
    InversionistasDetail()
}