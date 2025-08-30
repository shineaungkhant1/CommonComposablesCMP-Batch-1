package org.example.commoncomposable.components.navigation_demo

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlinx.serialization.Serializable
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun NavigationDemo() {
    val navController: NavHostController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NaveRoutes.Home()
    ) {
        composable<NaveRoutes.Home> {
            HomeScreen(onTapNavigationToDetails = {
                navController.navigate(NaveRoutes.Details("From Home"))
            })
        }

        composable<NaveRoutes.Details> { backStackEntry ->
            val args = backStackEntry.toRoute<NaveRoutes.Details>()
            val message = args.message
            DetailScreen(
                onTapBack = {
                    navController.navigateUp()
                },
                message,
                onTapNavigationToSettings = {
                    // Push Replacement
//                    navController.navigate(NaveRoutes.Settings())
                    navController.navigate(NaveRoutes.Settings()){
                        navController.popBackStack()
                    }
                },

            )
        }

        composable<NaveRoutes.Settings> {
            SettingsScreen(
                onTapNavigationToHome = {
                    navController.navigate(NaveRoutes.Home()) {
                        popUpTo(navController.graph.startDestinationId){inclusive = true}
                    }
                }
            )
        }
    }

}

@Serializable
sealed class NaveRoutes {

    @Serializable
    class Home()

    @Serializable
    data class Details(val message: String)

    @Serializable
    class Settings()
}

@Preview
@Composable
fun NavigationDemoPreview() {
    NavigationDemo()
}