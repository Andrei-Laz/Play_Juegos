// MainMenu.kt
package com.example.play_juegos

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainMenu(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Play Juegos",
            fontSize = 40.sp
        )

        Spacer(modifier = Modifier.height(40.dp))

        Button(
            onClick = {},
            content = { Text("Play") },
            modifier = modifier.width(120.dp).height(50.dp)
        )
        Button(onClick = { /* Do something! */ })
            { Text("New Player") }
        Button(onClick = { /* Do something! */ })
            { Text("Preferences") }
        Button(onClick = { /* Do something! */ })
            { Text("About") }

    }
}
