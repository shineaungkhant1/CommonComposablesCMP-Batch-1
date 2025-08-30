package org.example.commoncomposable.components.display_composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun DropDownDemo() {
    val colors = listOf<String>("Red", "Green", "Blue", "Yellow", "Cyan")
    var selectedValue: String? by remember { mutableStateOf(null) }
    var isExpanded: Boolean by remember { mutableStateOf(false) }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.background(Color.LightGray, shape = RoundedCornerShape(8.dp))
            .widthIn(min = 200.dp, max = 300.dp).padding(all = 12.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {

            Spacer(Modifier.width(2.dp))
            Text(selectedValue ?: "Please Choose Color", modifier = Modifier.clickable {
                isExpanded = !isExpanded
            })

            IconButton(
                onClick = {
                    isExpanded = !isExpanded
                }
            ){
                Icon(Icons.Default.ArrowDropDown, contentDescription = null)
            }
        }
        DropdownMenu(
            expanded = isExpanded,
            onDismissRequest = {
                isExpanded = false
            }
        ){
            colors.forEach { color ->
                DropdownMenuItem(
                    text = {
                        Text(color)
                    },
                    onClick = {
                        selectedValue = color
                        isExpanded = false
                    }
                )
            }
        }
    }
}


@Composable
@Preview
fun DropDownDemoPreview() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize().background(Color.White)
    ) {
        DropDownDemo()
    }
}