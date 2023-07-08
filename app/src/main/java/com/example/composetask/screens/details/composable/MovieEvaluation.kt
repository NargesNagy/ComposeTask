package com.example.composetask.screens.details.composable

import android.widget.Space
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetask.screens.details.DetailsScreen
import com.example.composetask.ui.theme.Black_37
import com.example.composetask.ui.theme.Black_87
import com.google.accompanist.pager.ExperimentalPagerApi

@Composable
fun movieEvaluation(){

    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 32.dp),
        horizontalArrangement = Arrangement.SpaceBetween) {
        
        Column( horizontalAlignment = Alignment.CenterHorizontally) {
            Row() {
                Text(
                    text = "6",
                    color = Black_87,
                    fontSize = 14.sp,
                )
                Text(
                    text = "/10",
                    color = Black_37,
                    fontSize = 14.sp,
                )
            }
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "IMDb",
                color = Black_37,
                fontSize = 14.sp,
            )

        }
        Column( horizontalAlignment = Alignment.CenterHorizontally) {
            Row() {
                Text(
                    text = "63%",
                    color = Black_87,
                    fontSize = 14.sp,
                )
            }
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "Rotten Tomatoes",
                color = Black_37,
                fontSize = 14.sp,
            )

        }
        Column( horizontalAlignment = Alignment.CenterHorizontally) {
            Row() {
                Text(
                    text = "4",
                    color = Black_87,
                    fontSize = 14.sp,
                )
                Text(
                    text = "/10",
                    color = Black_37,
                    fontSize = 14.sp,
                )
            }
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "IGN",
                color = Black_37,
                fontSize = 14.sp,
            )

        }


    }
    
}

@OptIn(ExperimentalPagerApi::class)
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewFirstScreen() {
    movieEvaluation()
}