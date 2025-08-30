package org.example.commoncomposable.components.scrollabole_composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun GridDemo(){
    LazyVerticalGrid(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        columns = GridCells.Fixed(2),
       contentPadding = PaddingValues(top = 24.dp)
    ){
        items((1..80).toList()){
            Row {
                Icon(Icons.Default.Call, contentDescription = null)
                Spacer(modifier = Modifier.width(16.dp))
                Text("Phone Number")
            }
        }
    }
}


@Preview()
@Composable
fun GridDemoPreview(){

    Scaffold(containerColor = Color.White) {
        GridDemo()
    }

}