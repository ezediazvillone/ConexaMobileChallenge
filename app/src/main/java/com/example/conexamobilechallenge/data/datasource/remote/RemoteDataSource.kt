package com.example.conexamobilechallenge.data.datasource.remote

import com.example.conexamobilechallenge.data.datasource.remote.model.NewsNetworkModel
import com.example.conexamobilechallenge.data.datasource.remote.model.UserNetworkModel

interface RemoteDataSource {

    suspend fun getNewsList(): List<NewsNetworkModel>

    suspend fun getNewsById(id: Int): NewsNetworkModel

    suspend fun getUserList(): List<UserNetworkModel>
    
}