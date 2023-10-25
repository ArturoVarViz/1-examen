package com.example.simondice

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyUI() {
    var round by remember { mutableStateOf(0) }
    var isStarted by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.padding(50.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Column(
                horizontalAlignment = Alignment.End
            ) {
                Text("Ronda")
                Text(round.toString(), fontSize = if (round >= 10) 24.sp else 14.sp)
            }
        }
        Spacer(modifier = Modifier.height(50.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = { /* Do something */ }, colors = ButtonDefaults.buttonColors(Color.Blue), modifier = Modifier.size(100.dp)) {

            }
            Button(onClick = { /* Do something */ }, colors = ButtonDefaults.buttonColors(Color.Green), modifier = Modifier.size(100.dp)) {

            }
        }
        Spacer(modifier = Modifier.height(50.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = { /* Do something */ }, colors = ButtonDefaults.buttonColors(Color.Red), modifier = Modifier.size(100.dp)) {

            }
            Button(onClick = { /* Do something */ }, colors = ButtonDefaults.buttonColors(Color.Yellow), modifier = Modifier.size(100.dp)) {

            }
        }
        Spacer(modifier = Modifier.height(50.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = {
                isStarted = !isStarted
                /* Do something */
            }, modifier = Modifier.size(100.dp)) {
                Text(if (isStarted) "Reset" else "Start")
            }
            Button(onClick = {
                round++
                /* Do something */
            }, modifier = Modifier.size(100.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.avion),
                    contentDescription = "Generar numeros",
                    modifier = Modifier
                        .size(50.dp) // Ajusta el tamaño de la imagen según tus necesidades
                        .padding(4.dp)
                )
            }
        }
    }
}
