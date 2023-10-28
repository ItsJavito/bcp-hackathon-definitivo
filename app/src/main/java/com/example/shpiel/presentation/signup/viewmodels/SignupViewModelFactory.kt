package com.example.shpiel.presentation.signup.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.shpiel.presentation.login.viewmodels.LoginViewModel

class SignupViewModelFactory(
    private val onSignupSuccess : (String) -> Unit,
) : ViewModelProvider.Factory{
    override fun <T: ViewModel> create (modelClass: Class<T>): T {
        return SignupViewModel(onSignupSuccess) as T
    }
}