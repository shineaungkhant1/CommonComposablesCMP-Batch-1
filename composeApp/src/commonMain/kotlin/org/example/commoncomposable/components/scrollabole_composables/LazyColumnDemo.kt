package org.example.commoncomposable.components.scrollabole_composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun LazyColumnDemo() {
    LazyColumn {
//        items(30){
//            Text("List Items")
//        }

        item {
            Column {
                Box(
                    modifier = Modifier.height(300.dp).background(Color.Red).fillMaxWidth(),
                    contentAlignment = Alignment.Center,
                ) {
                    Text("Header", color = Color.White)
                }
                Spacer(modifier = Modifier.height(32.dp))
            }
        }


        itemsIndexed((1..50).toList()) { index, item ->
            Row(modifier = Modifier.padding(vertical = 12.dp)) {
                Icon(Icons.Default.Star, contentDescription = null)
                Spacer(modifier = Modifier.width(8.dp))
                Text("Item Number $item")
            }
            if (index < 49) {
                HorizontalDivider()

            }
        }
        item {
            Column {
                Box(
                    modifier = Modifier.height(300.dp).background(Color.Blue).fillMaxWidth(),
                    contentAlignment = Alignment.Center,
                ) {
                    Text("Header", color = Color.White)
                }
                Spacer(modifier = Modifier.height(32.dp))
            }
        }
    }
}


@Preview()
@Composable
fun LazyColumnDemoPreview() {
    Scaffold(containerColor = Color.White) {
        LazyColumnDemo()
    }
}