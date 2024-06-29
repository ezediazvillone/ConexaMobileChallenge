package com.example.conexamobilechallenge.data.datasource.remote.api

import com.example.conexamobilechallenge.data.datasource.remote.model.UserNetworkModel
import retrofit2.http.GET
import retrofit2.http.Headers

interface UserApiClient {

    @GET("/users")
    suspend fun getUserList(): List<UserNetworkModel>

}