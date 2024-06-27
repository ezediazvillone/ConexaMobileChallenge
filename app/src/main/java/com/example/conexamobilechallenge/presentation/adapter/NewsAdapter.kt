package com.example.conexamobilechallenge.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.conexamobilechallenge.R
import com.example.conexamobilechallenge.domain.model.News

class NewsAdapter(
    private var newsList: List<News>,
    private val onNewsClick: (News) -> Unit
) : RecyclerView.Adapter<NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return NewsViewHolder(layoutInflater.inflate(R.layout.item_news, parent, false))
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val item = newsList[position]
        holder.render(item, onNewsClick)
    }

    override fun getItemCount() = newsList.size

    fun updateNewsList(newsList: List<News>){
        this.newsList = newsList
        notifyDataSetChanged()
    }

}