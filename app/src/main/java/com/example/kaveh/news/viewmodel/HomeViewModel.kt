package com.example.kaveh.news.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kaveh.news.data.model.NewsModel
import com.example.kaveh.news.data.remote.NetworkResult
import com.example.kaveh.news.data.repository.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val repository: HomeRepository) :ViewModel(){

    val news =MutableStateFlow<NetworkResult<List<NewsModel>>> (NetworkResult.Loading())


    suspend fun getAllDataFromServer(){
        viewModelScope.launch {
            launch { news.emit(repository.getNews()) }
        }
    }

}