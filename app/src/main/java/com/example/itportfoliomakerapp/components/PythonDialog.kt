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
fun PythonDialog(
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
                    painter = painterResource(id = R.drawable.icons8_python_96),
                    contentDescription = null,
                    modifier = Modifier.size(80.dp)
                )
                Text(
                    text = "Python",
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
                        text = "As part of my IT curriculum at Manuel S. Enverga University Foundation, " +
                                "I have acquired a foundational knowledge of Python. My experience " +
                                "includes writing scripts for automation, data analysis, and basic " +
                                "web development. Python's simplicity and versatility have enabled me " +
                                "to quickly prototype ideas and solve problems effectively. While my focus " +
                                "remains on Kotlin and Java, my Python skills complement my overall programming " +
                                "toolkit, allowing me to approach projects with a versatile mindset.",
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