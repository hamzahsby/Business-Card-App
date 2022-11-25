package com.example.kartunama

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kartunama.ui.theme.KartuNamaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KartuNamaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun BusinessCardScreen() {
    Column(
        modifier = Modifier
            .background(color = Color(0xFF002d3f)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(Modifier.weight(1f)) {
            IdentityBlock()
        }
        Row(Modifier.weight(1f)) {
            ContactDetailBlock()
        }
    }
}

@Composable
private fun IdentityBlock() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        val image = painterResource(R.drawable.android_logo)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.size(width = 100.dp , height = 100.dp)
        )
        Text(
            text = "Jennifer Doe",
            color = Color.White,
            fontSize = 45.sp,
            modifier = Modifier.padding(bottom = 10.dp)
        )
        Text(
            text = "Android Developer Extraordinaire",
            color = Color(0xFF3ddc84),
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
private fun ContactDetailBlock() {
    Row {
        Column(modifier = Modifier
            .fillMaxHeight(1f)
            .weight(1f)
            .padding(start = 55.dp, bottom = 45.dp),
            verticalArrangement = Arrangement.Bottom
        ) {

            val phoneIkon = painterResource(R.drawable.baseline_phone_black_20)
            Image(
                painter = phoneIkon,
                contentDescription = null,
                colorFilter = ColorFilter.tint(Color(0xFF3ddc84)),
                modifier = Modifier
                    .size(width = 20.dp, height = 20.dp)
            )
            val shareIkon = painterResource(R.drawable.baseline_share_black_20)
            Image(
                painter = shareIkon,
                contentDescription = null,
                colorFilter = ColorFilter.tint(Color(0xFF3ddc84)),
                modifier = Modifier.size(width = 20.dp, height = 20.dp)
            )
            val emailIkon = painterResource(R.drawable.baseline_email_black_20)
            Image(
                painter = emailIkon,
                contentDescription = null,
                colorFilter = ColorFilter.tint(Color(0xFF3ddc84)),
                modifier = Modifier.size(width = 20.dp, height = 20.dp)
            )
        }

        Column(modifier = Modifier
            .fillMaxHeight(1f)
            .weight(3f)
            .padding(bottom = 45.dp),
            verticalArrangement = Arrangement.Bottom) {
            Text(text = "+11(123) 444 555 666", color = Color.White)
            Text(text = "@AndroidDev", color = Color.White)
            Text(text = "jen.doe@android.com", color = Color.White)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    KartuNamaTheme {
        BusinessCardScreen()
    }
}