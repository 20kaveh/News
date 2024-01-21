package com.example.kaveh.news.data.model

data class NewsModel (
    val source :SourceNewsModel,
    val author : String,
    val title : String,
    val description : String,
    val url : String,
    val urlToImage : String,
    val publishedAt : String,
    val content : String,
)
