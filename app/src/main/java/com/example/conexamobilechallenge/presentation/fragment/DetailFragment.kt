package com.example.conexamobilechallenge.presentation.fragment

import androidx.fragment.app.viewModels
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.conexamobilechallenge.databinding.FragmentDetailBinding
import com.example.conexamobilechallenge.domain.model.NewsDomainModel
import com.example.conexamobilechallenge.presentation.viewmodel.DetailViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding
    private val args: DetailFragmentArgs by navArgs()
    private val viewModel: DetailViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val id = args.id
        viewModel.getNewsById(id)
        lifecycleScope.launch { viewModel.news.collectLatest { initUi(it) } }
    }

    private fun initUi(news: NewsDomainModel?) {
        if (news == null) return
        Glide.with(requireContext()).load(news.image).into(binding.fragmentDetailIvNews)
        binding.fragmentDetailTvNewsTitle.text = news.title
        binding.fragmentDetailTvNewsDescription.text = news.content
    }
}