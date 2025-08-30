package org.example.commoncomposable.components.display_composable

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun IconDemo() {

    var isExpanded : Boolean by remember {mutableStateOf(false)}

    Row {
        Icon(
            Icons.Default.Call,
            contentDescription = null,
            modifier = Modifier.size(48.dp),
            tint = Color.Cyan
        )

        IconButton(
            onClick = {
                print("Icon button pressed")
               isExpanded = false
            }
        ) {
            Icon(
                Icons.Default.ThumbUp,
                contentDescription = null,
                tint = Color.Red,
                modifier = Modifier.size(48.dp),
            )
        }
    }

}


@Preview
@Composable
fun IconDemoPreview() {
    Scaffold(containerColor = Color.White) {
        IconDemo()
    }
}