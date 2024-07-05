package com.example.itportfoliomakerapp.pages

import android.widget.RatingBar
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.itportfoliomakerapp.R
import com.example.itportfoliomakerapp.bottomNavBar.BottomNavBar
import com.example.itportfoliomakerapp.components.StarsRating
import com.example.itportfoliomakerapp.styles.ColorTheme
import com.example.itportfoliomakerapp.styles.Fonts

@Composable
fun Skills(navController: NavController, scrollState: ScrollState) {
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
                    .padding(top = 30.dp)
                    .verticalScroll(scrollState),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top
                ) {
                    ElevatedCard(modifier = Modifier
                        .size(height = 1700.dp, width = 370.dp),
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
                                Icon(painter = painterResource(id = R.drawable.thunder_svgrepo_com),
                                    contentDescription = null,
                                    tint = ColorTheme.lightblue,
                                    modifier = Modifier
                                        .size(50.dp)
                                        .align(Alignment.Center))
                                Icon(painter = painterResource(id = R.drawable.pencil_svgrepo_com),
                                    contentDescription = null,
                                    tint = ColorTheme.white,
                                    modifier = Modifier
                                        .size(26.dp)
                                        .align(Alignment.CenterEnd))
                            }
                            Text(text = "Skills",
                                color = ColorTheme.white,
                                fontFamily = Fonts.workSansFontFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 40.sp)
                            Spacer(modifier = Modifier.height(20.dp))
                            ElevatedCard(modifier = Modifier
                                .size(height = 350.dp, width = 320.dp)
                                .border(
                                    BorderStroke(2.dp, ColorTheme.lightGray),
                                    shape = RoundedCornerShape(20.dp)
                                ),
                                elevation = CardDefaults.cardElevation(
                                    defaultElevation = 10.dp
                                ),
                                colors = CardDefaults.cardColors(ColorTheme.gray)
                            ) {
                                Column(modifier = Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center
                                ) {
                                    Image(painter = painterResource(id = R.drawable.icons8_kotlin_96),
                                        contentDescription = null,
                                        modifier = Modifier.size(80.dp)
                                    )
                                    Text(text = "Kotlin",
                                        color = ColorTheme.white,
                                        fontFamily = Fonts.workSansFontFamily,
                                        fontWeight = FontWeight.Normal,
                                        fontSize = 40.sp
                                    )
                                    Spacer(modifier = Modifier.height(30.dp))
                                    var rating_1 by remember { mutableDoubleStateOf(3.5) }
                                    StarsRating(
                                        modifier = Modifier
                                            .size(40.dp),
                                        rating = rating_1,
                                        starsColor = Color.Yellow
                                    ) {
                                        rating_1 = it
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.height(20.dp))
                            ElevatedCard(modifier = Modifier
                                .size(height = 350.dp, width = 320.dp)
                                .border(
                                    BorderStroke(2.dp, ColorTheme.lightGray),
                                    shape = RoundedCornerShape(20.dp)
                                ),
                                elevation = CardDefaults.cardElevation(
                                    defaultElevation = 10.dp
                                ),
                                colors = CardDefaults.cardColors(ColorTheme.gray)
                            ) {
                                Column(modifier = Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center
                                ) {
                                    Image(painter = painterResource(id = R.drawable.icons8_javascript_96),
                                        contentDescription = null,
                                        modifier = Modifier.size(80.dp)
                                    )
                                    Text(text = "Javascript",
                                        color = ColorTheme.white,
                                        fontFamily = Fonts.workSansFontFamily,
                                        fontWeight = FontWeight.Normal,
                                        fontSize = 40.sp
                                    )
                                    Spacer(modifier = Modifier.height(30.dp))
                                    var rating_1 by remember { mutableDoubleStateOf(3.5) }
                                    StarsRating(
                                        modifier = Modifier
                                            .size(40.dp),
                                        rating = rating_1,
                                        starsColor = Color.Yellow
                                    ) {
                                        rating_1 = it
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.height(20.dp))
                            ElevatedCard(modifier = Modifier
                                .size(height = 350.dp, width = 320.dp)
                                .border(
                                    BorderStroke(2.dp, ColorTheme.lightGray),
                                    shape = RoundedCornerShape(20.dp)
                                ),
                                elevation = CardDefaults.cardElevation(
                                    defaultElevation = 10.dp
                                ),
                                colors = CardDefaults.cardColors(ColorTheme.gray)
                            ) {
                                Column(modifier = Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center
                                ) {
                                    Image(painter = painterResource(id = R.drawable.icons8_java_96),
                                        contentDescription = null,
                                        modifier = Modifier.size(80.dp)
                                    )
                                    Text(text = "Java",
                                        color = ColorTheme.white,
                                        fontFamily = Fonts.workSansFontFamily,
                                        fontWeight = FontWeight.Normal,
                                        fontSize = 40.sp
                                    )
                                    Spacer(modifier = Modifier.height(30.dp))
                                    var rating_1 by remember { mutableDoubleStateOf(3.5) }
                                    StarsRating(
                                        modifier = Modifier
                                            .size(40.dp),
                                        rating = rating_1,
                                        starsColor = Color.Yellow
                                    ) {
                                        rating_1 = it
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.height(20.dp))
                            ElevatedCard(modifier = Modifier
                                .size(height = 350.dp, width = 320.dp)
                                .border(
                                    BorderStroke(2.dp, ColorTheme.lightGray),
                                    shape = RoundedCornerShape(20.dp)
                                ),
                                elevation = CardDefaults.cardElevation(
                                    defaultElevation = 10.dp
                                ),
                                colors = CardDefaults.cardColors(ColorTheme.gray)
                            ) {
                                Column(modifier = Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center
                                ) {
                                    Image(painter = painterResource(id = R.drawable.icons8_python_96),
                                        contentDescription = null,
                                        modifier = Modifier.size(80.dp)
                                    )
                                    Text(text = "Python",
                                        color = ColorTheme.white,
                                        fontFamily = Fonts.workSansFontFamily,
                                        fontWeight = FontWeight.Normal,
                                        fontSize = 40.sp
                                    )
                                    Spacer(modifier = Modifier.height(30.dp))
                                    var rating_1 by remember { mutableDoubleStateOf(3.5) }
                                    StarsRating(
                                        modifier = Modifier
                                            .size(40.dp),
                                        rating = rating_1,
                                        starsColor = Color.Yellow
                                    ) {
                                        rating_1 = it
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    )
}