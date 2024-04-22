package com

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.ui.theme.ALIJNRTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.IntentActivity
import com.example.alijnr.MainActivity
import com.example.alijnr.R
import com.ui.FirstScreenActivity

class Layoutactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout(){

    Column(modifier = Modifier.fillMaxSize()) {
        val mcontext = LocalContext.current

        //Start of TopAppBar
        TopAppBar(title = { Text(text = "Home") },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Blue),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu,
                        contentDescription ="menu",
                        tint = Color.White)

                }
            },

            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Share,
                        contentDescription = "share",
                        tint = Color.White
                    )

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings,
                        contentDescription = "settings",
                        tint = Color.White
                    )

                }
            })
        //End of TopAppBar

        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "BREEDS OF DOGS",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(5.dp))
        //First Row
    Row {
        Image(painter = painterResource(id = R.drawable.dog2),
            contentDescription = "dog",
            modifier = Modifier.size(width = 200.dp, height = 200.dp))
        
        Spacer(modifier = Modifier.width(20.dp))

        Column {
            Text(
                text = "BULL DOG",
                fontSize = 18.sp)
            Text(text = "Bull dog is an amazing dog.")
        }
    }
        //End of First Row


        Spacer(modifier = Modifier.height(15.dp))
        //Second Row
        Row {
            Image(painter = painterResource(id = R.drawable.dog3),
                contentDescription = "dog",
                modifier = Modifier.size(width = 200.dp, height = 150.dp))

            Spacer(modifier = Modifier.width(20.dp))

            Column {
                Text(
                    text = "GERMAN SHEPHERD",
                    fontSize = 18.sp)
                Text(text = "German shepherd is an amazing dog.")


            }
            //END OF SECOND ROW


        }

        Row {
            Button( shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Blue),
                onClick = {
                    mcontext.startActivity(Intent(mcontext,MainActivity::class.java))
                }) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "arrowback", tint = Color.White)
                Text(text = "Back")

            }
            Spacer(modifier =Modifier.width(40.dp))

            Button( shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Blue),
                onClick = {
                    mcontext.startActivity(Intent(mcontext,IntentActivity::class.java))
                }) {
                Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "Arrowforward", tint = Color.White)
                Text(text = "Next")

            }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
    Layout()
}