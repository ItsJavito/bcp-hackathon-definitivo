package com.example.shpiel.presentation.main.viewmodels

import android.annotation.SuppressLint
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.shpiel.model.entity.Evento
import com.example.shpiel.model.entity.User
import com.example.shpiel.model.firebase.FirebaseManager
import com.example.shpiel.presentation.main.components.lista
import com.google.android.gms.tasks.OnSuccessListener
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.launch

class MainViewModel(

) : ViewModel(){
     companion object {
         @SuppressLint("StaticFieldLeak")
         lateinit var navController: NavController
         var usuario = mutableStateOf(User(nombre = "" , codigo = "" , alias = "" , id = ""))
         /*lateinit var user: String_*/
     }

    val listaEventos = mutableStateListOf<Evento>()
    val listaFilt = mutableStateListOf<Evento>()
    val evento = mutableStateOf(Evento(
        id = "",
        titulo = "",
        descripcion = "",
        hora = "",
        cantidad = 0,
        participantes = ArrayList(),
        idCreador = "",
        deporte = "")
    )
    fun getUser(id : String)  {
        viewModelScope.launch {
            FirebaseManager.instance.getUser(id) { usuario.value = it }!!
        }
    }


    fun getEvento(id:String){
        viewModelScope.launch {
            FirebaseManager.instance.getEvento(id = id){
                evento.value = it
            }
        }
    }

    fun getEventosBusca(){
        listaEventos.clear();
        viewModelScope.launch {
            FirebaseManager.instance.getEventos(
                {
                    if(it.idCreador != usuario.value.id && !it.participantes.contains(usuario.value.nombre)){
                        listaEventos.add(it)
                    }
                },
                {}
            )
        }
    }

    fun getEventosPart(){
        listaEventos.clear();
        viewModelScope.launch {
            FirebaseManager.instance.getEventos(
                {
                    if(it.idCreador == usuario.value.id || it.participantes.contains(usuario.value.nombre)){
                        listaEventos.add(it)
                    }
                },
                {}
            )
        }
    }

    fun getEventosPartbyDeporte(){
        listaEventos.clear();
        viewModelScope.launch {
            FirebaseManager.instance.getEventosbyDeporte(
                {
                    if(it.idCreador == usuario.value.id || it.participantes.contains(usuario.value.nombre)){
                        listaEventos.add(it)
                    }
                },
                {}
            )
        }
    }

    fun getEventosBuscabyDeporte(){
        listaEventos.clear();
        viewModelScope.launch {
            FirebaseManager.instance.getEventosbyDeporte(
                {
                    if(it.idCreador != usuario.value.id && !it.participantes.contains(usuario.value.nombre)){
                        listaEventos.add(it)
                    }
                },
                {}
            )
        }
    }

   /* fun getEventosPartbyHora(){
        listaEventos.clear();
        viewModelScope.launch {
            FirebaseManager.instance.getEventosbyHora(
                {
                    if(it.idCreador == usuario.value.id || it.participantes.contains(usuario.value.alias)){
                        listaEventos.add(it)
                    }
                },
                {}
            )
        }
    }

    fun getEventosBuscabyHora(){
        listaEventos.clear();
        viewModelScope.launch {
            FirebaseManager.instance.getEventosbyDeporte(
                {
                    if(it.idCreador != usuario.value.id && !it.participantes.contains(usuario.value.alias)){
                        listaEventos.add(it)
                    }
                },
                {}
            )
        }
    }*/

    fun eliminarEvento(
        id : String,
        onSuccess: () -> Unit
    ){
        viewModelScope.launch {
            FirebaseManager.instance.deleteEvent(id,onSuccess)
        }
    }

    fun updateParticipantesEvento(evento : Evento , onSuccess : () -> Unit){
        viewModelScope.launch {
            FirebaseManager.instance.UpdateParticipantesEvento(evento , onSuccess)
        }
    }
}