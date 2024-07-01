package com.example.conexamobilechallenge.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.conexamobilechallenge.domain.model.NewsDomainModel
import com.example.conexamobilechallenge.domain.usecase.GetNewsByIdUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
    private val getNewsByIdUseCase: GetNewsByIdUseCase
) : ViewModel() {

    private val _news = MutableStateFlow<NewsDomainModel?>(null)
    val news = _news.asStateFlow()

    fun getNewsById(id: Int) {
        viewModelScope.launch { _news.value = getNewsByIdUseCase(id) }
    }
}