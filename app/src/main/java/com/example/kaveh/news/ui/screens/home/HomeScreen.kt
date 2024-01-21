package com.example.kaveh.news.ui.screens.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.kaveh.news.viewmodel.HomeViewModel

@Composable
fun HomeScreen(navController: NavHostController){
Home(navController = navController)

}

@Composable
fun Home(navController: NavHostController,
         viewModel: HomeViewModel= hiltViewModel()){
    LaunchedEffect(key1 = true){

        viewModel.getAllDataFromServer()
    }


    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .padding(bottom = 60.dp)) {
        item { BbcNews() }
    }

}