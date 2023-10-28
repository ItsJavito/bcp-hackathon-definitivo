package com.example.shpiel.presentation.signup.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Checkbox
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shpiel.presentation.login.components.CustomTextField
import com.example.shpiel.presentation.login.components.LoginFields

@Composable
fun SignupFields(
    nombre:String,
    correo:String,
    password:String,
    onCodigoChange: (String)->Unit,
    oncorreoChange: (String)->Unit,
    onPasswordChange: (String)->Unit,
    onClick: () -> Unit
)
{
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,

    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 60.dp, bottom = 40.dp),
            horizontalAlignment = Alignment.Start,
        ) {
            Text(
                text = "Registrate para ser parte de la comunidad",
                fontSize = 25.sp,
                textAlign = TextAlign.Left
            )
            Text(
                text = "Create una cuenta y empieza",
                fontSize = 10.sp,
                textAlign = TextAlign.Left
            )
        }
        CustomTextField(
            value = nombre,
            onValueChange = onCodigoChange,
            label = "Codigo de Alumno"
            )
        CustomTextField(
            value = correo,
            onValueChange = oncorreoChange,
            label = "Nombre Completo"
        )
        CustomTextField(
            value = password,
            onValueChange = onPasswordChange,
            label = "Contraseña",
            isPasswordField = true,
            isPasswordVisible = false
        )
        CustomTextField(value = password, onValueChange = onPasswordChange, label = "Confirmar Contraseña",
            isPasswordField = true, isPasswordVisible = false )

        // poner un checkbox

        Checkbox(checked = false, onCheckedChange = { /*TODO*/ })
        Column {
            Text(
                text = "Al registrarte aceptas los terminos y condiciones",
                fontSize = 10.sp,
                textAlign = TextAlign.Left
            )
        }
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 60.dp)
                .padding(top = 30.dp),
            onClick = { onClick() }) {
            Text(text = "Registrate",
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSignupFields() {
    SignupFields(
        nombre = "",
        correo = "",
        password = "",
        onCodigoChange = {},
        oncorreoChange = {},
        onPasswordChange = {},
        onClick = {}
    )
}
