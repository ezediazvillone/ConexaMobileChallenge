package com.example.conexamobilechallenge.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.example.conexamobilechallenge.domain.usecase.GetNewsByIdUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
    private val getNewsByIdUseCase: GetNewsByIdUseCase
) : ViewModel() {

    fun getNewsById(id: Int) = getNewsByIdUseCase(id)

}