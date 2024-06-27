package com.example.conexamobilechallenge.domain.usecase

import com.example.conexamobilechallenge.domain.model.News
import javax.inject.Inject

class FilterNewsListUseCase @Inject constructor(
    private val getNewsListUseCase: GetNewsListUseCase
) {

    operator fun invoke(search: String): List<News> {
        val newsList = getNewsListUseCase()
        return newsList.filter { it.title.lowercase().contains(search.lowercase().trim()) }
    }

}