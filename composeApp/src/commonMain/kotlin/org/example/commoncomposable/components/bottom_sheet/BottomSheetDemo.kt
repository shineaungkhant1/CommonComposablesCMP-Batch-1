package org.example.commoncomposable.components.bottom_sheet

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomSheetDemo() {
    var showBottomSheet by remember { mutableStateOf(false) }

    val windowInfo = LocalWindowInfo.current.containerSize

    // Scoped Function
    val screenHeight = with(LocalDensity.current){
        windowInfo.height.toDp()
    }

    Scaffold(
        floatingActionButton = {
            IconButton(
                onClick = {
                    showBottomSheet = true
                }
            ) {
                Icon(Icons.Default.Add, contentDescription = null)
            }
        }
    ) {
        Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
            Text("Bottom Sheet Demo")
        }
        if (showBottomSheet) {
            ModalBottomSheet(onDismissRequest = {
                showBottomSheet = false
            }
            ) {
                Box(contentAlignment = Alignment.Center, modifier = Modifier.height(screenHeight * 0.7f).fillMaxWidth()){
                    Text("Bottom Sheet")
                }
            }
        }
    }

}

@Composable
@Preview
fun BottomSheetDemoPreview() {

    BottomSheetDemo()

}