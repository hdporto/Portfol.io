package com.example.itportfoliomakerapp.pages

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.itportfoliomakerapp.navigationRoutes.Routes
import com.example.itportfoliomakerapp.R
import com.example.itportfoliomakerapp.styles.ColorTheme
import com.example.itportfoliomakerapp.styles.Fonts


@Composable
fun Login(navController: NavController) {

    var userEmailInput by remember { mutableStateOf("") }
    var userPasswordInput by remember { mutableStateOf("") }
    var passwordVisibility by remember { mutableStateOf(false) }

    val icon = if(passwordVisibility)
        painterResource(id = R.drawable.eye_svgrepo_com)
    else
        painterResource(id = R.drawable.eye_closed_svgrepo_com)

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = ColorTheme.darkMode
    ) {
        Column(
            Modifier
                .fillMaxWidth()
                .padding(top = 80.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Icon(painter = painterResource(id = R.drawable.portfolio_suitcase_svgrepo_com),
                contentDescription = "logo",
                tint = ColorTheme.lightblue,
                modifier = Modifier.size(100.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "Portfol.io",
                color = ColorTheme.white,
                fontSize = 40.sp,
                fontFamily = Fonts.workSansFontFamily,
                fontWeight = FontWeight.Bold,)
            OutlinedTextField(modifier = Modifier.width(320.dp),
                value = userEmailInput,
                onValueChange = {userEmail -> userEmailInput = userEmail},
                label = { Text(
                    text = "Email",
                    color = ColorTheme.white,
                    fontFamily = Fonts.workSansFontFamily,
                    fontWeight = FontWeight.Normal)},
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = ColorTheme.white,
                    focusedTextColor = ColorTheme.white,
                    cursorColor = ColorTheme.white,
                    unfocusedTextColor = ColorTheme.white
                )
            )
            Spacer(modifier = Modifier.height(10.dp))
            OutlinedTextField(modifier = Modifier.width(320.dp),
                trailingIcon = {
                    IconButton(onClick = {
                        passwordVisibility = !passwordVisibility
                    }) {
                        Icon(painter = icon, contentDescription = null,
                            tint = ColorTheme.lightblue,
                            modifier = Modifier.size(24.dp))
                    }
                },
                visualTransformation = if(passwordVisibility) VisualTransformation.None
                else PasswordVisualTransformation(),
                value = userPasswordInput,
                onValueChange = {userPassword -> userPasswordInput = userPassword},
                label = { Text(
                    text = "Password",
                    color = ColorTheme.white,
                    fontFamily = Fonts.workSansFontFamily,
                    fontWeight = FontWeight.Normal)},
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = ColorTheme.white,
                    focusedTextColor = ColorTheme.white,
                    cursorColor = ColorTheme.white,
                    unfocusedTextColor = ColorTheme.white
                )
            )
            Spacer(modifier = Modifier.height(40.dp))
            Button(onClick = { navController.navigate(Routes.profile)},
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .width(320.dp)
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = ColorTheme.lightblue,
                    contentColor = ColorTheme.white
                )
            ) {
                Text(text = "Login",
                    fontFamily = Fonts.workSansFontFamily,
                    fontWeight = FontWeight.Normal)
            }
            Spacer(modifier = Modifier.height(10.dp))
            Button(onClick = { navController.navigate(Routes.signup)},
                modifier = Modifier
                    .width(320.dp)
                    .height(50.dp)
                    .border(
                        width = 1.dp,
                        color = ColorTheme.white,
                        shape = RoundedCornerShape(10.dp)
                    ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = ColorTheme.darkMode,
                    contentColor = ColorTheme.white
                ),
            ) {
                Text(text = "Signup",
                    fontFamily = Fonts.workSansFontFamily,
                    fontWeight = FontWeight.Normal)
            }
            Spacer(modifier = Modifier.height(30.dp))
            Text(text = "Or log in using:",
                color = ColorTheme.white,
                fontFamily = Fonts.workSansFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp)
            Spacer(modifier = Modifier.height(30.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Bottom
            ) {
                OutlinedButton(onClick = {},
                    modifier = Modifier.size(85.dp),
                    shape = RoundedCornerShape(20.dp),
                    border = BorderStroke(1.dp, Color.Black),
                    colors = ButtonDefaults.outlinedButtonColors(
                        containerColor = ColorTheme.white,
                    )) {
                    Image(
                        painter = painterResource(id = R.drawable.icons8_google_96),
                        contentDescription = "Google Icon",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(40.dp)
                    )
                }
                Spacer(modifier = Modifier.width(20.dp))
                OutlinedButton(onClick = {},
                    modifier = Modifier.size(85.dp),
                    shape = RoundedCornerShape(20.dp),
                    border = BorderStroke(1.dp, Color.Black),
                    colors = ButtonDefaults.outlinedButtonColors(
                        containerColor = ColorTheme.white,
                    )) {
                    Image(
                        painter = painterResource(id = R.drawable.icons8_facebook_96),
                        contentDescription = "Google Icon",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(45.dp)
                    )
                }
            }
        }
    }
}