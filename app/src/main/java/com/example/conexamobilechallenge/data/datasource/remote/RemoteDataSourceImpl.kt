package com.example.conexamobilechallenge.data.datasource.remote

import com.example.conexamobilechallenge.data.datasource.remote.api.NewsApiClient
import com.example.conexamobilechallenge.data.datasource.remote.api.UserApiClient
import com.example.conexamobilechallenge.data.datasource.remote.model.NewsNetworkModel
import com.example.conexamobilechallenge.data.datasource.remote.model.UserNetworkModel
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(
    private val newsApiClient: NewsApiClient,
    private val userApiClient: UserApiClient
) : RemoteDataSource {

    override suspend fun getNewsList(): List<NewsNetworkModel> {
        return newsApiClient.getNewsList()
    }

    override suspend fun getNewsById(id: Int): NewsNetworkModel {
        return newsApiClient.getNewsById(id)
    }

    override suspend fun getUserList(): List<UserNetworkModel> {
        return userApiClient.getUserList()
    }

}