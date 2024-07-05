package com.example.itportfoliomakerapp.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.itportfoliomakerapp.R
import com.example.itportfoliomakerapp.bottomNavBar.BottomNavBar
import com.example.itportfoliomakerapp.styles.ColorTheme
import com.example.itportfoliomakerapp.styles.Fonts

@Composable
fun Profile(navController: NavController, scrollState: ScrollState) {

    Scaffold(
        bottomBar = { BottomNavBar(navController)
        },
        content = { innerPadding ->
            Surface(modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
                color = ColorTheme.darkMode
            ) {
                Column(modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 20.dp)
                    .verticalScroll(scrollState),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top
                ) {
                    ElevatedCard(modifier = Modifier
                        .size(height = 550.dp, width = 370.dp),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 10.dp
                        ),
                        colors = CardDefaults.cardColors(ColorTheme.gray)
                    ) {
                        Column(modifier = Modifier
                            .fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Box(modifier = Modifier
                                .fillMaxWidth()
                                .padding(20.dp)
                            ) {
                                Text(text = "<>",
                                    color = ColorTheme.lightblue,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 50.sp,
                                    modifier = Modifier.align(Alignment.Center)
                                )
                                Icon(painter = painterResource(id = R.drawable.pencil_svgrepo_com),
                                    contentDescription = null,
                                    tint = ColorTheme.white,
                                    modifier = Modifier
                                        .size(26.dp)
                                        .align(Alignment.CenterEnd)
                                )
                            }
                            Image(painter = painterResource(id = R.drawable.profilepicture),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(200.dp)
                                    .clip(CircleShape)
                            )
                        }
                        Column(modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(text = "Hans Daniel Porto",
                                textAlign = TextAlign.Center,
                                color = ColorTheme.white,
                                fontFamily = Fonts.workSansFontFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 50.sp)
                            Text(text = "</>",
                                color = ColorTheme.lightblue,
                                fontWeight = FontWeight.Bold,
                                fontSize = 50.sp
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    ElevatedCard(modifier = Modifier
                        .size(height = 200.dp, width = 370.dp),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 10.dp
                        ),
                        colors = CardDefaults.cardColors(ColorTheme.gray)
                    ) {
                        Column(modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(text = "About Me",
                                color = ColorTheme.white,
                                fontFamily = Fonts.workSansFontFamily,
                                fontWeight = FontWeight.Bold,
                                fontSize = 40.sp)
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(text = "My name is Hans Daniel C. Porto. I am a 4th year IT student from Manuel S. Enverga University Foundation.",
                                color = ColorTheme.white,
                                fontFamily = Fonts.workSansFontFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 16.sp)
                        }
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    ElevatedCard(modifier = Modifier
                        .size(height = 200.dp, width = 370.dp),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 10.dp
                        ),
                        colors = CardDefaults.cardColors(ColorTheme.gray)
                    ) {
                        Column(modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(text = "Hobbies",
                                color = ColorTheme.white,
                                fontFamily = Fonts.workSansFontFamily,
                                fontWeight = FontWeight.Bold,
                                fontSize = 40.sp)
                            Spacer(modifier = Modifier.height(20.dp))
                            Row(modifier = Modifier
                                .fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceEvenly
                            ) {
                                Icon(painter = painterResource(id = R.drawable.code_square_svgrepo_com),
                                    contentDescription = null,
                                    tint = ColorTheme.lightblue,
                                    modifier = Modifier.size(64.dp))
                                Icon(painter = painterResource(id = R.drawable.piano_svgrepo_com),
                                    contentDescription = null,
                                    tint = ColorTheme.lightblue,
                                    modifier = Modifier.size(60.dp))
                                Icon(painter = painterResource(id = R.drawable.game_8_svgrepo_com),
                                    contentDescription = null,
                                    tint = ColorTheme.lightblue,
                                    modifier = Modifier.size(64.dp))
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    ElevatedCard(modifier = Modifier
                        .size(height = 200.dp, width = 370.dp),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 10.dp
                        ),
                        colors = CardDefaults.cardColors(ColorTheme.gray)
                    ) {
                        Column(modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(text = "Contact Me",
                                color = ColorTheme.white,
                                fontFamily = Fonts.workSansFontFamily,
                                fontWeight = FontWeight.Bold,
                                fontSize = 40.sp)
                            Spacer(modifier = Modifier.height(20.dp))
                            Row(modifier = Modifier
                                .fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceEvenly
                            ) {
                                Image(painter = painterResource(id = R.drawable.icons8_google_96),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(60.dp)
                                        .clickable {})
                                Image(painter = painterResource(id = R.drawable.icons8_facebook_96),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(60.dp)
                                        .clickable {})
                            }
                        }
                    }
                }
            }
        }
    )
}