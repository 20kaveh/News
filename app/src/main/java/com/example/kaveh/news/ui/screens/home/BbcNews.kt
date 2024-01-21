package com.example.kaveh.news.ui.screens.home

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.kaveh.news.data.model.NewsModel
import com.example.kaveh.news.data.remote.NetworkResult
import com.example.kaveh.news.viewmodel.HomeViewModel

@Composable
fun BbcNews(viewModel: HomeViewModel= hiltViewModel()){

    var list by remember {
        mutableStateOf<List<NewsModel>>(emptyList())
    }

    var loading by remember {
        mutableStateOf(false)
    }

    val newsResult by viewModel.news.collectAsState()
    when (newsResult) {
        is NetworkResult.Success -> {
            list = newsResult.articles ?: emptyList()
            loading = false
        }
        is NetworkResult.Error -> {
            loading = false
            Log.e("2020", "get bbc news error : ${newsResult.status}")
        }
        is NetworkResult.Loading -> {
            loading = true
        }
    }


    if (loading) {
        Log.e("2020","get bbc news is loading")
    } else {
        Log.e("2020",newsResult.toString())




    }
}