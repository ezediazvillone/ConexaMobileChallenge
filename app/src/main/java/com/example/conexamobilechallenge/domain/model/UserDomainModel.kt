package com.example.conexamobilechallenge.domain.model

data class UserDomainModel(
    val id: Int,
    val name: String,
    val lastName: String,
    val address: AddressDomainModel
)
