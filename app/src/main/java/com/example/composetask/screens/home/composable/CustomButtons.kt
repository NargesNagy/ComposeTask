package com.example.composetask.screens.home.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetask.ui.theme.Red
import com.example.composetask.ui.theme.White_FF
import com.google.accompanist.pager.ExperimentalPagerApi
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun CustomButtons() {
    Row(
        horizontalArrangement = Arrangement.Center
    ) {
        Box() {
            Button(onClick = { /**/ }, Modifier
                .padding(horizontal = 4.dp, vertical = 2.dp),
                shape = RoundedCornerShape(32.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Red, contentColor = Color.White)

            ) {
                Text(text = "Now Showing")

            }
        }

        Spacer(modifier = Modifier.width(8.dp))

        Box() {
            OutlinedButton(onClick = { /**/ }, Modifier
                .padding(horizontal = 4.dp, vertical = 2.dp),
                shape = RoundedCornerShape(32.dp),
                border = BorderStroke(.5.dp, White_FF),
                colors =  ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Transparent, contentColor = White_FF) ,


                ) {
                Text(text = "Coming Soon")

            }
        }
    }
}


@OptIn(ExperimentalPagerApi::class)
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewFirstScreen() {
    CustomButtons()
}