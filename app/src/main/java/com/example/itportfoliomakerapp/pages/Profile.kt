package com.example.itportfoliomakerapp.pages

import android.annotation.SuppressLint
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.itportfoliomakerapp.R
import com.example.itportfoliomakerapp.bottomNavBar.BottomNavBar
import com.example.itportfoliomakerapp.components.DialogModel
import com.example.itportfoliomakerapp.components.GameDialog
import com.example.itportfoliomakerapp.components.MusicDialog
import com.example.itportfoliomakerapp.components.ProgramDialog
import com.example.itportfoliomakerapp.styles.ColorTheme
import com.example.itportfoliomakerapp.styles.Fonts

@SuppressLint("QueryPermissionsNeeded")
@Composable
fun Profile(navController: NavController, scrollState: ScrollState, viewModel: DialogModel) {

    val context = LocalContext.current
    val clipboardManager = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager

    fun copyToClipboard(text: String) {
        val clip = ClipData.newPlainText("Copied URL", text)
        clipboardManager.setPrimaryClip(clip)
    }

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
                    Column(modifier = Modifier
                        .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(20.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.profile_svgrepo_com),
                                contentDescription = null,
                                tint = ColorTheme.lightblue,
                                modifier = Modifier
                                    .size(50.dp)
                                    .align(Alignment.Center)
                            )
                        }
                        Text(text = "Profile",
                            color = ColorTheme.white,
                            fontFamily = Fonts.workSansFontFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 40.sp)
                        Spacer(modifier = Modifier.height(20.dp))
                    }
                    ElevatedCard(modifier = Modifier
                        .size(height = 390.dp, width = 320.dp)
                        .border(
                            BorderStroke(2.dp, ColorTheme.lightGray),
                            shape = RoundedCornerShape(20.dp)
                        ),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 10.dp
                        ),
                        colors = CardDefaults.cardColors(ColorTheme.gray)
                    ) {
                        Spacer(modifier = Modifier.height(60.dp))
                        Column(modifier = Modifier
                            .fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(painter = painterResource(id = R.drawable.profilepicture),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(180.dp)
                                    .clip(CircleShape)
                            )
                            Text(text = "Hans Daniel Porto",
                                textAlign = TextAlign.Center,
                                color = ColorTheme.lightblue,
                                fontFamily = Fonts.workSansFontFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 38.sp)
                        }
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(text = "Hobbies",
                        color = ColorTheme.white,
                        fontFamily = Fonts.workSansFontFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 38.sp)
                    Spacer(modifier = Modifier.height(20.dp))
                    ElevatedCard(modifier = Modifier
                        .size(height = 300.dp, width = 320.dp)
                        .border(
                            BorderStroke(2.dp, ColorTheme.lightGray),
                            shape = RoundedCornerShape(20.dp)
                        )
                        .clickable { viewModel.onProgClick() },
                        colors = CardDefaults.cardColors(ColorTheme.gray)
                    ) {
                        Column(modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Spacer(modifier = Modifier.height(38.dp))
                            Icon(painter = painterResource(id = R.drawable.code_square_svgrepo_com),
                                contentDescription = null,
                                tint = ColorTheme.lightblue,
                                modifier = Modifier.size(80.dp))
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(text = "Programming",
                                color = ColorTheme.white,
                                fontFamily = Fonts.workSansFontFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 38.sp)
                        }
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    ElevatedCard(modifier = Modifier
                        .size(height = 300.dp, width = 320.dp)
                        .border(
                            BorderStroke(2.dp, ColorTheme.lightGray),
                            shape = RoundedCornerShape(20.dp)
                        )
                        .clickable { viewModel.onMusicClick() },
                        colors = CardDefaults.cardColors(ColorTheme.gray)
                    ) {
                        Column(modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Spacer(modifier = Modifier.height(48.dp))
                            Icon(painter = painterResource(id = R.drawable.piano_svgrepo_com),
                                contentDescription = null,
                                tint = ColorTheme.lightblue,
                                modifier = Modifier.size(80.dp))
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(text = "Music",
                                color = ColorTheme.white,
                                fontFamily = Fonts.workSansFontFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 38.sp)
                        }
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    ElevatedCard(modifier = Modifier
                        .size(height = 300.dp, width = 320.dp)
                        .border(
                            BorderStroke(2.dp, ColorTheme.lightGray),
                            shape = RoundedCornerShape(20.dp)
                        )
                        .clickable { viewModel.onGamesClick() },
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
                            Spacer(modifier = Modifier.height(38.dp))
                            Icon(painter = painterResource(id = R.drawable.game_8_svgrepo_com),
                                contentDescription = null,
                                tint = ColorTheme.lightblue,
                                modifier = Modifier.size(80.dp))
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(text = "Video Games",
                                color = ColorTheme.white,
                                fontFamily = Fonts.workSansFontFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 38.sp)
                        }
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(text = "Contact Me",
                        color = ColorTheme.lightblue,
                        fontFamily = Fonts.workSansFontFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 38.sp)
                    Spacer(modifier = Modifier.height(20.dp))
                    Row(modifier = Modifier
                        .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Image(painter = painterResource(id = R.drawable.icons8_facebook_96),
                            contentDescription = null,
                            modifier = Modifier
                                .size(70.dp)
                                .clickable {copyToClipboard("https://www.facebook.com/hansdaniel.porto")})
                        Image(painter = painterResource(id = R.drawable.github_mark_white),
                            contentDescription = null,
                            modifier = Modifier
                                .size(60.dp)
                                .clickable {copyToClipboard("https://github.com/hdporto")})
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                }
            }
        }
    )
    if(viewModel.isProgShown){
        ProgramDialog(
            onDismiss = {
                viewModel.progDismiss()
            }
        )
    }
    if(viewModel.isMusicShown){
        MusicDialog(
            onDismiss = {
                viewModel.musicDismiss()
            }
        )
    }
    if(viewModel.isGamesShown){
        GameDialog(
            onDismiss = {
                viewModel.gamesDismiss()
            }
        )
    }
}