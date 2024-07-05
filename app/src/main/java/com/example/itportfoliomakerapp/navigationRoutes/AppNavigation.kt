package com.example.itportfoliomakerapp.navigationRoutes

import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.itportfoliomakerapp.pages.Login
import com.example.itportfoliomakerapp.pages.Profile
import com.example.itportfoliomakerapp.pages.Projects
import com.example.itportfoliomakerapp.pages.Settings
import com.example.itportfoliomakerapp.pages.Signup
import com.example.itportfoliomakerapp.pages.Skills

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    
    NavHost(navController = navController, startDestination = "loginScreen", builder = {
        composable(Routes.login) {
            Login(navController)
        }
        composable(Routes.signup) {
            Signup(navController)
        }
        composable(Routes.profile) {
            Profile(navController, scrollState = rememberScrollState())
        }
        composable(Routes.projects) {
            Projects(navController, scrollState = rememberScrollState())
        }
        composable(Routes.skills) {
            Skills(navController, scrollState = rememberScrollState())
        }
        composable(Routes.settings) {
            Settings(navController)
        }
    } )
}