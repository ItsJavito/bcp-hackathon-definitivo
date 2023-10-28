package com.example.shpiel.presentation.signup.viewmodels

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shpiel.model.firebase.FirebaseManager
import kotlinx.coroutines.launch

class SignupViewModel (
    private val onSignupSuccess : (String) -> Unit
) : ViewModel(){
    var codigo = mutableStateOf("")
    var nombre = mutableStateOf("")
    var alias = mutableStateOf("")
    var contra = mutableStateOf("")

    fun Signup(){
        viewModelScope.launch {
            FirebaseManager.instance.registrarUsuario(
                codigo = codigo.value.toInt(),
                nombre = nombre.value,
                alias = alias.value,
                contra = contra.value,
                onSucces = {onSignupSuccess(codigo.value)},
                onError = { println("hubo un error con el signup")}
            )
        }
    }
}