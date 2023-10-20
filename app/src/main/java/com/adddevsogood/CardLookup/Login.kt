package com.adddevsogood.CardLookup

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.adddevsogood.CardLookup.ui.theme.CardLookupTheme


@Composable
fun LoginPage(modifier: Modifier = Modifier) {
    var userid by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    //var loginError by remember { mutableStateOf(true) }
    var loginError = false
    val context = LocalContext.current

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier) {
        Text(
            text = "Pokémon Card Look Up",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Justify,
            modifier = modifier
                .padding(top = 24.dp, bottom = 24.dp)
        )

        Column(modifier = modifier) {
            UserIDTextField(userid = userid, onUserIdChange = {userid = it})
        }

        Column(modifier = modifier) {
            PasswordTextField(password = password, onPasswordChange = {password = it})
        }

        Column(modifier = modifier){
            LoginButton(
                onClick = {
                    // Simulate a simple login validation

                    if (userid == "user" && password == "password") {
                        loginError = false
                        loginState = true
                        Toast.makeText(context, "Hello $userid!", Toast.LENGTH_SHORT).show()
                        // Navigate to the next screen or perform a successful login action.
                    } else {
                        loginError = true
                        loginState = false
                        Toast.makeText(context, "Invalid username or password", Toast.LENGTH_SHORT).show()
                    }
                },
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserIDTextField(modifier: Modifier = Modifier, userid: String, onUserIdChange: (String) -> Unit) {
    TextField(
        value = userid,
        onValueChange = onUserIdChange,
        visualTransformation = VisualTransformation.None,
        label = { Text("User ID:") },
        modifier = modifier
            .padding(top = 16.dp, bottom = 16.dp)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordTextField(modifier: Modifier = Modifier, password: String, onPasswordChange: (String) -> Unit) {
    TextField(
        value = password,
        onValueChange = onPasswordChange,
        label = { Text("Enter password") },
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        modifier = modifier
            .padding(top = 16.dp, bottom = 16.dp)
    )
}

@Composable
fun LoginButton(onClick: () -> Unit, modifier: Modifier = Modifier) {
    ExtendedFloatingActionButton(
        onClick = { onClick() },
        icon = { Icon(Icons.Filled.Lock, "Login to unlock more functions.") },
        text = { Text(text = "Login") },
        modifier = modifier
            .width(width = 200.dp)
    )
}

@Composable
fun HomeButton(onClick: () -> Unit, modifier: Modifier = Modifier) {
    ExtendedFloatingActionButton(
        onClick = { onClick() },
        icon = { Icon(Icons.Filled.Home, "Go back to main menu.") },
        text = { Text(text = "Home") },
        modifier = modifier
            .width(width = 200.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    CardLookupTheme {
        //LoginPage()
        //CardLookupApp()
    }
}