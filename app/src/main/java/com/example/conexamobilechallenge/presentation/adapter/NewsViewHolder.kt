package com.example.conexamobilechallenge.presentation.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.conexamobilechallenge.databinding.ItemNewsBinding
import com.example.conexamobilechallenge.domain.model.News

class NewsViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemNewsBinding.bind(view)

    fun render(
        news: News,
        onNewsClick: (News) -> Unit
    ) {
        setNewsTitle(news.title)
        setNewsImage(news.image)
        binding.itemNewsIv.setOnClickListener { onNewsClick(news) }
    }

    private fun setNewsImage(image: String) {
        Glide.with(binding.itemNewsIv.context).load(image).into(binding.itemNewsIv)
    }

    private fun setNewsTitle(title: String) {
        binding.itemNewsTvTitle.text = title
    }

}