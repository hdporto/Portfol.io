package com.example.itportfoliomakerapp.pages

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.itportfoliomakerapp.bottomNavBar.BottomNavBar
import com.example.itportfoliomakerapp.styles.ColorTheme

@Composable
fun Settings(navController: NavController) {
    Scaffold(
        bottomBar = { BottomNavBar(navController)
        },
        content = { innerPadding ->
            Surface(modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
                color = ColorTheme.darkMode
            ) {

            }
        }
    )
}