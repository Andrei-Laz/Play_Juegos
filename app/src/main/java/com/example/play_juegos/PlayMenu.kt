package com.example.play_juegos

import android.graphics.drawable.shapes.RoundRectShape
import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PlayMenu(modifier: Modifier = Modifier) {

    var nombre by remember { mutableStateOf(" ")}
    var apellidos by remember { mutableStateOf(" ") }
    var telefono by remember { mutableStateOf(" ") }
    var email by remember { mutableStateOf(" ") }

    Column (
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.background(Color.LightGray)
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.account),
                contentDescription = "Person/Account Icon",
                modifier = Modifier.requiredSize(60.dp)
                    //.padding(20.dp)
            )

            OutlinedTextField(
                value = nombre,
                onValueChange = {nombre = it},
                label = { Text(text = "Nombre") },
                modifier = Modifier.padding(20.dp),
                shape = RoundedCornerShape(
                    topStart = 25.dp,
                    topEnd = 25.dp,
                    bottomStart = 0.dp,
                    bottomEnd = 0.dp)
            )
        }

        Row (
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.width(60.dp))

            OutlinedTextField(
                value = apellidos,
                onValueChange = {apellidos = it},
                label = { Text(text = "Apellidos")},
                modifier = Modifier.padding(40.dp),
                shape = RoundedCornerShape(
                    topStart = 25.dp,
                    topEnd = 25.dp,
                    bottomStart = 0.dp,
                    bottomEnd = 0.dp)
            )
        }

        Row (
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.width(60.dp))

            var apodo by remember { mutableStateOf(" ") }

            OutlinedTextField(
                value = apodo,
                onValueChange = {apodo = it},
                label = { Text(text = "Nickname") },
                modifier = Modifier.padding(40.dp),
                shape = RoundedCornerShape(
                    topStart = 25.dp,
                    topEnd = 25.dp,
                    bottomStart = 0.dp,
                    bottomEnd = 0.dp)
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.width(80.dp))

            Image(
                painter = painterResource(id = R.drawable.android),
                contentDescription = "Android Icon",
                modifier = Modifier.requiredSize(120.dp)
            )

            Button(
                onClick = {},
                content = {
                    Text(
                        text = "Change",
                        fontSize = 20.sp)},
                modifier = Modifier.width(150.dp).height(60.dp),
                shape = RoundedCornerShape(
                    topStart = 15.dp,
                    topEnd = 0.dp,
                    bottomStart = 15.dp,
                    bottomEnd = 0.dp)
            )
        }

        Row (
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.phone),
                contentDescription = "Camera Icon",
                modifier = Modifier.requiredSize(60.dp),
            )

            OutlinedTextField(
                value = telefono,
                onValueChange = {telefono = it},
                label = { Text(text = "Teléfono") },
                modifier = Modifier.padding(40.dp),
                shape = RoundedCornerShape(
                    topStart = 25.dp,
                    topEnd = 25.dp,
                    bottomStart = 0.dp,
                    bottomEnd = 0.dp)
            )
        }

        Row (
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.email),
                contentDescription = "Email Icon",
                modifier = Modifier.requiredSize(60.dp)
            )

            OutlinedTextField(
                value = email,
                onValueChange = {email = it},
                label = { Text(text = "Email") },
                modifier = Modifier.padding(40.dp),
                shape = RoundedCornerShape(
                    topStart = 25.dp,
                    topEnd = 25.dp,
                    bottomStart = 0.dp,
                    bottomEnd = 0.dp)
            )
        }

        Row (
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button (
                onClick = {},
                content = {
                    Text(text = "Add new player",
                        fontSize = 20.sp)
                },
                modifier = Modifier.width(200.dp).height(60.dp),
                shape = RoundedCornerShape(
                    topStart = 15.dp,
                    topEnd = 15.dp,
                    bottomStart = 15.dp,
                    bottomEnd = 15.dp
                )
            )
        }
    }
}