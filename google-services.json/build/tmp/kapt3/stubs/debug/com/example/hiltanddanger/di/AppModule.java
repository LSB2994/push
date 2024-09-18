package com.example.hiltanddanger.di;

import com.example.hiltanddanger.connst.Const;
import com.example.hiltanddanger.remote.ArticleService;
import com.example.hiltanddanger.remote.datasource.DataSource;
import com.example.hiltanddanger.remote.datasource.DataSourceImp;
import com.example.hiltanddanger.remote.repository.Repository;
import com.example.hiltanddanger.remote.repository.RepositoryImp;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import javax.inject.Singleton;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000eH\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/example/hiltanddanger/di/AppModule;", "", "()V", "provideApiService", "Lcom/example/hiltanddanger/remote/ArticleService;", "retrofit", "Lretrofit2/Retrofit;", "provideDataSource", "Lcom/example/hiltanddanger/remote/datasource/DataSource;", "articleService", "provideLoginRepo", "Lcom/example/hiltanddanger/remote/repository/Repository;", "dataSource", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "provideRetrofit", "client", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    
    public AppModule() {
        super();
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.hiltanddanger.remote.ArticleService provideApiService(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.hiltanddanger.remote.datasource.DataSource provideDataSource(@org.jetbrains.annotations.NotNull
    com.example.hiltanddanger.remote.ArticleService articleService) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.hiltanddanger.remote.repository.Repository provideLoginRepo(@org.jetbrains.annotations.NotNull
    com.example.hiltanddanger.remote.datasource.DataSource dataSource) {
        return null;
    }
}