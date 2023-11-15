package com.lifan.compose.ui.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lifan.compose.R
import com.lifan.compose.ShowTextField

/**
 * @author: LiFan
 * @date: 2023/11/15
 * @Description:
 */

@Composable
fun LoginActivityCompose() {
    Column(
        modifier = Modifier
            .fillMaxWidth() // 充满父布局的宽度
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = Modifier.height(120.dp))
        UserAvatar(imageResId = R.mipmap.avatar)
        Box(modifier = Modifier.height(45.dp))
        InputUI("账号")
        Box(modifier = Modifier.height(20.dp))
        InputUI("密码")
        Box(modifier = Modifier.height(70.dp))
//        Button(onClick = { }) {
//
//        }
    }
}

@Composable
fun UserAvatar(imageResId: Int) {
    Card(
        modifier = Modifier
            .size(150.dp)
            .padding(8.dp),
//        backgroundColor = MaterialTheme.colors.primary, // 选择 Material 主题的颜色
        elevation = 4.dp // 阴影
    ) {
        Image(
            painter = painterResource(id = imageResId), // 使用指定资源作为头像图片
            contentDescription = null, // 描述图片内容，如果为空则不显示
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            contentScale = androidx.compose.ui.layout.ContentScale.Crop // 图片填充方式
        )
    }
}

@Composable
fun InputUI(hint:String) {
    //初始化文本变量
    var text by remember { mutableStateOf("") }
    var (text2,k) = remember { mutableStateOf("") }

    TextField(
        value = text, // 显示文本
        onValueChange = { text = it }, // 监听文本变化，并赋值给text
        label = { Text(text = hint) }, // 设置label
        colors = TextFieldDefaults.outlinedTextFieldColors(
            backgroundColor = Color.Transparent // 设置背景为透明
        )
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

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LoginActivityCompose()
}