package com.example.conexamobilechallenge.data.datasource.remote.model

import com.google.gson.annotations.SerializedName

data class UserNetworkModel(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String?,
    @SerializedName("lastName") val lastName: String?,
    @SerializedName("address") val address: AddressNetworkModel
)

