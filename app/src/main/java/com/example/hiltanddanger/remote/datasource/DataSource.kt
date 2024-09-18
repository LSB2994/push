package com.example.hiltanddanger.remote.datasource

import com.example.hiltanddanger.data.user.Article
import com.example.hiltanddanger.data.user.ArticleResponse
import retrofit2.Response

interface DataSource {
    suspend fun getArticle():Response<ArticleResponse<List<Article>>>
    suspend fun deleteArticle(id: Int): Response<ArticleResponse<Article>>
}