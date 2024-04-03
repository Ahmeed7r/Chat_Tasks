package com.example.chat_tasks.Home_UI

import android.graphics.fonts.FontStyle
import android.widget.Toast
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.chat_tasks.R

@Composable
fun First_Screen(navController:NavController){
    var context=LocalContext.current.applicationContext
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Ltr) {
        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = R.drawable.background),
                contentDescription = "image",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.matchParentSize()
            )
            Column(modifier = Modifier.fillMaxSize()) {
                Spacer(modifier = Modifier.padding(20.dp))

                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "logo",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.padding(10.dp)
                )
                Spacer(modifier = Modifier.padding(90.dp))

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Box(
                        modifier = Modifier
                            .width(220.dp)
                            .height(40.dp)
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.msg),
                            contentDescription = "message",
                            contentScale = ContentScale.FillBounds
                        )
                        Text(
                            text = "Are U 14 Years Or Older ?",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFE984A1)
                        )
                    }
                    Row(modifier = Modifier.clip(RoundedCornerShape(8))) {
                        Image(
                            painter = painterResource(id = R.drawable.man),
                            contentDescription = "person"
                        )
                        Spacer(modifier = Modifier.padding(3.dp))
                        Box(
                            modifier = Modifier
                                .size(230.dp, 320.dp)
                                .padding(10.dp)
                                .border(4.dp, color = Color.Yellow, RoundedCornerShape(8))
                                .clip(RoundedCornerShape(8))
                                .background(Color(0xFFD32ECF))
                        )
                        {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    text = "By Clicking Continue  , I Agree That I Am At Least 14 Years or Old",
                                    color = Color.White,
                                    fontSize = 12.sp
                                    ,
                                    fontFamily = FontFamily.SansSerif,
                                    modifier = Modifier.padding(10.dp)
                                )

                                Spacer(modifier = Modifier.padding(5.dp))
                                Button(
                                    onClick = {
                                        navController.navigate("Chat_Screen")
                                    },
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(0xFF2EC034)
                                    )

                                ) {
                                    Text(text = "Yes, Continue")
                                }
                                Spacer(modifier = Modifier.padding(5.dp))

                                Button(
                                    onClick = {
                                        Toast.makeText(context, "Ok", Toast.LENGTH_LONG).show()

                                    }, colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(0xFFE9DB5C)
                                    )
                                ) {
                                    Text(text = "No, I'm Not 14")
                                }

                            }
                        }


                    }


                }

            }
        }
    }

}