package com.example.hiltanddanger.remote.repository

import com.example.hiltanddanger.data.user.Article
import com.example.hiltanddanger.data.user.ArticleResponse
import com.example.hiltanddanger.remote.datasource.DataSource
import retrofit2.Response
import javax.inject.Inject

class RepositoryImp @Inject constructor(
    private val dataSourceImp: DataSource
):Repository{
    override suspend fun getArticle(): Response<ArticleResponse<List<Article>>> {
        return dataSourceImp.getArticle()
    }

    override suspend fun deleteArticle(id: Int): Response<ArticleResponse<Article>> {
        return dataSourceImp.deleteArticle(id)
    }
}