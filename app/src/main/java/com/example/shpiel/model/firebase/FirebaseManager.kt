package com.example.shpiel.model.firebase

import androidx.compose.animation.core.snap
import androidx.compose.runtime.Composable
import com.example.shpiel.model.entity.Evento
import com.example.shpiel.model.entity.User
import com.example.shpiel.presentation.main.viewmodels.MainViewModel
import com.google.android.gms.common.server.converter.StringToIntConverter
import com.google.android.gms.tasks.OnSuccessListener
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import java.util.HashMap

class FirebaseManager {
    val db : FirebaseFirestore
    init {
        db = Firebase.firestore
    }
    companion object{
        private var _instance : FirebaseManager? = null
        val instance : FirebaseManager
            get(){
                if(_instance == null){
                    _instance = FirebaseManager()
                }
                return _instance!!
            }
    }

    fun registrarUsuario(
        codigo: Number,
        nombre: String,
        alias: String,
        contra: String,
        onError: (String) -> Unit,
        onSucces: (String) -> Unit
    ){
        val user = hashMapOf(
            "alias" to alias,
            "codigo" to codigo,
            "contra" to contra,
            "nombre" to nombre
        )
        db.collection("users")
            .add(user)
            .addOnSuccessListener {
                onSucces(nombre)
            }
            .addOnFailureListener{ exception ->
                onError(exception.message!!.toString())
            }
    }

    fun login(
        codigo: String,
        contra: String,
        onSuccess: (String) -> Unit,
        onError:  (String) -> Unit
    ){

        db.collection("users")
            .whereEqualTo("codigo", codigo.toInt())
            .whereEqualTo("contra" , contra)
            .get()
            .addOnSuccessListener { snapshot ->
                if(snapshot.size() > 0){
//                    val codigo = snapshot.documents[0].data!!.get("codigo")!!.toString();
                    val id = snapshot.documents[0].id
                    onSuccess(id)
                }else{
                    println(codigo)
                    println(contra)
                    println("No se ha encontrado")
                }
            }
            .addOnFailureListener{
                onError(codigo);
            }
    }

    fun registrarEvento(
        titulo : String,
        deporte : String,
        cantMax : Int,
        desc : String,
        user : User,
        participantes : List<String>,
        onSucces : () -> Unit,
        onError : () -> Unit
    ) {
        val creador = hashMapOf(
            "id" to user.id,
            "nombre" to user.nombre
        )

        val event = hashMapOf(
            "titulo" to titulo,
            "deporte" to deporte,
            "cantMax" to cantMax,
            "desc" to desc,
            "creador" to creador,
            "participantes" to participantes
        )

        db.collection("events")
            .add(event)
            .addOnSuccessListener {
                onSucces()
            }
            .addOnFailureListener { exception ->
                onError()
            }
    }

    fun getEventos(
        onSucces: (Evento) -> Unit,
        onError: () -> Unit
    ){
        db.collection("events")
            .get()
            .addOnSuccessListener{documents ->
                documents.forEach{ doc ->
                    val creador = doc.data["creador"] as HashMap<*, *>
                    onSucces(Evento(
                        idCreador = creador["id"]!! as String,
                        id = doc.id,
                        participantes = doc.data["participantes"]!! as ArrayList<String>,
                        titulo = doc.data["titulo"]!! as String,
                        deporte = doc.data["deporte"]!! as String,
                        hora = "",
                        cantidad = doc.data["cantMax"]!! as Long,
                        descripcion =  doc.data["desc"] as String
                    ))
                }
            }
            .addOnFailureListener {
                onError()
            }
    }

    fun getEventosbyDeporte(
        onSucces: (Evento) -> Unit,
        onError: () -> Unit
    ){
        db.collection("events")
            .orderBy("deporte")
            .get()
            .addOnSuccessListener{documents ->
                documents.forEach{ doc ->
                    val creador = doc.data["creador"] as HashMap<*, *>
                    onSucces(Evento(
                        idCreador = creador["id"]!! as String,
                        id = doc.id,
                        participantes = doc.data["participantes"]!! as ArrayList<String>,
                        titulo = doc.data["titulo"]!! as String,
                        deporte = doc.data["deporte"]!! as String,
                        hora = "",
                        cantidad = doc.data["cantMax"]!! as Long,
                        descripcion =  doc.data["desc"] as String
                    ))
                }
            }
            .addOnFailureListener {
                onError()
            }
    }

    fun deleteEvent(
        id : String,
        onSucces: () -> Unit
    ){
        db.collection("events")
            .document(id)
            .delete()
            .addOnSuccessListener(){
                onSucces();
            }
    }

    fun getUser(
        id : String,
        onSuccess : (User) -> Unit
    ) {
        db.collection("users")
            .document(id)
            .get()
            .addOnSuccessListener(){ it ->
                val nombre = it.get("nombre")
                val codigo = it.get("codigo")
                val alias = it.get("alias")
                val usuario = User(id = id, alias = alias.toString() , codigo = codigo.toString() , nombre = nombre.toString());
                onSuccess(usuario!!)
            }
            .addOnFailureListener {
                println("No se pudo obtener le usuario")
            }
    }

    fun getEvento(
        id : String,
        onSuccess : (Evento) -> Unit
    ){
        db.collection("events").document(id)
            .get()
            .addOnSuccessListener(){
                onSuccess(Evento(
                    idCreador = "XSDASdasdads",
                    id = it.id,
                    participantes = it.get("participantes")!! as ArrayList<String>,
                    titulo = it.get("titulo")!! as String,
                    deporte = it.get("deporte")!! as String,
                    hora = "",
                    cantidad = it.get("cantMax")!! as Long,
                    descripcion =  it.get("desc") as String
                ))
            }
    }

    fun UpdateParticipantesEvento(evento:Evento , onSuccess : () -> Unit){
        db.collection("events").document(evento.id)
            .update("participantes" , evento.participantes)
            .addOnSuccessListener{
                onSuccess()
            }
    }

    fun mapDeportes(){
        db.collection("deportes")
            .get()
            .addOnSuccessListener{snapshot ->
                println(snapshot.documents)
            }
    }
}