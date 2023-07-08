package com.example.composetask.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.Chip
import androidx.compose.material.ChipDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.composetask.ui.theme.Black_60
import com.example.composetask.ui.theme.Black_8
import com.example.composetask.ui.theme.Black_87

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun customChips(description: List<String>){
    Row( modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center) {
        repeat(description.size) { position ->
            Spacer(modifier = Modifier.width(4.dp))
            Chip(
                onClick = { },
                colors = ChipDefaults.chipColors(
                    backgroundColor = Color.White,
                    contentColor = Black_60
                ),
                border = BorderStroke(
                    1.dp,
                    Black_8
                ),
            ) {
                Text(text = description[position], color = Black_60)
            }

        }
    }
}