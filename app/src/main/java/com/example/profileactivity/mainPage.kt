package com.example.profileactivity

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun mainPage(modifier: Modifier , navController: NavController) {

            Scaffold(
                bottomBar = {
                    BottomAppBar( containerColor = Color.DarkGray, // Black background
                        tonalElevation = 0.dp,
                        actions = {
                            Row (modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(24.dp)){
                                IconButton(onClick = { /* Handle Home click */ }) {
                                    Icon(Icons.Default.Home, contentDescription = "Home", tint = Color.White)
                                }
                                IconButton(onClick = { /* Handle Settings click */ }) {
                                    Icon(Icons.Default.Settings, contentDescription = "Settings" , tint = Color.White)
                                }
                                IconButton(onClick = { /* Handle Home click */ }) {
                                    Icon(Icons.Default.FavoriteBorder, contentDescription = "Fav", tint = Color.White)
                                }
                                IconButton(onClick = { /* Handle Settings click */ }) {
                                    Icon(Icons.Default.Call, contentDescription = "Call" , tint = Color.White)
                                }
                                IconButton(onClick = { navController.navigate("profile_Screen") }) {
                                    Icon(Icons.Default.Person, contentDescription = "Profile", tint = Color.White)
                                }
                            }
                        }
                    )
                }) {

                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(it),
                    color = Color.Black
                ){

                    Column(verticalArrangement = Arrangement.Center  , horizontalAlignment = Alignment.CenterHorizontally) {
                        Text("This Is Main Page", fontSize = 20.sp, color = Color.White)
                    }
                }

            }
        }


