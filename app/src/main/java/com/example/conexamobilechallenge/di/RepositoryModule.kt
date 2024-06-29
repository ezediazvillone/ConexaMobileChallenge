package com.example.conexamobilechallenge.di

import com.example.conexamobilechallenge.data.datasource.remote.RemoteDataSource
import com.example.conexamobilechallenge.data.datasource.remote.mapper.NewsMapper
import com.example.conexamobilechallenge.data.datasource.remote.mapper.UserMapper
import com.example.conexamobilechallenge.data.repository.RepositoryImpl
import com.example.conexamobilechallenge.domain.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideRepository(
        remoteDataSource: RemoteDataSource,
        newsMapper: NewsMapper,
        userMapper: UserMapper
    ): Repository {
        return RepositoryImpl(remoteDataSource, newsMapper, userMapper)
    }

}