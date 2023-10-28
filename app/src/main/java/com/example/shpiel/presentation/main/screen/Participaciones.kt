package com.example.shpiel.presentation.main.screen

import android.text.Editable.Factory
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.shpiel.model.entity.Evento
import com.example.shpiel.presentation.main.components.Fila
import com.example.shpiel.presentation.main.components.Header
import com.example.shpiel.presentation.main.components.filaPart
import com.example.shpiel.presentation.main.viewmodels.MainViewModel
import com.example.shpiel.presentation.main.viewmodels.MainViewModelFactory

@Composable
fun Participaciones(
    vm : MainViewModel  = viewModel(factory = MainViewModelFactory())
){
    /*Pa Borrar compare*/
    //val evento1 = Evento(titulo="Mio", descripcion = "val", hora="val", cantidad = 2, participantes = arrayOf("1","2","3") , idCreador = MainViewModel.usuario.value.id)
    //val evento2 = Evento(titulo="Tuyo", descripcion = "val", hora="val", cantidad = 2, participantes = arrayOf(MainViewModel.usuario.value.alias,"2","3") , idCreador = "sadasdas")
    //val evento = listOf<Evento>(evento1 , evento2)

    LaunchedEffect(key1 = true){
        vm.getEventosPart();
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color(red = 0, green = 78, blue = 99)
            )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            Header(
                onOrderDeporte = {
                    vm.getEventosPartbyDeporte();
                },
                onOrderhora = {
                }
            )
        }
        Column(modifier = Modifier.fillMaxWidth()) {
            LazyColumn(){
                items(vm.listaEventos){
                        evento -> filaPart(evento = evento)
                }
            }
        }
    }
}