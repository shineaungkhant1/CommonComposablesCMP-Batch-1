package org.example.commoncomposable.components.bottom_navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun BottomNavigationDemo(){

    val bottomNavigationItems = listOf(
        BottomNavigationItemData("Home", Icons.Default.Home),
        BottomNavigationItemData("Profile", Icons.Default.AccountCircle),
    )

    // State
    var selectedItem by remember {mutableStateOf("Home")}

    Scaffold(containerColor = Color.White,bottomBar = {
        NavigationBar(containerColor = Color.LightGray) { bottomNavigationItems.forEach {
            NavigationBarItem(
                selected = selectedItem == it.name,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color.Red,
                    selectedTextColor = Color.White,
                    indicatorColor = Color.Transparent
                ),
                icon = {
                    Icon(it.icon, contentDescription = null)
                },
                label = {
                    Text(it.name)
                },
                onClick = {
                    selectedItem = it.name
                }
            )
        } }
    }
    ) {
        if(selectedItem == "Home"){
            HomeScreen()
        } else {
            ProfileScreen()
        }
    }


}

@Composable
fun HomeScreen(){
    Scaffold(containerColor = Color.White) {
        Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()){
            Text("Home Screen")
        }
    }
}

@Composable
fun ProfileScreen(){
    Scaffold(containerColor = Color.White) {
        Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()){
            Text("Profile Screen")
        }
    }
}

data class BottomNavigationItemData(val name : String, val icon : ImageVector)


@Preview
@Composable
fun BottomNavigationDemoPreview(){
    BottomNavigationDemo()
}