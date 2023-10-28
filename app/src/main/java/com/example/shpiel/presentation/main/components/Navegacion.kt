package com.example.shpiel.presentation.main.components

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.*
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.shpiel.model.entity.User
import com.example.shpiel.presentation.main.navigation.NavigationGraph
import com.example.shpiel.presentation.main.viewmodels.MainViewModel
import com.example.shpiel.presentation.main.viewmodels.MainViewModelFactory

import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Navegacion(
    id: String?,
    vm : MainViewModel = viewModel(factory = MainViewModelFactory())
){
    LaunchedEffect(key1 = true){
        vm.getUser(id!!);
    }
    val navController = rememberNavController()
    MainViewModel.navController=navController
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    val openDrawer: () -> Unit = {
        scope.launch {
            scaffoldState.drawerState.open()
        }
    }
    val closeDrawer: () -> Unit = {
        scope.launch {
            scaffoldState.drawerState.close()
        }
    }

    Scaffold (
        scaffoldState = scaffoldState,
        topBar={
            Topbar(
                onOpenDrawer = openDrawer
            )
        },
        drawerContent = {
            DrawerMenu(
                navController = navController,
                onCloseDrawer = closeDrawer,
                name = "Hola ${MainViewModel.usuario.value.nombre}"
            )
        }
    )
    {
        NavigationGraph(
            navController = navController,
        )
    }
}