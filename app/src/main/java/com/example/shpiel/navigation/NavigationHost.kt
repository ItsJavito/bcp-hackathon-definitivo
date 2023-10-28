package com.example.shpiel.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.shpiel.navigation.items_menu.*
import com.example.shpiel.presentation.catalogo.screens.CatalogoScreen
import com.example.shpiel.presentation.foro.components.foroFields
import com.example.shpiel.presentation.inversionistas.Screens.InversionistasScreen

@Composable
fun NavigationHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = PantallaInicio.route) {
        composable(PantallaInicio.route) {
            // Composable for the first screen
            CatalogoScreen()
        }
        composable(PantallaForo.route) {
            // Composable for the second screen
            foroFields()
        }
        composable(PantallaInversionistas.route) {
            // Composable for the second screen
            InversionistasScreen()
        }
    }
}