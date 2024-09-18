package com.example.hiltanddanger.remote.repository

import com.example.hiltanddanger.data.user.Article
import com.example.hiltanddanger.data.user.ArticleResponse
import dagger.Provides
import retrofit2.Response

interface Repository {
    suspend fun getArticle():Response<ArticleResponse<List<Article>>>
    suspend fun deleteArticle(id:Int):Response<ArticleResponse<Article>>
}