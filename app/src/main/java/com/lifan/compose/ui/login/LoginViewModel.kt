package com.lifan.compose.ui.login

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel


/**
 * @author: LiFan
 * @date: 2023/11/17
 * @Description:
 */

class LoginViewModel(): ViewModel(){
    var count by mutableStateOf(0)
    var accountText by mutableStateOf("")
    var passwordText by mutableStateOf("")
    var loginEnable by mutableStateOf(false)

    fun setAccount(data:String){
        accountText = data
        loginEnable = accountText.isNotEmpty() && passwordText.isNotEmpty()
    }

    fun setPassword(data:String){
        passwordText = data
        loginEnable = accountText.isNotEmpty() && passwordText.isNotEmpty()
    }

}