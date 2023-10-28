package com.example.shpiel.presentation.login.viewmodels

import android.app.AlertDialog
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shpiel.model.firebase.FirebaseManager
import kotlinx.coroutines.launch

class LoginViewModel(
    private val onLoginSuccess : (String) -> Unit
) : ViewModel(){
    var codigo = mutableStateOf("");
    var contra = mutableStateOf("");

    fun login(){
        viewModelScope.launch {
            FirebaseManager.instance.login(
                codigo.value,
                contra.value,
                onSuccess =  onLoginSuccess,
                onError = {
                    println("Ha ocurrido un error al buscar al usuario" + codigo.value)
                }
            )
        }
    }
}