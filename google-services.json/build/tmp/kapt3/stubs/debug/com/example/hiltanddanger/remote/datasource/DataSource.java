package com.example.hiltanddanger.remote.datasource;

import com.example.hiltanddanger.data.user.Article;
import com.example.hiltanddanger.data.user.ArticleResponse;
import retrofit2.Response;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ#\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/hiltanddanger/remote/datasource/DataSource;", "", "deleteArticle", "Lretrofit2/Response;", "Lcom/example/hiltanddanger/data/user/ArticleResponse;", "Lcom/example/hiltanddanger/data/user/Article;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getArticle", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface DataSource {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getArticle(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.hiltanddanger.data.user.ArticleResponse<java.util.List<com.example.hiltanddanger.data.user.Article>>>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteArticle(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.hiltanddanger.data.user.ArticleResponse<com.example.hiltanddanger.data.user.Article>>> $completion);
}