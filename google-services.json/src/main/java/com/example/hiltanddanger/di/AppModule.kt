package com.example.hiltanddanger.di

import com.example.hiltanddanger.connst.Const
import com.example.hiltanddanger.remote.ArticleService
import com.example.hiltanddanger.remote.datasource.DataSource
import com.example.hiltanddanger.remote.datasource.DataSourceImp
import com.example.hiltanddanger.remote.repository.Repository
import com.example.hiltanddanger.remote.repository.RepositoryImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .retryOnConnectionFailure(true)
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .build()
    }
    @Singleton
    @Provides
    fun provideRetrofit(client: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(Const.BASE_URL)
            .client(client)
            .build()
    }
    @Singleton
    @Provides
    fun provideApiService(retrofit: Retrofit): ArticleService {
        return retrofit.create(ArticleService::class.java)
    }

    @Singleton
    @Provides
    fun provideDataSource(articleService: ArticleService):DataSource{
        return DataSourceImp(articleService)
    }
    @Singleton
    @Provides
    fun provideLoginRepo(dataSource: DataSource): Repository {
        return RepositoryImp(dataSource)
    }

}