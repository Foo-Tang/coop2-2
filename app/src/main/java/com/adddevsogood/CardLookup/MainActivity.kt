package com.adddevsogood.CardLookup

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.adddevsogood.CardLookup.ui.theme.CardLookupTheme
import com.adddevsogood.CardLookup.LoginPage


var loginState = false

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter",
        "UnusedMaterialScaffoldPaddingParameter"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CardLookupTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    CardLookupApp()
                }
            }
/*            CardLookupTheme {
                Surface (color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()
                    Scaffold(
                        bottomBar = { BottomNavigationBar(navController = navController) }
                    ) {
                        NavigationSetup(navController = navController)
                    }
                }
            }*/
        }
    }
}

@Composable
fun CardLookupApp() {
    LoginPage()
}
/*
@Composable
fun LoginPage(modifier: Modifier = Modifier) {
    var userid by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var loginError by remember { mutableStateOf(true) }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier) {
        Text(
            text = "Pokémon Card Look Up",
            fontSize = 24.sp,
            fontWeight = Bold,
            textAlign = TextAlign.Justify,
            modifier = modifier
                .padding(top = 8.dp, bottom = 8.dp)
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
                        // Navigate to the next screen or perform a successful login action.
                    } else {
                        loginError = true
                        loginState = false
                    }
                },
                modifier = Modifier.padding(16.dp)
            )
        }

        if (loginError) {
            Column(modifier = modifier){}
                Text(
                    text = "Hello $userid $password Invalid username or password",
                    color = Color.Red,
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
        CardLookupApp()
    }
}*/
