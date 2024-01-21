package com.example.kaveh.news.data.repository

import com.example.kaveh.news.data.model.NewsModel
import com.example.kaveh.news.data.remote.HomeApiInterface
import com.example.kaveh.news.data.remote.NetworkResult
import com.example.kaveh.news.data.remote.BaseApiResponse
import javax.inject.Inject

class HomeRepository @Inject constructor (private val api: HomeApiInterface) :BaseApiResponse() {
    suspend fun getNews(): NetworkResult<List<NewsModel>> =
        safeApiCall {
            api.getBbcNews()
        }


}