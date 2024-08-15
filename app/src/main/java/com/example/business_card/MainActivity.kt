package com.example.business_card

import android.graphics.Color.rgb
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.business_card.ui.theme.Business_CardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Business_CardTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Business_Card(
                        name = "Jennifer Doe",
                        designation = "Android Developer Extraordinaire",
                        phone = "+11 (123) 444 555 666",
                        username = "@androidDev",
                        mail = "jen.doe@android.com"
                    )
                }
            }
        }
    }
}

@Composable
fun AndroidLogo(modifier: Modifier = Modifier) {
    val logo = painterResource(id = R.drawable.android_logo)
    Image(
        painter = logo,
        contentDescription = "Android Logo",
        modifier = Modifier
            .size(100.dp)
            .background(Color(rgb(7, 48, 66)))
    )
}

@Composable
fun Business_Card(name: String, designation: String, phone: String, username: String, mail: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(Color(rgb(210, 232, 212))),
        content = {
            Column( // First Column
                modifier = Modifier,
                content = {
                    Text(text = "")
                }
            )
            Column( // Second Column
                modifier = Modifier,
                content = {
                    Row( // Second Column: 1 row
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally),
                        content = {
                            AndroidLogo()
                        }
                    )
                    Row(
                        content = {
                            Text(
                                text = name,
                                fontSize = 60.sp
                            )
                        }
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally),
                        content = {
                            Text(
                                text = designation,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.W800,
                                color = Color(rgb(0, 109, 59))
                            )
                        }
                    )
                }
            )
            Column( // Third Column
                modifier = Modifier,
                content = {
                    Row( // Third Column: 1 row
                        content = {
                            Icon(
                                imageVector = Icons.Filled.Phone,
                                contentDescription = "Phone",
                                modifier = Modifier.size(20.dp),
                                tint = Color(rgb(0, 109, 59))
                            )
                            Text(text = "   ") // For creating space between icon & text
                            Text(
                                text = phone
                            )
                        }
                    )
                    Row(content = { Text(text = " ")}) // Third Column: 2 row
                    Row( // Third Column: 3 row
                        content = {
                            Icon(
                                imageVector = Icons.Filled.Share,
                                contentDescription = "Share",
                                modifier = Modifier.size(20.dp),
                                tint = Color(rgb(0, 109, 59))
                            )
                            Text(text = "   ") // For creating space between icon & text
                            Text(
                                text = username
                            )
                        }
                    )
                    Row(content = { Text(text = " ")}) // Third Column: 4 row
                    Row( // Third Column: 5 row
                        content = {
                            Icon(
                                imageVector = Icons.Filled.Email,
                                contentDescription = "Email",
                                modifier = Modifier.size(20.dp),
                                tint = Color(rgb(0, 109, 59))
                            )
                            Text(text = "   ") // For creating space between icon & text
                            Text(
                                text = mail
                            )
                        }
                    )
                }
            )
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DesignPreview() {
    Business_CardTheme {
        Business_Card(
            name = "Jennifer Doe",
            designation = "Android Developer",
            phone = "+11 (123) 444 555 666",
            username = "@android_dev_jennifer",
            mail = "jennifer.doe@gmail.com"
        )
    }
}