package com.example.chat_tasks.Home_UI


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.chat_tasks.R



@Composable
fun Chat(index:Int){

    if(index==0 ||index==2) {
        if (index==0){
            Box(modifier = Modifier.fillMaxSize().padding(15.dp), contentAlignment = Alignment.BottomEnd) {
                Image(painter = painterResource(id = com.example.chat_tasks.R.drawable.message1), contentDescription ="image1" )

            }
        }else{
            Box(modifier = Modifier.fillMaxSize().padding(15.dp), contentAlignment = Alignment.BottomEnd) {
                Image(painter = painterResource(id = com.example.chat_tasks.R.drawable.message3), contentDescription = "image2")

            }
        }





    }else {

            if (index==1){
                Box(modifier = Modifier.fillMaxSize().padding(15.dp)) {
                    Image(painter = painterResource(id = com.example.chat_tasks.R.drawable.message2), contentDescription = "image3")

                }
            }else{
                Box(modifier = Modifier.fillMaxSize().padding(15.dp)) {
                    Image(painter = painterResource(id = com.example.chat_tasks.R.drawable.message4), contentDescription ="image4" )

                }
            }




    }
}

