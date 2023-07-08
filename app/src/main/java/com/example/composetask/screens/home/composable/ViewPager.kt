@file:JvmName("ViewPagerKt")

package com.example.composetask.screens.home.composable

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import com.google.accompanist.pager.*
import kotlin.math.absoluteValue


@OptIn(ExperimentalFoundationApi::class, ExperimentalPagerApi::class)
@Composable
fun pager(movies: List<Int>) {

    val pagerState = rememberPagerState(initialPage = 2)
    HorizontalPager(
        count = movies.size,
        state = pagerState
    ) { page ->
        Card(
            shape = RoundedCornerShape(24.dp),
            modifier = Modifier
                .graphicsLayer {

                    val pageOffset = (
                            (pagerState.currentPage - page) + pagerState.currentPageOffset
                            // .currentPageOffsetFraction
                            ).absoluteValue


                    // We animate the alpha, between 50% and 100%
                    alpha = lerp(
                        start = 0.85f,
                        stop = 1f,
                        fraction = 1f - pageOffset.coerceIn(0f, 1f)
                    )

                    scaleY = lerp(
                        start = 0.85f,
                        stop = 1f,
                        fraction = 1f - pageOffset.coerceIn(0f, 1f)
                    )

                    scaleX = lerp(
                        start = 0.85f,
                        stop = 1f,
                        fraction = 1f - pageOffset.coerceIn(0f, 1f)
                    )


                }

        ) {
            Image(
                painter = painterResource(id = movies[page]),
                contentDescription = "profile picture",
                modifier = Modifier.clip(RoundedCornerShape(16.dp))
                    .height(360.dp)

            )

        }
    }
}


@OptIn(ExperimentalPagerApi::class)
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewPager() {
    pager(listOf())
}

