package com.example.shpiel.presentation.main.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun ListaDyn(
    cantidad: String,
    listaParticipantes: MutableList<String>,
    addParticipante : (String) -> Unit,
    removeParticipante : () -> Unit
){
    val keyboardController = LocalSoftwareKeyboardController.current
    var textState = remember{ mutableStateOf("")}

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 5.dp, horizontal = 50.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ){
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.weight(4f)
            ) {
                TextField(
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email,
                        imeAction = ImeAction.Done),
                    keyboardActions = KeyboardActions(onDone= {keyboardController?.hide()}),
                    value = textState.value,
                    onValueChange = {textState.value = it},
                    modifier = Modifier
                        .padding(end = 4.dp),

                )
            }
            Button(
                modifier = Modifier.weight(1f)
                    .padding(end = 4.dp),
                onClick = {
                    if(textState.value.trim() == "" && listaParticipantes.size <= cantidad.toInt()) {
                        println("Validación funciona")
                    }else{
                        addParticipante(textState.value);
                        /*listaParticipantes.add(textState.value)
                        textState.value = ""*/
                    }
                }
            ){
                Text(
                    text = "+",
                    fontSize = 25.sp
                )
            }
            Button(
                modifier = Modifier.weight(1f),
                onClick = {
                    removeParticipante();
                }
            ){
                Text(
                    text = "-",
                    fontSize = 25.sp
                )
            }
        }
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 5.dp, horizontal = 50.dp)) 
    {
         lista(listaPar = listaParticipantes)
    }
}
@Composable
fun lista(listaPar: MutableList<String>){
    LazyColumn{
        items(listaPar.size)
        {
                index -> Text(listaPar[index])
        }
    }
}

