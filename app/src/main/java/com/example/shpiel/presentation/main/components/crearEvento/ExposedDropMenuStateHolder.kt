package com.example.shpiel.presentation.main.components.crearEvento

import android.media.Image
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.*
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.res.painterResource
import com.example.shpiel.R
import com.example.shpiel.model.firebase.FirebaseManager
import com.google.firebase.ktx.Firebase
import com.google.gson.annotations.Expose

class ExposedDropMenuStateHolder (
){
    var enabled by mutableStateOf(false)
    var value by mutableStateOf("")
    var selectedIndex by mutableStateOf(-1)
    var size by mutableStateOf(Size.Zero)
    val icon:Int
    @Composable get() = if(enabled){
        R.drawable.up_arrow_svgrepo_com
    }else{
        R.drawable.down_arrow_svgrepo_com
    }
    val items= arrayOf("Basket 1/2 cancha","Basket Full","Volley","Futbol")
    /*val items = (1..5).map{
        "option $it"
    }*/
    fun onEnable(newVal:Boolean){
        enabled = newVal
    }
    fun onSelectedIndex(newVal:Int, onDeporteChange: (String) -> Unit){
        selectedIndex = newVal
        value = items[selectedIndex]
        onDeporteChange(value);
    }
    fun onSize(newVal:Size){
        size = newVal
    }
}

@Composable
fun rememberExposedMenuStateHolder(
) = remember() {
    ExposedDropMenuStateHolder()
}