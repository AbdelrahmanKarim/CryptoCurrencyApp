package com.example.cryptocurrencyapp.presentation

sealed class Screen(val route : String) {
    object CoinListScreen : Screen("coin_List_Screen")
    object CoinDetailScreen : Screen("coin_Detail_Screen")


}