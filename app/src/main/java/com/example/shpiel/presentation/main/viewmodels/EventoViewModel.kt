package com.example.shpiel.presentation.main.viewmodels

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shpiel.model.firebase.FirebaseManager
import kotlinx.coroutines.launch

class EventoViewModel (
    private val onCrearEvento : () -> Unit
) : ViewModel() {
    var titulo = mutableStateOf("")
    var cantidad = mutableStateOf("")
    var descripcion = mutableStateOf("")
    var deporte = mutableStateOf("")
    var participantes = mutableStateListOf<String>()

    fun crearEvento(){
        viewModelScope.launch {
            FirebaseManager.instance.registrarEvento(
                onSucces = onCrearEvento,
                onError = { println("no se pudo crear el evento")},
                titulo = titulo.value,
                cantMax = cantidad.value.toInt(),
                desc = descripcion.value,
                deporte = deporte.value,
                user = MainViewModel.usuario.value,
                participantes = participantes
            )
        }
    }
}