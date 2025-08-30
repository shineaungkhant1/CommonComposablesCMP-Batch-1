package org.example.commoncomposable.components.navigation_demo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun  HomeScreen(onTapNavigationToDetails: () -> Unit){
    Scaffold(containerColor = Color.White) {
        Box(
         contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()
        ){
            Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(12.dp)) {
                Text("Home Screen")
                Button(onClick = {
                    onTapNavigationToDetails()
                }){
                    Text("Navigate to details")
                }
            }
        }
    }
}


@Preview()
@Composable
fun  HomeScreenDemo(){
    HomeScreen(onTapNavigationToDetails = {})
}