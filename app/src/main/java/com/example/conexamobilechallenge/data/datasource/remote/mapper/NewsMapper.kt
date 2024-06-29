package com.example.conexamobilechallenge.data.datasource.remote.mapper

import com.example.conexamobilechallenge.data.datasource.remote.model.NewsNetworkModel
import com.example.conexamobilechallenge.domain.model.NewsDomainModel
import javax.inject.Inject

class NewsMapper @Inject constructor() {

    fun toNetwork(news: NewsDomainModel) = NewsNetworkModel(
        id = news.id,
        title = news.title,
        content = news.content,
        image = news.image,
        publishedAt = news.publishedAt,
        url = news.url,
        category = news.category
    )

    fun fromNetwork(newsNetworkModel: NewsNetworkModel) = NewsDomainModel(
        id = newsNetworkModel.id,
        title = newsNetworkModel.title,
        content = newsNetworkModel.content,
        image = newsNetworkModel.image,
        publishedAt = newsNetworkModel.publishedAt,
        url = newsNetworkModel.url,
        category = newsNetworkModel.category
    )

}