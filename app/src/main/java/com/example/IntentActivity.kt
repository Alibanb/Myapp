package com.example

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.R
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.Layoutactivity
import com.example.alijnr.FormActivity
import com.example.alijnr.MainActivity
import com.example.ui.theme.ALIJNRTheme

class IntentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           MyIntent()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyIntent(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(painterResource(id = com.example.alijnr.R.drawable.backgroundbb), contentScale = ContentScale.FillBounds)) {
        val mContext = LocalContext.current
        //START OF TOP APP BAR
        TopAppBar(title = { Text(text = "Intents") },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Blue),
            navigationIcon = {
                IconButton(onClick = { mContext.startActivity(
                    Intent(mContext,
                        Layoutactivity::class.java)
                ) }) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription ="arrowback",
                        tint = Color.White)

                }
            },

            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Add,
                        contentDescription = "add",
                        tint = Color.White
                    )

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.LocationOn,
                        contentDescription = "location",
                        tint = Color.White
                    )

                }
            })
        //END OF TOPAPP BAR
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Blue)

        ) {
            Text(text = "MPESA",
                color = Color.Black)

        }
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedButton(
            onClick = { val smsIntent=Intent(Intent.ACTION_SENDTO)
                smsIntent.data="smsto:0718550680".toUri()
                smsIntent.putExtra("sms_body","Hello Ali,how was your day?")
                mContext.startActivity(smsIntent)

            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Blue)

        ) {
            Text(text = "EMAIL",
                color = Color.Black)

        }
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedButton(
            onClick = {  val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("jibually@gmail.com"))
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello Ali, this is the email body")
                mContext.startActivity(shareIntent)

            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Blue)

        ) {
            Text(text = "SMS",
                color = Color.Black)

        }
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedButton(
            onClick = {
                val callIntent=Intent(Intent.ACTION_DIAL)
                callIntent.data="tel:0718550680".toUri()
                mContext.startActivity(callIntent)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Blue)

        ) {
            Text(text = "CALL",
                color = Color.Black)

        }
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedButton(
            onClick = {
                val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                    mContext.startActivity(cameraIntent)
                }else{
                    println("Camera app is not available")
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Blue)

        ) {
            Text(text = "CAMERA",
                color = Color.Black)

        }

        Text(
            text = "Don't have an account? Register",
            fontSize = 12.sp,
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                           mContext.startActivity(Intent(mContext,FormActivity::class.java))
                },
            textAlign = TextAlign.Center,
            color = Color.White
        )


    }

}

@Preview(showBackground = true)
@Composable
fun MyIntentPreview(){
    MyIntent()
}