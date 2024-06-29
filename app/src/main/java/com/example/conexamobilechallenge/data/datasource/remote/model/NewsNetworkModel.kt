package com.example.conexamobilechallenge.data.datasource.remote.model

import com.google.gson.annotations.SerializedName

data class NewsNetworkModel(
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("content") val content: String,
    @SerializedName("image") val image: String,
    @SerializedName("publishedAt") val publishedAt: String,
    @SerializedName("url") val url: String,
    @SerializedName("category") val category: String
)
