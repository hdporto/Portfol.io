package com.example.itportfoliomakerapp.components

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class DialogModel: ViewModel() {
    var isKotlinShown by mutableStateOf(false)
    var isJavascriptShown by mutableStateOf(false)
    var isJavaShown by mutableStateOf(false)
    var isPythonShown by mutableStateOf(false)
    var isProgShown by mutableStateOf(false)
    var isMusicShown by mutableStateOf(false)
    var isGamesShown by mutableStateOf(false)

    private set

    fun onKotlinClick() {
        isKotlinShown = true
    }

    fun onJavascriptClick() {
        isJavascriptShown = true
    }

    fun onJavaClick() {
        isJavaShown = true
    }

    fun onPythonClick() {
        isPythonShown = true
    }

    fun onProgClick() {
        isProgShown = true
    }

    fun onMusicClick() {
        isMusicShown = true
    }

    fun onGamesClick() {
        isGamesShown = true
    }

    fun progDismiss() {
        isProgShown = false
    }

    fun musicDismiss() {
        isMusicShown = false
    }

    fun gamesDismiss() {
        isGamesShown = false
    }
    fun javascriptDismiss() {
        isJavascriptShown = false
    }

    fun javaDismiss() {
        isJavaShown = false
    }

    fun pythonDismiss() {
        isPythonShown = false
    }

    fun kotlinDismiss() {
        isKotlinShown = false
    }

}