package com.example.hiltanddanger.remote

import com.example.hiltanddanger.data.user.Article
import com.example.hiltanddanger.data.user.ArticleResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface ArticleService {
    @GET("articles")
    suspend fun getArticles(): Response<ArticleResponse<List<Article>>>
    @GET("articles/{id}")
    suspend fun getArticleById(@Path("id") id: Int): Response<ArticleResponse<Article>>
    @POST("articles")
    suspend fun createArticle(@Body article: Article): Response<ArticleResponse<Article>>
    @PUT("articles/{id}")
    suspend fun updateArticle(@Path("id") id: Int, article: Article): Response<ArticleResponse<Article>>
    @DELETE("articles/{id}")
    suspend fun deleteArticle(@Path("id") id: Int): Response<ArticleResponse<Article>>



}