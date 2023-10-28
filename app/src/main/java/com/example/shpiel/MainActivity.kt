package com.example.shpiel

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.graphics.drawable.Icon
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.shpiel.navigation.NavigationHost
import com.example.shpiel.navigation.items_menu
import com.example.shpiel.presentation.catalogo.screens.CatalogoScreen
import com.example.shpiel.ui.theme.ShpielTheme
import com.example.shpiel.presentation.login.screen.LoginScreen
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.example.shpiel.navigation.items_menu.*
import kotlinx.coroutines.selects.select

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShpielTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    PantallaPrincipal()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun PantallaPrincipal(){
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope();

    val navigation_item = listOf(
        PantallaInicio,
        PantallaForo,
        PantallaInversionistas
    )

    Scaffold(
        scaffoldState = scaffoldState,
        bottomBar = {NavegacionInferior(navController = navController, menu_items = navigation_item)},
    ) {
        NavigationHost(navController = navController)
    }
}
@Composable
fun currentRoute(navControler: NavHostController): String?{
    val entrada by navControler.currentBackStackEntryAsState()
    return entrada?.destination?.route
}
@Composable
fun NavegacionInferior(
    navController: NavHostController,
    menu_items: List<items_menu>
){
    BottomAppBar {
        BottomNavigation {
            val currentRoute = currentRoute(navControler = navController)
            menu_items.forEach{ item ->
                BottomNavigationItem(
                    selected = currentRoute == item.route,
                    onClick = { navController.navigate(item.route) },
                    icon = {
                        Icon(
                            painter = painterResource(id = item.icon),
                            contentDescription = item.title
                        )
                    }
                )
            }
        }
    }
}

