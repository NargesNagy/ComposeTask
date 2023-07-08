package com.example.composetask.screens.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetask.R
import com.example.composetask.composable.CustomButtonWithIcon
import com.example.composetask.composable.MovieDescription
import com.example.composetask.screens.details.composable.Characters
import com.example.composetask.screens.details.composable.DetailsImage
import com.example.composetask.screens.details.composable.movieDescriptiontext
import com.example.composetask.screens.details.composable.movieEvaluation
import com.example.composetask.screens.home.HomeScreen
import com.example.composetask.ui.theme.Black_60
import com.example.composetask.ui.theme.Black_87
import com.example.composetask.ui.theme.White_FF
import com.google.accompanist.pager.ExperimentalPagerApi

@Composable
fun DetailsScreen() {

    val characters = listOf(
        R.drawable.person1,
        R.drawable.person2,
        R.drawable.person3,
        R.drawable.person4,
        R.drawable.person5,
        R.drawable.person6,
        R.drawable.person7,
        R.drawable.person8,
        R.drawable.person9,
    )
    Column() {

        /*
        Image(
            painter = painterResource(id = R.drawable.image5), contentDescription = "image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .weight(.4f)
                .height(360.dp)
                .fillMaxWidth()
        )
        */

        DetailsImage()

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .weight(.5f)
                .clip(shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp))
                .background(color = White_FF)
        ) {
            Spacer(modifier = Modifier.height(24.dp))
            movieEvaluation()
            Spacer(modifier = Modifier.height(16.dp))
            MovieDescription("hgjhgjgjhgjgjhgj", listOf("fantasy", "adven"))
            Spacer(modifier = Modifier.height(16.dp))
            Characters(characters)
            Spacer(modifier = Modifier.height(16.dp))
            movieDescriptiontext("fhgfhgfhgfhgfhgfghgfh")
            Spacer(modifier = Modifier.height(16.dp))
            CustomButtonWithIcon(R.drawable.baseline_home_24, "Bookimg")


        }
    }

}

@OptIn(ExperimentalPagerApi::class)
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewFirstScreen() {
    DetailsScreen()
}