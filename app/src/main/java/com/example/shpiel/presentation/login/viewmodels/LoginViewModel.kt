package com.example.shpiel.presentation.login.viewmodels

import android.app.AlertDialog
import android.content.Intent
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.mutableStateOf
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shpiel.MainActivity
import com.example.shpiel.model.firebase.FirebaseManager
import kotlinx.coroutines.launch

class LoginViewModel(
    private val onLoginSuccess : () -> Unit
) : ViewModel(){
    var codigo = mutableStateOf("");
    var contra = mutableStateOf("");
    fun login(){
        onLoginSuccess()

    }
}