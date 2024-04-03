package com.example.chat_tasks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.chat_tasks.Navigation.NavHost
import com.example.chat_tasks.ui.theme.Chat_TasksTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Chat_TasksTheme {

                NavHost()

            }
        }
    }
}

