package com.example.composetask.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetask.screens.home.composable.movieDetails
import com.example.composetask.ui.theme.Black_87
import com.google.accompanist.pager.ExperimentalPagerApi

@Composable
fun MovieDescription(
    movieName: String,
    description: List<String>
) {
    Column( horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = movieName,
            color = Black_87,
            fontSize = 20.sp,
            modifier = Modifier.padding(horizontal = 64.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        customChips(description)
    }
}

@OptIn(ExperimentalPagerApi::class)
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewmovieDetails() {
    MovieDescription("hgjhgjgjhgjgjhgj", listOf("fantasy", "adven"))
}