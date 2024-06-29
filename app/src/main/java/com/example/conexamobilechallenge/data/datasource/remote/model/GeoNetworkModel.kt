package com.example.conexamobilechallenge.data.datasource.remote.model

import com.google.gson.annotations.SerializedName

data class GeoNetworkModel(
    @SerializedName("lat") val lat: String,
    @SerializedName("lng") val lng: String
)
