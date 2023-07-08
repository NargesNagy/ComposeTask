package com.example.composetask.composable

import com.example.composetask.R

sealed class BottomNavItem(var title:String, var icon:Int, var screen_route:String){

    object Home : BottomNavItem("Home", R.drawable.baseline_home_24,"home")
    object Search: BottomNavItem("My Network",R.drawable.search_24,"search")
    object Person: BottomNavItem("Post",R.drawable.ic_person_24,"person")
}