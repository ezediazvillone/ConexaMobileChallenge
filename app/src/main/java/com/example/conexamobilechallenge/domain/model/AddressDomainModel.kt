package com.example.conexamobilechallenge.domain.model

data class AddressDomainModel(
    val street: String,
    val suite: String,
    val city: String,
    val geo: GeoDomainModel
)
