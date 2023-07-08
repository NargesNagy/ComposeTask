package com.example.composetask.screens.details.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetask.R
import com.example.composetask.screens.details.DetailsScreen
import com.example.composetask.ui.theme.*
import com.google.accompanist.pager.ExperimentalPagerApi

@Composable
fun DetailsImage() {

    Box() {
        Image(
            painter = painterResource(id = R.drawable.image5), contentDescription = "image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(360.dp)
                .fillMaxWidth()
        )

        Column(
            //verticalArrangement = Arrangement.SpaceBetween,
        ) {

            Row(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {


                Button(
                    onClick = { },
                    Modifier
                        .clip(CircleShape)
                        .padding(8.dp),
                    shape = CircleShape,
                    border = null,
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Transparent,
                        contentColor = Color.White
                    )

                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.outline_cancel_24),
                        contentDescription = null,
                        modifier = Modifier
                            .size(24.dp)
                    )
                }


                Button(
                    onClick = { }, Modifier
                        .padding(4.dp),
                    shape = CircleShape,
                    border = null,
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Transparent,
                        contentColor = Color.White
                    )

                ) {
                    Row(
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

                        Text(text = "1h 33m", color = White_FF, fontSize = 14.sp)
                    }
                }
            }

            Spacer(modifier = Modifier.height(64.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = { },
                    Modifier
                        .clip(CircleShape)
                        .padding(8.dp),
                    shape = CircleShape,
                    border = null,
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Red,
                        contentColor = Color.White
                    )

                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_play_outline_24),
                        contentDescription = null,
                        modifier = Modifier
                            .size(24.dp)
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewDetailsImage() {
    DetailsImage()
}
