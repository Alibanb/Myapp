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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.alijnr.R
import com.ui.theme.ALIJNRTheme

class ExploreActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Explore()


        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Explore(){
    Column(modifier = Modifier.fillMaxSize())
    {
        val mContext = LocalContext.current

        //Start of TopAppBar
        TopAppBar(title = { Text(text = "Cities") },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu,
                        contentDescription ="menu",
                        tint = Color.Black)

                }
            },

            actions = {

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Notifications,
                        contentDescription = "search",
                        tint = Color.Black
                    )

                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Share,
                        contentDescription = "share",
                        tint = Color.Black
                    )

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Search,
                        contentDescription = "search",
                        tint = Color.Black
                    )

                }
            })
        //End of TopAppBar

        Column(modifier = Modifier
            .verticalScroll(rememberScrollState()))
        {
            Text(
                text = "Tickets",
                fontSize = 40.sp,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier.padding(start = 20.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            //ROW1
            Row(modifier = Modifier
                .padding(start = 20.dp))
            {

                //Column1
                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)

                    ) {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(painter = painterResource(id = R.drawable.mal), contentDescription = "Maldives",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(imageVector =Icons.Default.FavoriteBorder ,
                                contentDescription ="favourite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(10.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Colosseum",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(3.dp))

                    Text(
                        text = "443 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(3.dp))
                    Text(
                        text = "from Ksh. 47,600",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(3.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent= Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0718550680".toUri()
                            mContext.startActivity(callIntent)

                        }) {
                            Text(text = "Call")
                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("jibually@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello Ali, this is the email body")
                            mContext.startActivity(shareIntent)

                        }
                        )
                        {
                            Text(text = "Email")
                        }

                    }
                }
                //END OF COLUMN

                //Column2
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)

                    ) {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(painter = painterResource(id = R.drawable.mal), contentDescription = "Maldives",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(imageVector =Icons.Default.FavoriteBorder ,
                                contentDescription ="favourite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(10.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Colosseum",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(3.dp))

                    Text(
                        text = "443 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(3.dp))
                    Text(
                        text = "from Ksh. 47,600",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(3.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent= Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0718550680".toUri()
                            mContext.startActivity(callIntent)

                        }) {
                            Text(text = "Call")
                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("jibually@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello Ali, this is the email body")
                            mContext.startActivity(shareIntent)

                        }
                        )
                        {
                            Text(text = "Email")
                        }

                    }
                }
                //END OF COLUMN
            }
            //END OF ROW1
            //ROW1
            Row(modifier = Modifier
                .padding(start = 20.dp))
            {

                //Column1
                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)

                    ) {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(painter = painterResource(id = R.drawable.mal), contentDescription = "Maldives",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(imageVector =Icons.Default.FavoriteBorder ,
                                contentDescription ="favourite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(10.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Colosseum",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(3.dp))

                    Text(
                        text = "443 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(3.dp))
                    Text(
                        text = "from Ksh. 47,600",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(3.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent= Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0718550680".toUri()
                            mContext.startActivity(callIntent)

                        }) {
                            Text(text = "Call")
                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("jibually@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello Ali, this is the email body")
                            mContext.startActivity(shareIntent)

                        }
                        )
                        {
                            Text(text = "Email")
                        }

                    }
                }
                //END OF COLUMN

                //Column2
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)

                    ) {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(painter = painterResource(id = R.drawable.mal), contentDescription = "Maldives",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(imageVector =Icons.Default.FavoriteBorder ,
                                contentDescription ="favourite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(10.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Colosseum",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(3.dp))

                    Text(
                        text = "443 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(3.dp))
                    Text(
                        text = "from Ksh. 47,600",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(3.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent= Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0718550680".toUri()
                            mContext.startActivity(callIntent)

                        }) {
                            Text(text = "Call")
                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("jibually@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello Ali, this is the email body")
                            mContext.startActivity(shareIntent)

                        }
                        )
                        {
                            Text(text = "Email")
                        }

                    }
                }
                //END OF COLUMN
            }
            //END OF ROW1




        }


    }

}

@Preview(showBackground = true)
@Composable
fun ExplorePreview(){
    Explore()
}