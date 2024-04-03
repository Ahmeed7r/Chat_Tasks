package com.example.chat_tasks.Home_UI

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.chat_tasks.Home_UI.Chat

@Composable
fun Second_Screen(navController: NavController) {
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Ltr) {

        Column() {
            Spacer(modifier = Modifier.padding(5.dp))
            Image(painter = painterResource(id = com.example.chat_tasks.R.drawable.back),
                contentDescription = "back",
                modifier = Modifier
                    .clickable {
                        navController.navigate("main")
                    }
                    .padding(10.dp)
            )

            Text(text = "Display size", fontSize = 22.sp, modifier = Modifier.padding(10.dp))


            LazyColumn() {
                items(4) {
                    Chat(index = it)

                }
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Text(text = "Preview", fontSize = 22.sp, modifier = Modifier.padding(10.dp))

            Spacer(modifier = Modifier.padding(8.dp))
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.BottomCenter) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Row() {
                        repeat(3) {
                            if (it == 0) {
                                Box(
                                    modifier = Modifier
                                        .padding(5.dp)
                                        .align(Alignment.Top)
                                        .background(Color.Blue, CircleShape)
                                        .size(10.dp)
                                )
                            } else {
                                Box(
                                    modifier = Modifier
                                        .padding(5.dp)
                                        .align(Alignment.CenterVertically)
                                        .background(Color.DarkGray, CircleShape)
                                        .size(10.dp)
                                )

                            }


                        }
                    }

                    Text(text = "Default", fontSize = 14.sp)
                    Spacer(modifier = Modifier.padding(5.dp))
                }
            }

            Row() {
                Text(text = "-", fontSize = 40.sp, modifier = Modifier.padding(start = 50.dp))
                Spacer(modifier = Modifier.padding(10.dp))
                Box(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .background(Color.DarkGray, CircleShape)
                        .size(5.dp)
                )

                Box(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .background(Color.Blue)
                        .size(50.dp, 2.dp)
                )

                Box(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .background(Color.Blue, CircleShape)
                        .size(12.dp)
                )

                Box(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .background(Color.LightGray)
                        .size(50.dp, 2.dp)
                )

                Box(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .background(Color.DarkGray, CircleShape)
                        .size(5.dp)
                )

                Box(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .background(Color.LightGray)
                        .size(50.dp, 2.dp)
                )

                Box(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .background(Color.DarkGray, CircleShape)
                        .size(5.dp)
                )

                Box(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .background(Color.LightGray)
                        .size(50.dp, 2.dp)
                )

                Box(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .background(Color.DarkGray, CircleShape)
                        .size(5.dp)
                )
                Spacer(modifier = Modifier.padding(10.dp))


                Text(text = "+", fontSize = 25.sp, modifier = Modifier.padding(10.dp))
            }


            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.BottomCenter) {

                Text(text = "make the items on your screen smaller or larger. \n Some apps on your screen may change position.", fontSize = 10.sp)
            }


        }

    }
}
