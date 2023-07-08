package com.example.composetask.composable

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetask.R
import com.example.composetask.screens.details.composable.Characters
import com.example.composetask.ui.theme.Red
import com.example.composetask.ui.theme.White_FF
import com.google.accompanist.pager.ExperimentalPagerApi

@Composable
fun CustomButtonWithIcon(icon: Int, text: String) {
Row() {
    

    Button(
        onClick = { }, Modifier
            .padding(horizontal = 16.dp, vertical = 16.dp),
        shape = RoundedCornerShape(32.dp),
        border = null,
        colors = ButtonDefaults.buttonColors(backgroundColor = Red, contentColor = Color.White)

    ) {
        Row() {
            Icon(
                painter = painterResource(id = icon),
                contentDescription = null,
                modifier = Modifier
                    .size(24.dp)
                    .padding(top = 4.dp),
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = text, color = White_FF, fontSize = 16.sp)
        }
    }
}
}

@OptIn(ExperimentalPagerApi::class)
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewCustomButtonWithIcon() {
    CustomButtonWithIcon(R.drawable.baseline_home_24, "Bookimg")
}