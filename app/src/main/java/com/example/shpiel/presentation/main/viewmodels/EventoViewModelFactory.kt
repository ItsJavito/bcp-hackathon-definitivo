package com.example.shpiel.presentation.main.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.shpiel.presentation.signup.viewmodels.SignupViewModel

class EventoViewModelFactory (
    private val onCrearEvento : () -> Unit,
) : ViewModelProvider.Factory{
    override fun <T: ViewModel> create (modelClass: Class<T>): T {
        return EventoViewModel(onCrearEvento) as T
    }
}