package com.example.conexamobilechallenge.data.datasource.remote.model

import com.google.gson.annotations.SerializedName

data class AddressNetworkModel(
    @SerializedName("street") val street: String,
    @SerializedName("suite") val suite: String,
    @SerializedName("city") val city: String,
    @SerializedName("geo") val geo: GeoNetworkModel
)