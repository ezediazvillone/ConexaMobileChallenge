package com.example.conexamobilechallenge.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.conexamobilechallenge.domain.usecase.FilterNewsListUseCase
import com.example.conexamobilechallenge.domain.usecase.GetNewsByIdUseCase
import com.example.conexamobilechallenge.domain.usecase.GetNewsListUseCase
import com.example.conexamobilechallenge.domain.usecase.GetUserListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getNewsListUseCase: GetNewsListUseCase,
    private val filterNewsListUseCase: FilterNewsListUseCase,
    private val getNewsByIdUseCase: GetNewsByIdUseCase, //todo remove
    private val getUserListUseCase: GetUserListUseCase
) : ViewModel() {

    fun getNewsList() {
        viewModelScope.launch {
            val newsList = getNewsListUseCase()
            Log.d("MainViewModel", "getNewsList: $newsList")
            Log.d("MainViewModel", "newsList.size: ${newsList.size}")
            val news1 = getNewsByIdUseCase(1)
            Log.d("MainViewModel", "news1: $news1")
            val news2 = getNewsByIdUseCase(2)
            Log.d("MainViewModel", "news2: $news2")
            val news3 = getNewsByIdUseCase(3)
            Log.d("MainViewModel", "news3: $news3")
            val userList = getUserListUseCase()
            Log.d("MainViewModel", "getUserList: $userList")
            Log.d("MainViewModel", "userList.size: ${userList.size}")
        }
    }
    //fun filterNewsList(search: String) = filterNewsListUseCase(search)

}