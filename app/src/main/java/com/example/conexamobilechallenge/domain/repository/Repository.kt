package com.example.conexamobilechallenge.domain.repository

import com.example.conexamobilechallenge.domain.model.NewsDomainModel
import com.example.conexamobilechallenge.domain.model.UserDomainModel

interface Repository {

    suspend fun getNewsList(): List<NewsDomainModel>

    suspend fun getNewsById(id: Int): NewsDomainModel

    suspend fun getUserList(): List<UserDomainModel>

}