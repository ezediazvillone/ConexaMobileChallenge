package com.example.conexamobilechallenge.data.datasource.remote.mapper

import com.example.conexamobilechallenge.data.datasource.remote.model.GeoNetworkModel
import com.example.conexamobilechallenge.domain.model.GeoDomainModel
import javax.inject.Inject

class GeoMapper @Inject constructor() {

    fun toNetwork(geo: GeoDomainModel) = GeoNetworkModel(
        lat = geo.lat,
        lng = geo.lng
    )

    fun fromNetwork(geo: GeoNetworkModel) = GeoDomainModel(
        lat = geo.lat,
        lng = geo.lng
    )

}