package com

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.alijnr.R
import com.ui.theme.ALIJNRTheme

class WoofActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            woof()

        }
    }
}

@Composable
fun woof(){
    Column {

        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        )
        {
            Image(
                painter = painterResource(id = R.drawable.bulu),
                contentDescription = "woof",
                modifier = Modifier.size(50.dp)
            )
            Text(
                text = "Woof",
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 20.sp,
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center

            )}
          Spacer(modifier = Modifier.height(10.dp))
          //Card1

        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(70.dp)
            .fillMaxWidth()
        )
        {
            Row {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Image(painter = painterResource(id = R.drawable.dogy), contentDescription = "faye",
                        modifier = Modifier
                            .size(60.dp)
                            .clip(shape = CircleShape)
                            .padding(start = 1.dp, top = 4.dp),
                        contentScale = ContentScale.Crop)

                    Column {
                        Text(
                            text = "Koda",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(start = 100.dp, top = 4.dp))
                        Text(
                            text = "2 years old",
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(start = 100.dp))
                    }

                }
            }

        }
        //End of Card
        Spacer(modifier = Modifier.height(10.dp))
        //Card1

        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(70.dp)
            .fillMaxWidth()
        )
        {
            Row {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Image(painter = painterResource(id = R.drawable.dogy), contentDescription = "faye",
                        modifier = Modifier
                            .size(60.dp)
                            .clip(shape = CircleShape)
                            .padding(start = 1.dp, top = 4.dp),
                        contentScale = ContentScale.Crop)

                    Column {
                        Text(
                            text = "Koda",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(start = 100.dp, top = 4.dp))
                        Text(
                            text = "2 years old",
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(start = 100.dp))
                    }

                }
            }

        }
        //End of Card
        Spacer(modifier = Modifier.height(10.dp))
        //Card1

        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(70.dp)
            .fillMaxWidth()
        )
        {
            Row {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Image(painter = painterResource(id = R.drawable.dog2), contentDescription = "faye",
                        modifier = Modifier
                            .size(60.dp)
                            .clip(shape = CircleShape)
                            .padding(start = 1.dp, top = 4.dp),
                        contentScale = ContentScale.Crop)

                    Column {
                        Text(
                            text = "Lola",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(start = 100.dp, top = 4.dp))
                        Text(
                            text = "2 years old",
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(start = 100.dp))
                    }

                }
            }

        }
        //End of Card
        Spacer(modifier = Modifier.height(10.dp))
        //Card1

        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(70.dp)
            .fillMaxWidth()
        )
        {
            Row {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Image(painter = painterResource(id = R.drawable.dog3), contentDescription = "faye",
                        modifier = Modifier
                            .size(60.dp)
                            .clip(shape = CircleShape)
                            .padding(start = 1.dp, top = 4.dp),
                        contentScale = ContentScale.Crop)

                    Column {
                        Text(
                            text = "Nox",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(start = 100.dp, top = 4.dp))
                        Text(
                            text = "8 years old",
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(start = 100.dp))
                    }

                }
            }

        }
        //End of Card
        Spacer(modifier = Modifier.height(10.dp))
        //Card1

        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(70.dp)
            .fillMaxWidth()
        )
        {
            Row {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Image(painter = painterResource(id = R.drawable.doggy), contentDescription = "faye",
                        modifier = Modifier
                            .size(60.dp)
                            .clip(shape = CircleShape)
                            .padding(start = 1.dp, top = 4.dp),
                        contentScale = ContentScale.Crop)

                    Column {
                        Text(
                            text = "Faye",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(start = 100.dp, top = 4.dp))
                        Text(
                            text = "8 years old",
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(start = 100.dp))
                    }

                }
            }

        }
        //End of Card
        Spacer(modifier = Modifier.height(10.dp))
        //Card1

        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(70.dp)
            .fillMaxWidth()
        )
        {
            Row {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Image(painter = painterResource(id = R.drawable.cat), contentDescription = "faye",
                        modifier = Modifier
                            .size(60.dp)
                            .clip(shape = CircleShape)
                            .padding(start = 1.dp, top = 4.dp),
                        contentScale = ContentScale.Crop)

                    Column {
                        Text(
                            text = "Bella",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(start = 100.dp, top = 4.dp))
                        Text(
                            text = "14 years old",
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(start = 100.dp))
                    }

                }
            }

        }
        //End of Card
        Spacer(modifier = Modifier.height(10.dp))
        //Card1

        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(70.dp)
            .fillMaxWidth()
        )
        {
            Row {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Image(painter = painterResource(id = R.drawable.coco), contentDescription = "faye",
                        modifier = Modifier
                            .size(60.dp)
                            .clip(shape = CircleShape)
                            .padding(start = 1.dp, top = 4.dp),
                        contentScale = ContentScale.Crop)

                    Column {
                        Text(
                            text = "Moana",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(start = 100.dp, top = 4.dp))
                        Text(
                            text = "2 years old",
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(start = 100.dp))
                    }

                }
            }

        }
        //End of Card
        Spacer(modifier = Modifier.height(10.dp))
        //Card1

        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(70.dp)
            .fillMaxWidth()
        )
        {
            Row {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Image(painter = painterResource(id = R.drawable.carti), contentDescription = "faye",
                        modifier = Modifier
                            .size(60.dp)
                            .clip(shape = CircleShape)
                            .padding(start = 1.dp, top = 4.dp),
                        contentScale = ContentScale.Crop)

                    Column {
                        Text(
                            text = "Tzeitel",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(start = 100.dp, top = 4.dp))
                        Text(
                            text = "7 years old",
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(start = 100.dp))
                    }

                }
            }

        }
        //End of Card
    }


}

@Preview(showBackground = true)
@Composable
fun woofpreview(){
    woof()

}