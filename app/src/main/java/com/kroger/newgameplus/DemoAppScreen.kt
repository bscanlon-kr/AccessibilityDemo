package com.kroger.newgameplus

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DemoAppScreen() {
    Box(Modifier.fillMaxSize()) {
        Text("Hello World", modifier = Modifier.align(Alignment.TopCenter))
    }
}

@Composable
@Preview(showBackground = true)
fun DemoAppScreenPreview() {
    DemoAppScreen()
}
