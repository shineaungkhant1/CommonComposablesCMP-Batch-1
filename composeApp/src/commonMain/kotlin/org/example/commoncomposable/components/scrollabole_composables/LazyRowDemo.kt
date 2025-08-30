package org.example.commoncomposable.components.scrollabole_composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
fun LazyRowDemo(){

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center,){
        LazyRow {
//            items((1..30).toList()){number->
//                Text("List Item $number")
//            }

            itemsIndexed((1..30).toList()){index, item ->
                Row (modifier = Modifier.padding(horizontal = 16.dp)){
                    Icon(Icons.Default.ThumbUp, contentDescription = null)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Item Number $item")
                }
                if(index <29){
                    VerticalDivider(modifier = Modifier.height(32.dp))
                }
            }

        }
    }
}


@Preview()
@Composable
fun LazyRowDemoPreview(){
    Scaffold (containerColor = Color.White){
        LazyRowDemo()
    }
}