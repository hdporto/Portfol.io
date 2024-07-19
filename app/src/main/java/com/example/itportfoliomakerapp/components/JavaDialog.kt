package com.example.itportfoliomakerapp.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.itportfoliomakerapp.R
import com.example.itportfoliomakerapp.styles.ColorTheme
import com.example.itportfoliomakerapp.styles.Fonts

@Composable
fun JavaDialog(
    onDismiss:() -> Unit,
) {
    Dialog(onDismissRequest = {
        onDismiss()
    },
        properties = DialogProperties(
            usePlatformDefaultWidth = false
        )
    ) {
        ElevatedCard(modifier = Modifier
            .size(height = 600.dp, width = 350.dp)
            .border(
                BorderStroke(2.dp, ColorTheme.lightGray),
                shape = RoundedCornerShape(20.dp)
            ),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 10.dp
            ),
            colors = CardDefaults.cardColors(ColorTheme.gray)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.icons8_java_96),
                    contentDescription = null,
                    modifier = Modifier.size(80.dp)
                )
                Text(
                    text = "Javascript",
                    color = ColorTheme.white,
                    fontFamily = Fonts.workSansFontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 40.sp
                )
                Spacer(modifier = Modifier.height(30.dp))
                JavaScriptStarsRating()
                Spacer(modifier = Modifier.height(20.dp))
                Column(modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp)
                    .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "During my studies at Manuel S. Enverga University Foundation, " +
                                "I have gained a solid understanding of Java. My coursework and " +
                                "projects have covered object-oriented programming principles, " +
                                "data structures, and algorithms. I have applied Java to build various " +
                                "applications, demonstrating my ability to design and implement efficient, " +
                                "scalable solutions. My knowledge extends to using Java in backend " +
                                "development, contributing to my overall proficiency as a developer.",
                        color = ColorTheme.white,
                        fontFamily = Fonts.workSansFontFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}