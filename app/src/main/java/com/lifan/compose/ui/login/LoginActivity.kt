package com.lifan.compose.ui.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.lifan.compose.R

/**
 * @author: LiFan
 * @date: 2023/11/15
 * @Description:
 */

class LoginActivity:ComponentActivity() {
    private val viewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginActivityCompose()
        }
    }
}

