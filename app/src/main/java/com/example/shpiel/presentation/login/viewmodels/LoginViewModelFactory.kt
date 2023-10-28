package com.example.shpiel.presentation.login.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class LoginViewModelFactory(
    private val onLoginSucess : (String) -> Unit,
) : ViewModelProvider.Factory{
    override fun <T: ViewModel> create (modelClass: Class<T>): T {
        return LoginViewModel(onLoginSucess) as T
    }
}