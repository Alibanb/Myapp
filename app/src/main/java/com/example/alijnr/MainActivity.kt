package com.example.alijnr

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.DestinationActivity
import com.Layoutactivity
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.alijnr.ui.theme.ALIJNRTheme
import com.ui.FirstScreenActivity
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text()
        }
    }
}

@Composable
fun Text(){
    Column(modifier = Modifier.fillMaxSize()) {

        val mcontext = LocalContext.current
        Text(
            text = "Welcome to Android",
            fontSize = 30.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic
        )
        Text(text = "It entails creatig mobile applications for android devices")
        Text(
            text = "Types of Cars",
            fontSize = 28.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
                .height(40.dp),
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            color = Color.White)

        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "1. Ferrrari")
        Text(
            text = "2. Maybach")
        Text(
            text = "3. Audi")

        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) { Button(onClick = {
                mcontext.startActivity(Intent(mcontext,DestinationActivity::class.java))
            },
            colors = ButtonDefaults.buttonColors(Color.Black))
            {
                androidx.compose.material3.Text(text = "Destination")

        }
            
        }
        //Lottie Animation
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.contact))
        val progress by animateLottieCompositionAsState(composition)
        LottieAnimation(composition, progress,
            modifier = Modifier.size(300.dp)
        )
        Button(onClick = {
            mcontext.startActivity(Intent(mcontext,FirstScreenActivity::class.java))
        },
            colors = ButtonDefaults.buttonColors(Color.Black))
        {
            androidx.compose.material3.Text(text = "Contact")

        }


        
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Food",
            fontSize = 25.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray),
            textDecoration = TextDecoration.Underline,
            textAlign = TextAlign.Center)
        Text(text = "1. Biryani")
        Text(text = "2. Chicken Mandhi ")
        Text(text = "3. Pasta ")
        Spacer(modifier = Modifier.height(20.dp))
        Divider()
        //Centering an Image
        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Image(painter = painterResource(id = R.drawable.eagle ),
                contentDescription = "eagle",
                modifier = Modifier
                    .size(200.dp)
                    .clip(shape = CircleShape))
        }
        Spacer(modifier = Modifier.height(20.dp))


        Button(onClick = {
                         mcontext.startActivity(Intent(mcontext,Layoutactivity::class.java))
        },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp, top = 20.dp, bottom = 20.dp)
        ) {
            androidx.compose.material3.Text(text = "Continue")
            
        }



    }
}

@Preview(showBackground = true)
@Composable
fun TextPreview(){
    Text()
}