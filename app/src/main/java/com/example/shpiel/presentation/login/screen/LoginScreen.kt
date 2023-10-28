package com.example.shpiel.presentation.login.screen

import android.content.Intent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.shpiel.MainActivity
import com.example.shpiel.presentation.login.components.LoginFields
import com.example.shpiel.presentation.login.viewmodels.LoginViewModel
import com.example.shpiel.presentation.login.viewmodels.LoginViewModelFactory

@Composable
fun LoginScreen(
    onLoginSuccess : () -> Unit,
    onRegister: () -> Unit,
    vm : LoginViewModel = viewModel( factory =  LoginViewModelFactory(onLoginSuccess))
){
    LoginFields(
        name = vm.codigo.value,
        password = vm.contra.value,
        onNameChange = {vm.codigo.value = it},
        onPasswordChange = {vm.contra.value = it},
        onLoginClick = { vm.login() },
        onRegisterClick =  onRegister
    )
}


