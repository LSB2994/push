package com.example.hiltanddanger.remote.datasource;

import com.example.hiltanddanger.data.user.Article;
import com.example.hiltanddanger.data.user.ArticleResponse;
import com.example.hiltanddanger.remote.ArticleService;
import retrofit2.Response;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ#\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/hiltanddanger/remote/datasource/DataSourceImp;", "Lcom/example/hiltanddanger/remote/datasource/DataSource;", "articleService", "Lcom/example/hiltanddanger/remote/ArticleService;", "(Lcom/example/hiltanddanger/remote/ArticleService;)V", "deleteArticle", "Lretrofit2/Response;", "Lcom/example/hiltanddanger/data/user/ArticleResponse;", "Lcom/example/hiltanddanger/data/user/Article;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getArticle", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class DataSourceImp implements com.example.hiltanddanger.remote.datasource.DataSource {
    @org.jetbrains.annotations.NotNull
    private final com.example.hiltanddanger.remote.ArticleService articleService = null;
    
    @javax.inject.Inject
    public DataSourceImp(@org.jetbrains.annotations.NotNull
    com.example.hiltanddanger.remote.ArticleService articleService) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getArticle(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.hiltanddanger.data.user.ArticleResponse<java.util.List<com.example.hiltanddanger.data.user.Article>>>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object deleteArticle(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.hiltanddanger.data.user.ArticleResponse<com.example.hiltanddanger.data.user.Article>>> $completion) {
        return null;
    }
}