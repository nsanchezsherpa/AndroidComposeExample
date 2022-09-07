package com.example.hellocompose

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.hellocompose.ui.theme.HelloComposeTheme

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
    Column {
        Image(
            painter = painterResource(
                id = R.drawable.example_image),
            contentDescription = null
        )
        Text("Curso de Jetpack Compose")
        Text(text = "Norman Sanchez")
        Button(onClick = {

        }) {
            Text(text = "Dale click")
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