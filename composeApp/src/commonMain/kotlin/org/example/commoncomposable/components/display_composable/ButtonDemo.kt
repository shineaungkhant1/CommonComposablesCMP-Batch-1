package org.example.commoncomposable.components.display_composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
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
fun ButtonDemo() {

    var isBtnDisable by remember { mutableStateOf(false) }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.background(Color.White).fillMaxSize()
    ) {
        Column {
            Button(
                onClick = {
                    print("Button is clicked")
                }, colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red,
                    disabledContentColor = Color.Gray
                ), enabled = isBtnDisable,
                shape = RoundedCornerShape(8.dp),
                border = if (isBtnDisable) null  else BorderStroke(width = 1.dp, color = Color.Green)
            ) {
                Text("First Button")
            }

            Button(
                onClick = {
                    print("Button is clicked")
                    isBtnDisable = !isBtnDisable
                }, colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red,

                    ),
                shape = RoundedCornerShape(8.dp),

                ) {
                Text("Second Button")
            }

            ElevatedButton(
                onClick = {
                    print("Elevated Button pressed.")
                },
                elevation = ButtonDefaults.buttonElevation(8.dp)
            ){
                Text("Elevated Button")
            }
        }
    }
}


@Composable
@Preview
fun ButtonDemoPreview() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.width(250.dp).height(500.dp).background(Color.White)
    ) {
        ButtonDemo()
    }
}