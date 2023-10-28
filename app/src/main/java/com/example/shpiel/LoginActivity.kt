package com.example.shpiel

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.shpiel.presentation.catalogo.screens.CatalogoScreen

import com.example.shpiel.presentation.login.screen.LoginScreen
import com.example.shpiel.ui.theme.ShpielTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContent{
            CatalogoScreen()//LoginScreen(onLoginSuccess = pasoMain, onRegister = pasoSignup)
        }
    }
     private val pasoMain: (String) -> Unit = {
         val intent = Intent(this, MainActivity::class.java);
         intent.putExtra("id", it);
         startActivity ( intent );
         finish();
    }
    private val pasoSignup: () -> Unit = {
        val intent = Intent(this, SignupActivity::class.java);
        startActivity(intent);
    }
}


