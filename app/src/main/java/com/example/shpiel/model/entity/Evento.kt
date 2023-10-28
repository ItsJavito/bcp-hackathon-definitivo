package com.example.shpiel.model.entity

data class Evento (val id : String,val titulo:String, val descripcion:String, val hora: String, val cantidad:Long, val participantes: ArrayList<String> , val idCreador : String , val deporte : String )