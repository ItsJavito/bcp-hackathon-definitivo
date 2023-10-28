package com.example.shpiel.presentation.login.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp


@Composable
fun CustomTextField(
    value: String,
    onValueChange:(String) -> Unit,
    label:  String ="",
    isPasswordField: Boolean = false,
    isPasswordVisible: Boolean = false,
    onVisibilityChange: (Boolean) -> Unit = {},
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    showError: Boolean = false,
    errorMessage: String = ""
){
    Column(
        modifier = Modifier.fillMaxWidth()
            .padding(horizontal = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        TextField(
            value = value,
            onValueChange = {onValueChange(it)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp),
            label = {Text(label)},
            isError = showError,
            trailingIcon = {
                if(showError && !isPasswordField) Icon(imageVector = Icons.Filled.Info, contentDescription = "Show error icon")
                if(isPasswordField){
                    IconButton(onClick ={ onVisibilityChange(!isPasswordVisible)}){
                        Icon(
                            imageVector = if(isPasswordVisible) Icons.Default.Person else Icons.Default.Done,
                            contentDescription = "Toggle Password"
                        )
                    }
                }
            },
            visualTransformation = when{
                isPasswordField && isPasswordVisible -> VisualTransformation.None
                isPasswordField -> PasswordVisualTransformation()
                else -> VisualTransformation.None
            },
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            singleLine = true
        )
        if (showError){
            Text(
                text = errorMessage,
                color = MaterialTheme.colors.error,
                style = MaterialTheme.typography.caption,
                modifier = Modifier
                    .padding(start = 8.dp)
                    .offset(y = (-8).dp)
                    .fillMaxWidth(0.9f)
            )
        }
    }
}

