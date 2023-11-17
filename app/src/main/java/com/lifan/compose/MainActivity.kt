package com.lifan.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import com.lifan.compose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShowTextField()
//            JetpackComposeTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
//                ) {
//                    Greeting("Android")
//                }
//            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
//    JetpackComposeTheme {
//        Greeting("Android")
//    }
    ShowTextField()
}

@Composable
fun ShowTextField() {
    //初始化文本变量
    var text by remember { mutableStateOf("") }
    var (text2,k) = remember { mutableStateOf("") }

    TextField(
        value = text, // 显示文本
        onValueChange = { text = it }, // 监听文本变化，并赋值给text
        label = { Text(text = "Input") }, // 设置label
//        leadingIcon = @Composable {// 设置左边图标
//            Image(
//                imageVector = Icons.Filled.Search,
//                contentDescription = "search", //image的无障碍描述
//                modifier = Modifier.clickable {// 通过modifier来设置点击事件
//                    Toast.makeText(
//                        context,
//                        "search $text",
//                        Toast.LENGTH_SHORT
//                    ).show()
//                })
//        },
//        trailingIcon = @Composable {//设置右边图标
//            Image(imageVector = Icons.Filled.Clear,
//                contentDescription = "clear",
//                modifier = Modifier.clickable { text = "" }) // 添加点击清空事件
//        },
//        placeholder = @Composable { Text(text = "This is placeholder") },//hint提示语
    )
}