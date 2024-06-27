package com.example.conexamobilechallenge.domain.usecase

import com.example.conexamobilechallenge.domain.model.News
import javax.inject.Inject

class GetNewsByIdUseCase @Inject constructor(
    private val getNewsListUseCase: GetNewsListUseCase
) {

    operator fun invoke(id: Int) : News {
        val newsList = getNewsListUseCase()
        return newsList.find { it.id == id }!!
    }

}