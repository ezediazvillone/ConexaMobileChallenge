package com.example.conexamobilechallenge.data.datasource.remote.model

import com.google.gson.annotations.SerializedName

data class UserNetworkModel(
    @SerializedName("id") val id: Int,
    @SerializedName("firstname") val name: String,
    @SerializedName("lastname") val lastName: String,
    @SerializedName("address") val address: AddressNetworkModel
)

