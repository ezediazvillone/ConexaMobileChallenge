package com.example.conexamobilechallenge.domain.usecase

import com.example.conexamobilechallenge.domain.model.NewsDomainModel
import javax.inject.Inject

class FilterNewsListUseCase @Inject constructor() {

    suspend operator fun invoke(search: String): List<NewsDomainModel> {
        return emptyList() //todo
    }

}