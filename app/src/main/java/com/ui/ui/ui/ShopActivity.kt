package com.ui.ui.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.alijnr.R
import com.ui.theme.Wed
import com.ui.ui.ui.ui.theme.ALIJNRTheme

class ShopActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Shop()

        }
    }
}

@Composable
fun Shop(){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {
        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Image(painter = painterResource(id = R.drawable.bort ),
                contentDescription = "eagle",
                modifier = Modifier
                    .size(250.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.FillBounds
            )
            Spacer(modifier = Modifier.height(20.dp))



        }
        Text(
            text = "Pay by Cart",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = Color.Black)
        Text(
            text = "Shop online now.",
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = FontFamily.Monospace,
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = Color.Black)

        Text(
            text = "...",
            fontSize = 108.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = FontFamily.Serif,
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = Wed
        )






    }


}

@Preview(showBackground = true)
@Composable
fun ShopPreview(){
    Shop()
}