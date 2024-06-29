package com.example.conexamobilechallenge.data.datasource.remote.api

import com.example.conexamobilechallenge.data.datasource.remote.model.NewsNetworkModel
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path

interface NewsApiClient {

    @GET("/posts")
    suspend fun getNewsList(): List<NewsNetworkModel>

    @GET("/posts/{id}")
    suspend fun getNewsById(@Path("id") id: Int): NewsNetworkModel

}