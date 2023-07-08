package com.example.composetask.composable

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.composetask.screens.details.DetailsScreen
import com.example.composetask.screens.home.HomeScreen
import com.example.composetask.screens.tickets.TicketsScreen

@Composable
fun bottomNavGraph(navController: NavHostController) {
    NavHost(navController, startDestination = BottomNavItem.Home.screen_route) {
        composable(BottomNavItem.Home.screen_route) {
            HomeScreen()
        }
        composable(BottomNavItem.Search.screen_route) {
            DetailsScreen()
        }
        composable(BottomNavItem.Person.screen_route) {
            TicketsScreen()
        }

    }
}