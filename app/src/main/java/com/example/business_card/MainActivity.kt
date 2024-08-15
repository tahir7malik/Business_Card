package com.example.business_card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
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
                ) {}
            }
        }
    }
}

@Composable
fun Business_Card(firstname: String, middlename: String, lastname: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = firstname,
            modifier = Modifier.background(Color.Cyan)
        )
        Text(
            text = middlename,
            modifier = Modifier.background(Color.Yellow)
        )
        Text(
            text = lastname,
            modifier = Modifier.background(Color.Green)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Business_CardPreview() {
    Business_CardTheme {
        Business_Card(firstname = "Tahir", middlename = "Ahmed", lastname = "Malik")
    }
}