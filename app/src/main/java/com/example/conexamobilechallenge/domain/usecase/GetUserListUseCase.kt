package com.example.conexamobilechallenge.domain.usecase

import com.example.conexamobilechallenge.domain.repository.Repository
import javax.inject.Inject

class GetUserListUseCase @Inject constructor(
    private val repository: Repository
) {

    suspend operator fun invoke() = repository.getUserList()

}