package org.example.commoncomposable.components.layout_composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
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
fun FlowLayOutDemo() {

// Flow Row
//    Box(modifier = Modifier.fillMaxSize()) {
//        FlowRow (
//            horizontalArrangement = Arrangement.spacedBy(8.dp),
//            verticalArrangement = Arrangement.spacedBy(21.dp)
//        ){
//            (1..20).toList().forEach { number ->
//                Button(onClick = {}){ Text("Button number $number")}
//
//            }
//        }
//    }

    // Flow Column
    Box(modifier = Modifier.fillMaxSize()) {
        FlowColumn (
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ){
            (1..30).toList().forEach { number ->
                Button(onClick = {}){ Text("Button number $number")}

            }
        }
    }

}


@Preview()
@Composable
fun FlowLayOutDemoPreview() {
    Scaffold(containerColor = Color.White) {
        FlowLayOutDemo()
    }
}