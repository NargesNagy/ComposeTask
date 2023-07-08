package com.example.composetask.screens.home.composable

import androidx.compose.foundation.layout.*
import com.example.composetask.R
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetask.composable.MovieDescription
import com.example.composetask.composable.customChips
import com.example.composetask.ui.theme.Black_87
import com.google.accompanist.pager.ExperimentalPagerApi

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun movieDetails(
    hours: String,
    movieName: String,
    description: List<String>
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.time_24),
                contentDescription = null,
                modifier = Modifier
                    .size(16.dp)
                    .padding(top = 4.dp),
                tint = LocalContentColor.current.copy(alpha = LocalContentAlpha.current)
            )

            Spacer(modifier = Modifier.width(2.dp))

            Text(text = hours, color = Color.Gray, fontSize = 14.sp)
        }

        MovieDescription(movieName, description)


    }

}


@OptIn(ExperimentalPagerApi::class)
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewmovieDetails() {
    movieDetails("1h 33m", "hgjhgjgjhgjgjhgj", listOf("fantasy", "adven"))
}