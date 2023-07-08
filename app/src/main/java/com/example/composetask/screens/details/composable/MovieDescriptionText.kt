package com.example.composetask.screens.details.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetask.ui.theme.Black_60

@Composable
fun movieDescriptiontext(text: String){
    Text(
        text = text,
        color = Black_60,
        fontSize = 14.sp,
        modifier = Modifier.padding(horizontal = 32.dp),
        maxLines = 3,
    )
}