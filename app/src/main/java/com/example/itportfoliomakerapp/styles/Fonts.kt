package com.example.itportfoliomakerapp.styles

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.itportfoliomakerapp.R

object Fonts {
    val workSansFontFamily: FontFamily = FontFamily(
        Font(R.font.worksans_black, FontWeight.Black),
        Font(R.font.worksans_bold, FontWeight.Bold),
        Font(R.font.worksans_regular, FontWeight.Normal),
        Font(R.font.worksans_semibold, FontWeight.SemiBold)
    )
}