package com.example.conexamobilechallenge.presentation.fragment

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.fragment.app.viewModels
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.conexamobilechallenge.databinding.FragmentUserBinding
import com.example.conexamobilechallenge.domain.model.UserDomainModel
import com.example.conexamobilechallenge.presentation.adapter.UserAdapter
import com.example.conexamobilechallenge.presentation.viewmodel.UserViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class UserFragment : Fragment() {

    private lateinit var binding: FragmentUserBinding
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
        lifecycleScope.launch { viewModel.userList.collectLatest { initUserRecyclerView(it) } }
    }

    private fun initUserRecyclerView(userList: List<UserDomainModel>) {
        binding.fragmentUserRvUsers.layoutManager = LinearLayoutManager(requireContext())
        binding.fragmentUserRvUsers.adapter = UserAdapter(
            userList = userList,
            onUserClick = { user -> openMaps(user.address.geo.lat, user.address.geo.lng) }
        )
    }

    private fun openMaps(lat: String, lng: String) {
        val uri = Uri.parse("https://www.google.com/maps/search/?api=1&query=$lat,$lng")
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