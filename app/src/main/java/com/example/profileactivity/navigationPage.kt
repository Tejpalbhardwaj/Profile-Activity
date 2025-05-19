package com.example.profileactivity

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigationpage(){

   val navController = rememberNavController()

    NavHost(navController = navController , startDestination = "main_page"){

        composable("main_page"){
            mainPage(modifier = Modifier , navController)
        }



        composable("profile_Screen"){
            ProfilePage(navController)
        }

    }

}