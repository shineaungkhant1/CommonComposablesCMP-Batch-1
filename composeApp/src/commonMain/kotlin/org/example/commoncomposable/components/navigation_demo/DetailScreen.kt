package org.example.commoncomposable.components.navigation_demo

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun  DetailScreen(onTapBack: ()-> Unit,message: String,onTapNavigationToSettings: () -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(title = {},
                navigationIcon = {
                    Icon(
                        Icons.AutoMirrored.Default.ArrowBack,
                        contentDescription =null,
                        modifier = Modifier.clickable(
                            onClick = {
                                onTapBack()
                            }
                        )
                    )
                })
        },
        containerColor = Color.White) {
        Box(
         contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()
        ){
            Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(12.dp)) {
                Text(message)
                Button(onClick = {
                    onTapNavigationToSettings()
                }){
                    Text("Navigate to Settings")
                }
            }
        }
    }
}


@Preview()
@Composable
fun  DetailScreenPreview(){
    DetailScreen({},"",{})
}