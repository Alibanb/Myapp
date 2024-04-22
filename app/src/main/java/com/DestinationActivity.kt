package com

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.alijnr.R
import com.ui.theme.ALIJNRTheme

class DestinationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Destination()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Destination(){
    val mContext = LocalContext.current

    Column(modifier = Modifier.fillMaxSize()) {

        //START OF TOP APP BAR
        TopAppBar(title = { Text(text = "Destination") },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
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
        //END OF TOPAPP BAR

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(painter = painterResource(id = R.drawable.mal),
                contentDescription ="maldives",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop)
            Text(text = "Let's plan your next vacation",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 30.sp,
                color = Color.White,
                textAlign = TextAlign.Center
            )

        }
        //End of Box
        Spacer(modifier = Modifier.height(20.dp))

        var search by remember { mutableStateOf("")
        }
        OutlinedTextField(
            value = search,
            onValueChange = { search = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            placeholder = {Text(text = "What's your next destination?")},
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "Next destination")}


        )
        //End Of Searchbar
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Recently Visited",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.padding(start = 20.dp)

            )
        Row {
            Spacer(modifier = Modifier.height(5.dp))

            Card(
                modifier = Modifier
                    .height(250.dp)
                    .width(200.dp)

            ) {
                Column {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(180.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(painter = painterResource(id = R.drawable.maldi),
                            contentDescription = "Ibiza",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)

                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text ="Ibiza",
                        fontSize = 25.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold
                    )
                }

            }
            //END OF CARD 1
            Spacer(modifier = Modifier.width(10.dp))
            Card(
                modifier = Modifier
                    .height(250.dp)
                    .width(200.dp)

            ) {
                Column {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(180.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(painter = painterResource(id = R.drawable.maldi),
                            contentDescription = "Ibiza",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)

                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text ="Ibiza",
                        fontSize = 25.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold
                    )
                }

            }

            //END OF CARD 2


        }
        


    }
}

@Preview(showBackground = true)
@Composable
fun DestinationPreview(){
    Destination()

}