package com.example.conexamobilechallenge.domain.usecase

import com.example.conexamobilechallenge.domain.model.NewsDomainModel
import com.example.conexamobilechallenge.domain.repository.Repository
import javax.inject.Inject

class GetNewsByIdUseCase @Inject constructor(
    private val repository: Repository
) {

    suspend operator fun invoke(id: Int): NewsDomainModel {
        return repository.getNewsById(id)
    }

}