package com.adddevsogood.CardLookup

sealed class Screen(val route: String){
    object LoginPage : Screen("login_page")
    object ImageSearch : Screen("image_search")
    object TextSearch : Screen("text_search")
}
