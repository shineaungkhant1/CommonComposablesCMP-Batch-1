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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ElevatedButton
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
fun CheckboxDemo() {
    val frameworks = listOf<String>("React","Angular","Flutter","CMP","Gin","Spring")
    var selectedOptions  by remember { mutableStateOf(listOf("")) }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.background(Color.White).fillMaxSize()
    ) {
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            frameworks.forEach { framework ->
                Row (verticalAlignment = Alignment.CenterVertically){
                  Checkbox(
                      checked = selectedOptions.contains(framework),
                      onCheckedChange = { isChecked ->
                          if(isChecked){
                              val tempList = selectedOptions.toMutableList()
                              tempList.add(framework)
                              selectedOptions = tempList
                          } else {
                              val tempList = selectedOptions.toMutableList()
                              tempList.remove(framework)
                              selectedOptions = tempList
                          }
                      }
                  )
                    Spacer(Modifier.width(2.dp))
                    Text(framework, modifier = Modifier.clickable{
                        framework
                    })
                }
            }
        }
    }
}


@Composable
@Preview
fun CheckboxDemoPreview() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.width(250.dp).height(500.dp).background(Color.White)
    ) {
        CheckboxDemo()
    }
}