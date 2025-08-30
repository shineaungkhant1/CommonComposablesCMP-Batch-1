package org.example.commoncomposable.components.layout_composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
fun ColumnDemo() {

    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier.fillMaxSize(),
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.height(200.dp).background(color = Color.Red).fillMaxWidth()
        ) {
            Text("Red")
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.height(200.dp).background(color = Color.Blue).fillMaxWidth()
        ) {
            Text("Blue")
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.weight(1.0f).background(color = Color.Yellow).fillMaxWidth()
        ) {
            Text("Yellow")
        }


    }

}


@Preview()
@Composable
fun ColumnDemoPreview() {
    Scaffold(containerColor = Color.White) {
        ColumnDemo()
    }
}