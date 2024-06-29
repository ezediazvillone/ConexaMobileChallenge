package com.example.conexamobilechallenge.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.conexamobilechallenge.domain.model.UserDomainModel
import com.example.conexamobilechallenge.domain.usecase.GetUserListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    private val getUserListUseCase: GetUserListUseCase
) : ViewModel() {

    private val _userList = MutableStateFlow<List<UserDomainModel>>(emptyList())
    val userList = _userList.asStateFlow()

    init {
        getUserList()
    }

    private fun getUserList() {
        viewModelScope.launch {
            _userList.value = getUserListUseCase()
        }
    }
}
