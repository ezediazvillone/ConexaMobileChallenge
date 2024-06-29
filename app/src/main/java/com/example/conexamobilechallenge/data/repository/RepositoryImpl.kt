package com.example.conexamobilechallenge.data.repository

import com.example.conexamobilechallenge.data.datasource.remote.RemoteDataSource
import com.example.conexamobilechallenge.data.datasource.remote.mapper.NewsMapper
import com.example.conexamobilechallenge.data.datasource.remote.mapper.UserMapper
import com.example.conexamobilechallenge.domain.model.NewsDomainModel
import com.example.conexamobilechallenge.domain.model.UserDomainModel
import com.example.conexamobilechallenge.domain.repository.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
    private val newsMapper: NewsMapper,
    private val userMapper: UserMapper
) : Repository {

    override suspend fun getNewsList(): List<NewsDomainModel> {
        return remoteDataSource.getNewsList().map(newsMapper::fromNetwork)
    }

    override suspend fun getNewsById(id: Int): NewsDomainModel {
        return newsMapper.fromNetwork(remoteDataSource.getNewsById(id))
    }

    override suspend fun getUserList(): List<UserDomainModel> {
        return remoteDataSource.getUserList().map(userMapper::fromNetwork)
    }

}