package com.example.conexamobilechallenge.domain.usecase

import com.example.conexamobilechallenge.domain.model.NewsDomainModel
import com.example.conexamobilechallenge.domain.repository.Repository
import javax.inject.Inject

class FilterNewsListUseCase @Inject constructor(
    private val repository: Repository
) {

    suspend operator fun invoke(search: String) =
        repository.getNewsList().filter { it.title.lowercase().contains(search.lowercase().trim()) }

}