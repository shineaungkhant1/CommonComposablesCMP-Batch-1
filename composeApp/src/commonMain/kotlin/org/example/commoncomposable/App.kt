package org.example.commoncomposable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.example.commoncomposable.components.bottom_navigation.BottomNavigationDemo
import org.example.commoncomposable.components.bottom_sheet.BottomSheetDemo
import org.example.commoncomposable.components.display_composable.ButtonDemo
import org.example.commoncomposable.components.display_composable.DropDownDemo
import org.example.commoncomposable.components.display_composable.ImageDemo
import org.jetbrains.compose.ui.tooling.preview.Preview

import org.example.commoncomposable.components.display_composable.TextDemo
import org.example.commoncomposable.components.navigation_demo.NavigationDemo

@Composable
@Preview
fun App() {
//    MaterialTheme {
//        TextDemo()
//        ButtonDemo()

        Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()){
//            ImageDemo()
//            DropDownDemo()
//            NavigationDemo()
//            BottomNavigationDemo()
            BottomSheetDemo()
        }
//    }
}