package com.lifan.compose.ui.login

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.lifan.compose.R

/**
 * @author: LiFan
 * @date: 2023/11/15
 * @Description:
 */

class LoginActivity:ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        R.mipmap.ic_launcher
        setContent {
            LoginActivityCompose()
        }
    }
}

