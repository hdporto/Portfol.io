package com.example.itportfoliomakerapp.pages

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.itportfoliomakerapp.R
import com.example.itportfoliomakerapp.bottomNavBar.BottomNavBar
import com.example.itportfoliomakerapp.styles.ColorTheme
import com.example.itportfoliomakerapp.styles.Fonts

@Composable
fun Projects(navController: NavController, scrollState: ScrollState) {
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
                        .size(height = 1800.dp, width = 370.dp),
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
                                Icon(painter = painterResource(id = R.drawable.portfolio_suitcase_svgrepo_com),
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
                            Text(text = "Projects",
                                color = ColorTheme.white,
                                fontFamily = Fonts.workSansFontFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 40.sp)
                            Spacer(modifier = Modifier.height(20.dp))
                        }
                    }
                }
            }
        }
    )
}