package com.scaredeer.templatescaffoldless

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.dp
import com.scaredeer.templatescaffoldless.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    MainScreen(modifier = Modifier.safeDrawingPadding())
                }
            }
        }
    }
}

@PreviewScreenSizes
@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    AppTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            MainScreen(modifier = Modifier.safeDrawingPadding())
        }
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize().border(1.dp, Color.Red)) {
        Text(
            text = "◤",
            color = Color.Red,
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(8.dp)
        )
        Text(
            text = "◢",
            color = Color.Red,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(8.dp)
        )
    }
}