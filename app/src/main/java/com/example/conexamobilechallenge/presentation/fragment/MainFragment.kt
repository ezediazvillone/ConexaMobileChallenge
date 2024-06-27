package com.example.conexamobilechallenge.presentation.fragment

import androidx.fragment.app.viewModels
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.conexamobilechallenge.databinding.FragmentMainBinding
import com.example.conexamobilechallenge.domain.model.News
import com.example.conexamobilechallenge.presentation.adapter.NewsAdapter
import com.example.conexamobilechallenge.presentation.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private val navController by lazy { findNavController() }
    private val viewModel: MainViewModel by viewModels()
    private lateinit var newsAdapter: NewsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
        initNewsRecyclerView()
    }

    private fun initNewsRecyclerView() {
        binding.mainFragmentRvNews.layoutManager = LinearLayoutManager(requireContext())
        newsAdapter = NewsAdapter(
            newsList = viewModel.getNewsList(),
            onNewsClick = { news -> navigateToDetailFragment(news) }
        )
        binding.mainFragmentRvNews.adapter = newsAdapter
    }

    private fun navigateToDetailFragment(news: News) {
        val action = MainFragmentDirections.actionMainFragmentToDetailFragment(news.id)
        navController.navigate(action)
    }

    private fun initListeners() {
        binding.fragmentMainIvUser.setOnClickListener { navigateToUserFragment() }
        binding.fragmentMainEtSearch.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                newsAdapter.updateNewsList(viewModel.filterNewsList(s.toString()))
            }

            override fun afterTextChanged(s: Editable?) {}
        })
    }

    private fun navigateToUserFragment() {
        val action = MainFragmentDirections.actionMainFragmentToUserFragment()
        navController.navigate(action)
    }

}