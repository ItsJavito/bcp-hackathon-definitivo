package com.example.shpiel.presentation.foro.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun foroFields(){
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        Row(
            modifier = Modifier.weight(1f)
        ){
            topOpt()
        }
        Column(
            modifier = Modifier.weight(10f)
        ){
            Text(text ="",modifier = Modifier.padding(top=5.dp))
            textCard(name = "Nancy", comment = "La Discocococococoococcococococococococ")
            textCard(name = "Nancy", comment = "La Discocococococoococcococococococococ")
            textCard(name = "Nancy", comment = "La Discocococococoococcococococococococ")
        }
        Row(modifier = Modifier.weight(1f)){}
        Row(modifier = Modifier.weight(1f)){
            bottScaffold()
        }

    }
}

@Preview
@Composable
@Preview(showBackground = true)
fun XD(){
    foroFields()
}