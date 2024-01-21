package com.example.kaveh.news.data.remote

import com.example.kaveh.news.data.model.NewsModel
import com.example.kaveh.news.data.model.ResponseResult
import com.example.kaveh.news.util.Contents.API_KEY
import retrofit2.Response
import retrofit2.http.GET

interface HomeApiInterface {

    @GET("v2/top-headlines?sources=bbc-news")
    suspend fun getBbcNews():Response<ResponseResult<List<NewsModel>>>
}