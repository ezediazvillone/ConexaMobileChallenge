package com.example.conexamobilechallenge.presentation.fragment

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.conexamobilechallenge.databinding.FragmentUserBinding
import com.example.conexamobilechallenge.presentation.adapter.UserAdapter
import com.example.conexamobilechallenge.presentation.viewmodel.UserViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserFragment : Fragment() {

    private lateinit var binding: FragmentUserBinding
    private val navController by lazy { findNavController() }
    private val viewModel: UserViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentUserBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUserRecyclerView()
    }

    private fun initUserRecyclerView() {
        binding.fragmentUserRvUsers.layoutManager = LinearLayoutManager(requireContext())
        binding.fragmentUserRvUsers.adapter = UserAdapter(
            userList = /*viewModel.getUserList()*/ emptyList(),
            onUserClick = { user -> /*openMaps(user.addressUrl)*/ }
        )
    }

    private fun openMaps(addressUrl: String) {
        val uri: Uri = Uri.parse(addressUrl)
        val likeIng = Intent(Intent.ACTION_VIEW, uri)
        likeIng.setPackage("com.google.android.apps.maps")
        try {
            startActivity(likeIng)
        } catch (e: ActivityNotFoundException) {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(uri.toString())
                )
            )
        }
    }

}