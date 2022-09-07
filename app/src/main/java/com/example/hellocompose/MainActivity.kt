package com.example.hellocompose

import android.content.res.Configuration
import android.os.Bundle
import android.print.PrintAttributes
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.hellocompose.ui.theme.HelloComposeTheme
import java.nio.file.Files.size

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloCompose()
        }
    }
}

@Composable
fun HelloCompose() {
    Card (
        elevation = 4.dp,
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier.padding(4.dp)
    ) {
        Column (
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(
                    id = R.drawable.example_image),
                contentDescription = null,
                modifier = Modifier.size(width = 150.dp, height = 40.dp)
            )
            Text(
                text = "Curso de Jetpack Compose",
                style = MaterialTheme.typography.h4
            )
            Text(text = "Norman Sanchez")
            Button(onClick = {

            },
                modifier = Modifier.padding(vertical = 16.dp)) {
                Text(text = "Dale click")
            }
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
fun HelloComposePreview(){
    HelloCompose()
}