package com.example.conexamobilechallenge.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.example.conexamobilechallenge.domain.usecase.GetUserListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    private val getUserListUseCase: GetUserListUseCase
) : ViewModel() {

    //fun getUserList() = getUserListUseCase()

}