package com.adddevsogood.CardLookup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.adddevsogood.CardLookup.ui.theme.CardLookupTheme

@Composable
fun ImageSearch(modifier: Modifier = Modifier) {
    Text(
        text = "Hello, welcome to ImageSearch screen.",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CardLookupTheme {
        ImageSearch()
    }
}