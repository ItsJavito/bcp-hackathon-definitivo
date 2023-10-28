package com.example.shpiel.navigation

import com.example.shpiel.R

sealed class items_menu(
    val icon: Int,
    val title: String,
    val route: String
){
    object PantallaInicio: items_menu(R.drawable.appcrc, "Inicio", "principal")
    object PantallaForo: items_menu(R.drawable.appcrc, "Foro", "foro")
    object PantallaInversionistas: items_menu(R.drawable.appcrc, "Inversionistas", "inversionistas")
}
