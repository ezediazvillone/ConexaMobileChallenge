package com.example.conexamobilechallenge.data.datasource.remote.mapper

import com.example.conexamobilechallenge.data.datasource.remote.model.UserNetworkModel
import com.example.conexamobilechallenge.domain.model.UserDomainModel
import javax.inject.Inject

class UserMapper @Inject constructor(
    private val addressMapper: AddressMapper
) {

    fun toNetwork(user: UserDomainModel) = UserNetworkModel(
        id = user.id,
        name = user.name,
        lastName = user.lastName,
        address = addressMapper.toNetwork(user.address)
    )

    fun fromNetwork(user: UserNetworkModel) = UserDomainModel(
        id = user.id,
        name = user.name ?: "Usuario ${user.id}",
        lastName = user.lastName.orEmpty(),
        address = addressMapper.fromNetwork(user.address)
    )

}