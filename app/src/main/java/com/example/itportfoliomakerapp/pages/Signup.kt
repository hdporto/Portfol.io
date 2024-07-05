package com.example.itportfoliomakerapp.pages

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
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
fun Signup(navController: NavController) {

    var userFirstNameInput by remember { mutableStateOf("") }
    var userLastNameInput by remember { mutableStateOf("") }
    var userPasswordInput by remember { mutableStateOf("") }
    var userEmailInput by remember { mutableStateOf("") }
    var passwordVisibility by remember { mutableStateOf(false) }

    val icon = if(passwordVisibility)
        painterResource(id = R.drawable.eye_svgrepo_com)
    else
        painterResource(id = R.drawable.eye_closed_svgrepo_com)

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = ColorTheme.darkMode
    ) {
        Row(modifier = Modifier
            .padding(top = 40.dp, start = 25.dp)) {
            IconButton(onClick = { navController.navigate(Routes.login)}) {
                Icon(painter = painterResource(id = R.drawable.back_svgrepo_com),
                    contentDescription = "back",
                    tint = ColorTheme.white,
                    modifier = Modifier.size(30.dp))
            }
            Spacer(modifier = Modifier.width(80.dp))
            Text(text = "Register",
                color = ColorTheme.white,
                fontFamily = Fonts.workSansFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 130.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            OutlinedTextField(modifier = Modifier.width(320.dp),
                value = userFirstNameInput,
                onValueChange = {userFirstName -> userFirstNameInput = userFirstName},
                label = { Text(
                    text = "First Name",
                    color = ColorTheme.white,
                    fontFamily = Fonts.workSansFontFamily,
                    fontWeight = FontWeight.Normal)},
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = ColorTheme.white,
                    focusedTextColor = ColorTheme.white ,
                    cursorColor = ColorTheme.white,
                    unfocusedTextColor = ColorTheme.white
                )
            )
            Spacer(modifier = Modifier.height(10.dp))
            OutlinedTextField(modifier = Modifier.width(320.dp),
                value = userFirstNameInput,
                onValueChange = {userLastName -> userLastNameInput = userLastName},
                label = { Text(
                    text = "Last Name",
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
                            tint = ColorTheme.white,
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
        }
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 230.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            Button(onClick = { navController.navigate(Routes.login)},
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .width(320.dp)
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = ColorTheme.lightblue,
                    contentColor = ColorTheme.white
                )
            ) {
                Text(text = "Proceed",
                    fontFamily = Fonts.workSansFontFamily,
                    fontWeight = FontWeight.Normal)
            }
            Spacer(modifier = Modifier.height(40.dp))
            Text(text = "Or register using: ",
                color = ColorTheme.white,
                fontFamily = Fonts.workSansFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp)
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 130.dp),
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