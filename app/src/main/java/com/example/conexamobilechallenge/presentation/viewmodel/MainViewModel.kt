package com.example.conexamobilechallenge.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.conexamobilechallenge.domain.model.NewsDomainModel
import com.example.conexamobilechallenge.domain.usecase.FilterNewsListUseCase
import com.example.conexamobilechallenge.domain.usecase.GetNewsListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getNewsListUseCase: GetNewsListUseCase,
    private val filterNewsListUseCase: FilterNewsListUseCase
) : ViewModel() {

    private val _newList = MutableStateFlow<List<NewsDomainModel>>(emptyList())
    val newList = _newList.asStateFlow()

    init {
        getNewsList()
    }

    private fun getNewsList() {
        viewModelScope.launch { _newList.value = getNewsListUseCase() }
    }

    fun filterNewsList(search: String) {
        viewModelScope.launch { _newList.value = filterNewsListUseCase(search) }
    }

}