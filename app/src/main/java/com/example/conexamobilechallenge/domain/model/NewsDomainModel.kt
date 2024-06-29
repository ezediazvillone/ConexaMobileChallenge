package com.example.conexamobilechallenge.domain.model

data class NewsDomainModel(
    val id: Int,
    val title: String,
    val content: String,
    val image: String,
    val publishedAt: String,
    val url: String,
    val category: String
)
