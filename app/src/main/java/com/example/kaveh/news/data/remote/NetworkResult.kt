package com.example.kaveh.news.data.remote

sealed class NetworkResult<T>(
    val status: String? = null,
    val articles: T? = null
) {
    class Success<T>(status: String, articles: T) : NetworkResult<T>(status, articles)
    class Error<T>(status: String, articles: T? = null) : NetworkResult<T>(status, articles)
    class Loading<T> : NetworkResult<T>()
}