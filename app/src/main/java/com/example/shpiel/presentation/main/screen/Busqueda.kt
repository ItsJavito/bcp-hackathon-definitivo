package com.example.shpiel.presentation.main.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.shpiel.model.entity.Evento
import com.example.shpiel.presentation.main.components.Fila
import com.example.shpiel.presentation.main.components.Header
import com.example.shpiel.presentation.main.viewmodels.EventoViewModel
import com.example.shpiel.presentation.main.viewmodels.EventoViewModelFactory
import com.example.shpiel.presentation.main.viewmodels.MainViewModel
import com.example.shpiel.presentation.main.viewmodels.MainViewModelFactory

@Composable
fun Busqueda(
    vm : MainViewModel = viewModel(factory = MainViewModelFactory())
){
    LaunchedEffect(key1 = true){
        vm.getEventosBusca()
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color(red = 122, green = 22, blue = 60)
            )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            Header(onOrderDeporte = {vm.getEventosBuscabyDeporte()} , onOrderhora = {})
        }
        Column(modifier = Modifier.fillMaxWidth()) {
            LazyColumn(){
                items(vm.listaEventos){
                    evento -> Fila(evento = evento)
                }
            }
        }
    }
}

/*
@Preview
@Composable
fun pEventos(
) {
    val evento1 = Evento(titulo="val", descripcion = "val", hora="val", cantidad = 2, participantes = arrayOf("1","2","3"))
    val evento2 = Evento(titulo="va1l", descripcion = "va2l", hora="va3l", cantidad = 2, participantes = arrayOf("1","2","3"))
    val evento3 = Evento(titulo="val4", descripcion = "val5", hora="val6", cantidad = 2, participantes = arrayOf("1","2","3"))
    val arrayEv = listOf<Evento>(evento1,evento2,evento3)
    Busqueda(evento = arrayEv)
}*/