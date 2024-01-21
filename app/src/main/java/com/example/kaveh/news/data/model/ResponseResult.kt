package com.example.kaveh.news.data.model

data class ResponseResult<T>(
    val status: String,
    val totalResults: Int,
    val articles: T,
)

