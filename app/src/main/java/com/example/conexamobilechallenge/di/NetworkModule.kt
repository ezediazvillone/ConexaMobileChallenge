package com.example.conexamobilechallenge.di

import com.example.conexamobilechallenge.data.datasource.remote.RemoteDataSource
import com.example.conexamobilechallenge.data.datasource.remote.RemoteDataSourceImpl
import com.example.conexamobilechallenge.data.datasource.remote.api.NewsApiClient
import com.example.conexamobilechallenge.data.datasource.remote.api.UserApiClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.org")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideUserApiClient(retrofit: Retrofit): UserApiClient {
        return retrofit.create(UserApiClient::class.java)
    }

    @Singleton
    @Provides
    fun provideNewsApiClient(retrofit: Retrofit): NewsApiClient {
        return retrofit.create(NewsApiClient::class.java)
    }

    @Provides
    @Singleton
    fun provideRemoteDataSource(
        newsApiClient: NewsApiClient,
        userApiClient: UserApiClient
    ): RemoteDataSource {
        return RemoteDataSourceImpl(newsApiClient, userApiClient)
    }

}