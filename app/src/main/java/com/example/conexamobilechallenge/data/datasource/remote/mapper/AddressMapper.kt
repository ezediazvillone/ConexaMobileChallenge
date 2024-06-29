package com.example.conexamobilechallenge.data.datasource.remote.mapper

import com.example.conexamobilechallenge.data.datasource.remote.model.AddressNetworkModel
import com.example.conexamobilechallenge.domain.model.AddressDomainModel
import javax.inject.Inject

class AddressMapper @Inject constructor(
    private val geoMapper: GeoMapper
) {

    fun toNetwork(address: AddressDomainModel) = AddressNetworkModel(
        street = address.street,
        suite = address.suite,
        city = address.city,
        geo = geoMapper.toNetwork(address.geo)
    )

    fun fromNetwork(address: AddressNetworkModel) = AddressDomainModel(
        street = address.street,
        suite = address.suite,
        city = address.city,
        geo = geoMapper.fromNetwork(address.geo)
    )

}