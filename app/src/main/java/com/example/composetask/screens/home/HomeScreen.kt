package com.example.composetask.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetask.R
import com.example.composetask.screens.details.composable.Characters
import com.example.composetask.screens.home.composable.CustomButtons
import com.example.composetask.screens.home.composable.HomeBackGround
import com.example.composetask.screens.home.composable.movieDetails
import com.example.composetask.screens.home.composable.pager
import com.example.composetask.ui.theme.Transparent
import com.google.accompanist.pager.ExperimentalPagerApi

@OptIn(ExperimentalMaterialApi::class, ExperimentalPagerApi::class)
@Composable
fun HomeScreen() {
    val movies = listOf(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5,
    )

    HomeBackGround()
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(24.dp))
        CustomButtons()
        Spacer(modifier = Modifier.height(16.dp))
        pager(movies)
        Spacer(modifier = Modifier.height(24.dp))
        movieDetails("1h 33m", "hgjhgjgjhgjgjhgj", listOf("fantasy", "adven"))
    }

}


@OptIn(ExperimentalPagerApi::class)
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewFirstScreen() {
    HomeScreen()
}