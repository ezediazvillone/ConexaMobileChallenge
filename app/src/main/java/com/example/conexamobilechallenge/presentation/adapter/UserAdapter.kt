package com.example.conexamobilechallenge.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.conexamobilechallenge.R
import com.example.conexamobilechallenge.domain.model.NewsDomainModel
import com.example.conexamobilechallenge.domain.model.UserDomainModel

class UserAdapter(
    private var userList: List<UserDomainModel>,
    private val onUserClick: (UserDomainModel) -> Unit
) : RecyclerView.Adapter<UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return UserViewHolder(layoutInflater.inflate(R.layout.item_user, parent, false))
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val item = userList[position]
        holder.render(item, onUserClick)
    }

    override fun getItemCount() = userList.size

    fun updateUserList(userList: List<UserDomainModel>) {
        this.userList = userList
        notifyDataSetChanged()
    }
}