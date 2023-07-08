package com.example.composetask.screens.details.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetask.R
import com.example.composetask.screens.home.composable.movieDetails
import com.google.accompanist.pager.ExperimentalPagerApi

@Composable
fun Characters(characters: List<Int>){
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 32.dp)
    ){
        items (characters.size){position ->
            Image(
                painter = painterResource(id = characters[position]),
                contentDescription = "charachter picture",
                contentScale = ContentScale.Crop,
                modifier = Modifier.clip(CircleShape)
                    .size(65.dp)
            )
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewmovieDetails() {
    Characters(
        listOf(R.drawable.person1,
        R.drawable.person2,
        R.drawable.person3,))
}