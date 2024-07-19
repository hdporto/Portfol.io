package com.example.itportfoliomakerapp.pages

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.itportfoliomakerapp.R
import com.example.itportfoliomakerapp.bottomNavBar.BottomNavBar
import com.example.itportfoliomakerapp.components.KotlinDialog
import com.example.itportfoliomakerapp.components.DialogModel
import com.example.itportfoliomakerapp.components.JavaDialog
import com.example.itportfoliomakerapp.components.JavaScriptStarsRating
import com.example.itportfoliomakerapp.components.JavaStarsRating
import com.example.itportfoliomakerapp.components.JavascriptDialog
import com.example.itportfoliomakerapp.components.KotlinStarsRating
import com.example.itportfoliomakerapp.components.PythonDialog
import com.example.itportfoliomakerapp.components.PythonStarsRating
import com.example.itportfoliomakerapp.styles.ColorTheme
import com.example.itportfoliomakerapp.styles.Fonts

@Composable
fun Skills(navController: NavController, scrollState: ScrollState, viewModel: DialogModel) {
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
                    .size(height = 1700.dp, width = 370.dp)
                    .padding(top = 30.dp)
                    .verticalScroll(scrollState),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top
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
                                    .align(Alignment.Center)
                            )
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
                            )
                            .clickable { viewModel.onKotlinClick() },
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
                                    color = ColorTheme.lightblue,
                                    fontFamily = Fonts.workSansFontFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 40.sp
                                )
                                Spacer(modifier = Modifier.height(30.dp))
                                KotlinStarsRating()
                            }
                        }
                        Spacer(modifier = Modifier.height(20.dp))
                        ElevatedCard(modifier = Modifier
                            .size(height = 350.dp, width = 320.dp)
                            .border(
                                BorderStroke(2.dp, ColorTheme.lightGray),
                                shape = RoundedCornerShape(20.dp)
                            )
                            .clickable { viewModel.onJavascriptClick() },
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
                                    color = ColorTheme.lightblue,
                                    fontFamily = Fonts.workSansFontFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 40.sp
                                )
                                Spacer(modifier = Modifier.height(30.dp))
                                JavaScriptStarsRating()
                            }
                        }
                        Spacer(modifier = Modifier.height(20.dp))
                        ElevatedCard(modifier = Modifier
                            .size(height = 350.dp, width = 320.dp)
                            .border(
                                BorderStroke(2.dp, ColorTheme.lightGray),
                                shape = RoundedCornerShape(20.dp)
                            )
                            .clickable { viewModel.onJavaClick() },
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
                                    color = ColorTheme.lightblue,
                                    fontFamily = Fonts.workSansFontFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 40.sp
                                )
                                Spacer(modifier = Modifier.height(30.dp))
                                JavaStarsRating()
                            }
                        }
                        Spacer(modifier = Modifier.height(20.dp))
                        ElevatedCard(modifier = Modifier
                            .size(height = 350.dp, width = 320.dp)
                            .border(
                                BorderStroke(2.dp, ColorTheme.lightGray),
                                shape = RoundedCornerShape(20.dp)
                            )
                            .clickable { viewModel.onPythonClick() },
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
                                    color = ColorTheme.lightblue,
                                    fontFamily = Fonts.workSansFontFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 40.sp
                                )
                                Spacer(modifier = Modifier.height(30.dp))
                                PythonStarsRating()
                            }
                        }
                    }
                }
            }
        }
    )
    if(viewModel.isKotlinShown){
        KotlinDialog(
            onDismiss = {
                viewModel.kotlinDismiss()
            }
        )
    }
    if(viewModel.isJavascriptShown){
        JavascriptDialog(
            onDismiss = {
                viewModel.javascriptDismiss()
            }
        )
    }
    if(viewModel.isJavaShown){
        JavaDialog(
            onDismiss = {
                viewModel.javaDismiss()
            }
        )
    }
    if(viewModel.isPythonShown){
        PythonDialog(
            onDismiss = {
                viewModel.pythonDismiss()
            }
        )
    }
}