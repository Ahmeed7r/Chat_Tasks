package com.example.chat_tasks.Navigation

import androidx.compose.runtime.Composable

import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.chat_tasks.Home_UI.First_Screen
import com.example.chat_tasks.Home_UI.Second_Screen

@Composable
fun NavHost(){
    var NavController= rememberNavController()

    androidx.navigation.compose.NavHost(navController = NavController, startDestination ="main"){
        composable("main"){
                First_Screen(navController = NavController)
        }
        composable("Chat_Screen"){
            Second_Screen(NavController)
        }

    }
}