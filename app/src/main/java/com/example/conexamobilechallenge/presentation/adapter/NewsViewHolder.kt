package com.example.conexamobilechallenge.presentation.adapter

import android.content.Context
import android.util.DisplayMetrics
import android.view.View
import android.view.WindowManager
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
        setNewsHeight()
        binding.itemNewsIv.setOnClickListener { onNewsClick(news) }
    }

    private fun setNewsHeight() {
        val displayMetrics = DisplayMetrics()
        val windowManager = binding.itemNewsCv.context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        val height = displayMetrics.heightPixels

        val height30Percent = (height * 0.30).toInt()

        val params = binding.itemNewsCv.layoutParams
        params.height = height30Percent
        binding.itemNewsCv.layoutParams = params
    }

    private fun setNewsImage(image: String) {
        Glide.with(binding.itemNewsIv.context).load(image).into(binding.itemNewsIv)
    }

    private fun setNewsTitle(title: String) {
        binding.itemNewsTvTitle.text = title
    }

}