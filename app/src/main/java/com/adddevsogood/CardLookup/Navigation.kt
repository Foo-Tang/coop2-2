package com.adddevsogood.CardLookup


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.adddevsogood.CardLookup.LoginPage


@Composable
fun NavigationSetup(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomNavItem.LoginPage.route
    ) {
        composable(BottomNavItem.LoginPage.route) {
            LoginPage()
        }

        composable(BottomNavItem.ImageSearch.route) {
            ImageSearch()
        }

        composable(BottomNavItem.TextSearch.route) {
            TextSearch()
        }
    }
}

