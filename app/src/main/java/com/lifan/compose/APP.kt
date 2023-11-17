package com.lifan.compose

import android.app.Application
import android.widget.Toast

/**
 * @author: LiFan
 * @date: 2023/11/17
 * @Description:
 */

open class APP : Application() {
    override fun onCreate() {
        super.onCreate()
        instance = this
    }


    companion object {
        @JvmStatic
        public lateinit var instance: APP
            private set

        fun showToast(s: String) {
            Toast.makeText(instance, s, Toast.LENGTH_SHORT).show()
        }
    }


}