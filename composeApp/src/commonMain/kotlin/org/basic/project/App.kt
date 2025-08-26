package org.basic.project

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import kmpbasico.composeapp.generated.resources.Res
import kmpbasico.composeapp.generated.resources.compose_multiplatform

@Composable
fun App() {
    MaterialTheme {
      var name: String by remember { mutableStateOf("") }
      var apellido: String by remember { mutableStateOf("") }
      Column (
        modifier = Modifier
          .background(MaterialTheme.colorScheme.primaryContainer)
          .safeContentPadding()
          .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

      ) {
        TextField(
          value = name,
          onValueChange = {
            name = it
          }
        )

        Spacer(modifier = Modifier.height(40.dp))

        Spacer(modifier = Modifier.height(45.dp))

        AnimatedVisibility(name.isNotEmpty()) {
          Text(
            text = "Versión animada del nombre $name",
            fontSize = 24.sp
          )
        }

        TextField(
          value = apellido,
          onValueChange = {
            apellido = it
          }
        )

        Spacer(modifier = Modifier.height(40.dp))

        Spacer(modifier = Modifier.height(50.dp))

        AnimatedVisibility(apellido.isNotEmpty()) {
          Text(
            text = "Versión animada del apellido $apellido",
            fontSize = 24.sp
          )
        }

      }
    }
}
