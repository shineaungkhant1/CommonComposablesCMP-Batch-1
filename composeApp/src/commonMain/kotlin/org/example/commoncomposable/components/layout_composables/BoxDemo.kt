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
fun BoxDemo() {

//    Box(modifier = Modifier.fillMaxSize()){
//        Text("Top Left", modifier = Modifier.align(Alignment.TopStart))
//        Text("Top Right", modifier = Modifier.align(Alignment.TopEnd))
//        Text("Bottom Left", modifier = Modifier.align(Alignment.BottomStart))
//        Text("Bottom Right", modifier = Modifier.align(Alignment.BottomEnd))
//        Text("Center", modifier = Modifier.align(Alignment.Center))
//    }

    Box(modifier = Modifier.fillMaxSize()) {
        Text("Top Left", modifier = Modifier.offset(32.dp, 32.dp))
        Text(
            "Top Right",
            modifier = Modifier.align(Alignment.TopEnd).offset(x = (-100).dp, y = 100.dp)
        )
        Text(
            "Bottom Left",
            modifier = Modifier.align(Alignment.BottomStart).offset(x = 200.dp, y = (-200).dp)
        )
        Text(
            "Bottom Right",
            modifier = Modifier.align(Alignment.BottomEnd).offset(x = (-300).dp, y = (-300).dp)
        )
        Text("Center", modifier = Modifier.align(Alignment.Center))
    }

}


@Preview()
@Composable
fun BoxDemoPreview() {
    Scaffold(containerColor = Color.White) {
        BoxDemo()
    }
}