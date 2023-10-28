package com.example.shpiel.presentation.main.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.shpiel.presentation.main.components.CrearEventoFields
import com.example.shpiel.presentation.main.viewmodels.EventoViewModel
import com.example.shpiel.presentation.main.viewmodels.EventoViewModelFactory

@Composable
fun CrearEvento(
    onCrearEvento : () -> Unit,
    vm : EventoViewModel = viewModel(factory = EventoViewModelFactory(onCrearEvento))
){
    CrearEventoFields(
        titulo = vm.titulo.value,
        cantidad = vm.cantidad.value,
        descripcion = vm.descripcion.value,
        deporte = vm.deporte.value,
        participantes = vm.participantes,
        onDeporteChange = {vm.deporte.value = it },
        onTituloChange = {vm.titulo.value = it},
        onCantidadChange = {vm.cantidad.value = it},
        onDescripcionChange = {vm.descripcion.value = it},
        onCrearEvento = {vm.crearEvento()},
        onAddParticipante = {vm.participantes.add(it)},
        onRemoveParticipante = {
            if(vm.participantes.size > 0) vm.participantes.removeAt(vm.participantes.size-1)
        }
    )
}