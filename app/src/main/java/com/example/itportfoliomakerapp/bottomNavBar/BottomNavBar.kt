package com.example.itportfoliomakerapp.bottomNavBar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.itportfoliomakerapp.R
import com.example.itportfoliomakerapp.navigationRoutes.Routes
import com.example.itportfoliomakerapp.styles.ColorTheme

@Composable
fun BottomNavBar(navController: NavController) {

    BottomAppBar(modifier = Modifier.height(80.dp),
        containerColor = ColorTheme.darkMode,
        contentColor = Color.White,
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = {
                navController.navigate(Routes.skills)
            }) {
                Icon(
                    painter = painterResource(id = R.drawable.thunder_svgrepo_com),
                    contentDescription = "Skills",
                    modifier = Modifier.size(32.dp)
                )
            }
            IconButton(onClick = {
                navController.navigate(Routes.profile)
            }) {
                Icon(
                    painter = painterResource(id = R.drawable.profile_svgrepo_com),
                    contentDescription = "Profile",
                    modifier = Modifier.size(32.dp)
                )
            }
            IconButton(onClick = {
                navController.navigate(Routes.projects)
            }) {
                Icon(
                    painter = painterResource(id = R.drawable.portfolio_suitcase_svgrepo_com),
                    contentDescription = "Projects",
                    modifier = Modifier.size(32.dp)
                )
            }
            IconButton(onClick = {
                navController.navigate(Routes.settings)
            }) {
                Icon(
                    painter = painterResource(id = R.drawable.settings_svgrepo_com),
                    contentDescription = "Settings",
                    modifier = Modifier.size(32.dp)
                )
            }
        }
    }
}