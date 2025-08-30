package org.example.commoncomposable.components.layout_composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun RowDemo() {

    Row(
        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.spacedBy(12.dp),
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),
    ) {
//        Spacer( modifier = Modifier.weight(1.0f))
        Button(
            onClick = {

            },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
        ) {
            Text("Red", color = Color.White)
        }
        Spacer( modifier = Modifier.width(12.dp))
        Button(
            onClick = {

            },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
        ) {
            Text("Blue", color = Color.White)
        }
        Spacer( modifier = Modifier.width(12.dp))
        Button(
            onClick = {

            },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow),

        ) {
            Text("Yellow", color = Color.White)
        }
//       Spacer( modifier = Modifier.weight(1.0f))
    }

}


@Preview()
@Composable
fun RowDemoPreview() {
    Scaffold(containerColor = Color.White) {
        RowDemo()
    }
}