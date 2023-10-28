package com.example.shpiel.presentation.main.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shpiel.model.entity.Evento
import com.example.shpiel.presentation.main.viewmodels.MainViewModel
import com.google.gson.Gson

@Composable
fun Header(
    titulo: String = "Titulo",
    deporte: String = "Deporte",
    hora: String = "Hora",
    onOrderDeporte: () -> Unit,
    onOrderhora: () -> Unit
){
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 20.dp)
        .padding(top = 20.dp)
        .background(Color.DarkGray),
        ) {
        Box(
            modifier = Modifier
                .weight(2f)
                .border(BorderStroke(1.dp, Color.Black))
                .size(80.dp),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = titulo ,
                fontSize = 30.sp
            )
        }
        Box(
            modifier = Modifier
                .weight(2f)
                .border(BorderStroke(1.dp, Color.Black))
                .size(80.dp)
                .clickable {
                    onOrderDeporte()
                },
            contentAlignment = Alignment.Center
        ){
            Text(
                text = deporte ,
                fontSize = 30.sp
            )
        }
        Box(
            modifier = Modifier
                .weight(1.5f)
                .border(BorderStroke(1.dp, Color.Black))
                .size(80.dp)
                .clickable {
                    onOrderhora()
                },
            contentAlignment = Alignment.Center
        ){
            Text(
                text = hora,
                fontSize = 30.sp)
        }
        Box(
            modifier = Modifier
                .weight(1f)
                .border(BorderStroke(1.dp, Color.Black))
                .size(80.dp),
            contentAlignment = Alignment.Center
        ){
            Icon(Icons.Filled.Person, contentDescription = "")
        }
    }
}

@Composable
fun Fila(
    evento: Evento
){
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 20.dp)
        .background(Color.LightGray).
        clickable {
            MainViewModel.navController.navigate(
                "DetalleBusqueda/id=${evento.id}"
            )
        },
    ) {
        Box(
            modifier = Modifier
                .weight(2f)
                .border(BorderStroke(1.dp, Color.Black))
                .size(80.dp),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = evento.titulo ,
                fontSize = 15.sp
            )
        }
        Box(
            modifier = Modifier
                .weight(2f)
                .border(BorderStroke(1.dp, Color.Black))
                .size(80.dp),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = evento.deporte ,
                fontSize = 15.sp
            )
        }
        Box(
            modifier = Modifier
                .weight(1.5f)
                .border(BorderStroke(1.dp, Color.Black))
                .size(80.dp),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = evento.hora,
                fontSize = 15.sp)
        }
        Box(
            modifier = Modifier
                .weight(1f)
                .border(BorderStroke(1.dp, Color.Black))
                .size(80.dp),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "${evento.participantes.size}/${evento.cantidad}"
                )
        }
        println(evento)
    }
}

@Composable
fun filaPart(
    evento: Evento
){
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 20.dp)
        .background(Color.LightGray).
        clickable {
            val gson = Gson();
            val eventoJson = gson.toJson(evento);
            // Si yo lo he creado
            if(evento.idCreador == MainViewModel.usuario.value.id){
                //println("DetalleSolicitante/evento=${eventoJson}")
                MainViewModel.navController.navigate(
                    "DetalleSolicitante/id=${evento.id}"
                )
            }
            //si no lo he creado
            else{

                //println("DetalleParticipante/evento=${eventoJson}")
                MainViewModel.navController.navigate(
                    "DetalleParticipante/id=${evento.id}"
                )
            }
        },
    ) {
        Box(
            modifier = Modifier
                .weight(2f)
                .border(BorderStroke(1.dp, Color.Black))
                .size(80.dp),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = evento.titulo ,
                fontSize = 15.sp
            )
        }
        Box(
            modifier = Modifier
                .weight(2f)
                .border(BorderStroke(1.dp, Color.Black))
                .size(80.dp),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = evento.deporte ,
                fontSize = 15.sp
            )
        }
        Box(
            modifier = Modifier
                .weight(1.5f)
                .border(BorderStroke(1.dp, Color.Black))
                .size(80.dp),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = evento.hora,
                fontSize = 15.sp)
        }
        Box(
            modifier = Modifier
                .weight(1f)
                .border(BorderStroke(1.dp, Color.Black))
                .size(80.dp),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "${evento.participantes.size}/${evento.cantidad}"
            )
        }
        println(evento)
    }
}

/*
@Preview
@Composable
fun pFila() {
    val evento = Evento(titulo="val", descripcion = "val", hora="val", cantidad = 2, participantes = arrayOf("1","2","3"));
    Fila(evento= evento)
}*/
