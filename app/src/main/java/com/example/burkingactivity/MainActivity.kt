package com.example.burkingactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.burkingactivity.ui.theme.BurkingActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BurkingActivityTheme {
                MainScreen()
            }
        }
    }

    @Composable
    fun MainScreen() {
        Column {


            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    modifier = Modifier.size(80.dp),
                    painter = painterResource(id = R.drawable.burgerking),
                    contentDescription = "burger"
                )
                Spacer(modifier = Modifier.size(16.dp))
                Column {
                    Text(text = "와퍼")
                    Spacer(modifier = Modifier.size(8.dp))
                    Text(text = "7,700")
                }
                Spacer(modifier = Modifier.size(80.dp))
                Image(
                    modifier = Modifier.size(16.dp),
                    painter = painterResource(id = R.drawable.baseline_add_24),
                    contentDescription = "arrow",
                )
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    modifier = Modifier.size(80.dp),
                    painter = painterResource(id = R.drawable.burgerking),
                    contentDescription = "burger"
                )
                Spacer(modifier = Modifier.size(16.dp))
                Column {
                    Text(text = "와퍼")
                    Spacer(modifier = Modifier.size(8.dp))
                    Text(text = "7,700")
                }
                Spacer(modifier = Modifier.size(80.dp))
                Image(
                    modifier = Modifier.size(16.dp),
                    painter = painterResource(id = R.drawable.baseline_add_24),
                    contentDescription = "arrow",
                )
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    modifier = Modifier.size(80.dp),
                    painter = painterResource(id = R.drawable.burgerking),
                    contentDescription = "burger"
                )
                Spacer(modifier = Modifier.size(16.dp))
                Column {
                    Text(text = "와퍼")
                    Spacer(modifier = Modifier.size(8.dp))
                    Text(text = "7,700")
                }
                Spacer(modifier = Modifier.size(80.dp))
                Image(
                    modifier = Modifier.size(16.dp),
                    painter = painterResource(id = R.drawable.baseline_add_24),
                    contentDescription = "arrow",
                )
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    modifier = Modifier.size(80.dp),
                    painter = painterResource(id = R.drawable.burgerking),
                    contentDescription = "burger"
                )
                Spacer(modifier = Modifier.size(16.dp))
                Column {
                    Text(text = "와퍼")
                    Spacer(modifier = Modifier.size(8.dp))
                    Text(text = "7,700")
                }
                Spacer(modifier = Modifier.size(80.dp))
                Image(
                    modifier = Modifier.size(16.dp),
                    painter = painterResource(id = R.drawable.baseline_add_24),
                    contentDescription = "arrow",
                )
            }
        }
    }


    @Preview(showBackground = true)
    @Composable
    fun MainScreenPreview() {
        BurkingActivityTheme {
            MainScreen()

        }
    }
}