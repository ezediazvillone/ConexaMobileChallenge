package com.example.conexamobilechallenge.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.example.conexamobilechallenge.domain.usecase.FilterNewsListUseCase
import com.example.conexamobilechallenge.domain.usecase.GetNewsListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getNewsListUseCase: GetNewsListUseCase,
    private val filterNewsListUseCase: FilterNewsListUseCase
) : ViewModel() {

    fun getNewsList() = getNewsListUseCase()
    fun filterNewsList(search: String) = filterNewsListUseCase(search)

}