package com.example.composetask.screens.home.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.composetask.R
import com.example.composetask.ui.theme.Transparent

@Composable
fun HomeBackGround(){

    Image(
        painter = painterResource(id = R.drawable.image1), contentDescription = "image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .height(360.dp)
            .fillMaxWidth()
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Brush.verticalGradient(
                    colorStops = arrayOf(
                        Pair(0.4f, Transparent),
                        Pair(1f, Color.White)
                    )
                )
            )
    ) {

    }

}