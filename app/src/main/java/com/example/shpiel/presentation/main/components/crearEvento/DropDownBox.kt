package com.example.shpiel.presentation.main.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize
import com.example.shpiel.presentation.main.components.crearEvento.ExposedDropMenuStateHolder

@Composable
fun CustomDropDownBox(stateHolder: ExposedDropMenuStateHolder, onDeporteChange : (String) -> Unit) {
    Column (modifier = Modifier.padding(start = 50.dp)){
        Box {
            TextField(
                value = stateHolder.value,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                readOnly = true,
                onValueChange = {},
                label = { Text(text = "Deportes") },
                trailingIcon = {
                    Icon(painter = painterResource(
                        id = stateHolder.icon
                    ),
                        contentDescription = null,
                        modifier = Modifier.clickable {
                            stateHolder.onEnable(!stateHolder.enabled)
                        }
                    )
                },
                modifier = Modifier.onGloballyPositioned {
                    stateHolder.onSize(it.size.toSize())
                }
                    .padding(bottom = 10.dp)
            )
            DropdownMenu(
                expanded = stateHolder.enabled,
                onDismissRequest = {
                    stateHolder.onEnable(false)
                },
            modifier = Modifier
                .width(with(LocalDensity.current)
            {stateHolder.size.width.toDp()})
            )
            {
                stateHolder.items.forEachIndexed{index, s ->
                    DropdownMenuItem(
                        onClick = {
                            stateHolder.onSelectedIndex(index , onDeporteChange)
                            stateHolder.onEnable(false)
                        }
                    ) {
                        Text(text = s)
                    }
                }
            }
        }
    }

}