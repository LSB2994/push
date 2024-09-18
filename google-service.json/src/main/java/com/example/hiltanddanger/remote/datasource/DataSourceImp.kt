package com.example.hiltanddanger.remote.datasource

import com.example.hiltanddanger.data.user.Article
import com.example.hiltanddanger.data.user.ArticleResponse
import com.example.hiltanddanger.remote.ArticleService
import retrofit2.Response
import javax.inject.Inject

class DataSourceImp @Inject constructor(
    private val articleService: ArticleService
):DataSource {
    override suspend fun getArticle(): Response<ArticleResponse<List<Article>>> {
        return articleService.getArticles()
    }

    override suspend fun deleteArticle(id: Int): Response<ArticleResponse<Article>> {
        return articleService.deleteArticle(id)
    }

}