package com.example.conexamobilechallenge.presentation.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.conexamobilechallenge.databinding.ItemUserBinding
import com.example.conexamobilechallenge.domain.model.AddressDomainModel
import com.example.conexamobilechallenge.domain.model.UserDomainModel

class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemUserBinding.bind(view)

    fun render(
        user: UserDomainModel,
        onUserClick: (UserDomainModel) -> Unit
    ) {
        setUserName(user.name, user.lastName)
        setUserAddress(user.address)
        binding.itemUserCl.setOnClickListener { onUserClick(user) }
    }

    private fun setUserAddress(address: AddressDomainModel) {
        binding.itemUserTvAddress.text = "${address.street} (${address.suite}), ${address.city}."
    }

    private fun setUserName(name: String, lastName: String) {
        binding.itemUserTvNameAndLastName.text = "$name $lastName"
    }


}



