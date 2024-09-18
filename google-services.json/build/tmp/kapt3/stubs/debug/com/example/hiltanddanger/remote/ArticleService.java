package com.example.hiltanddanger.remote;

import com.example.hiltanddanger.data.user.Article;
import com.example.hiltanddanger.data.user.ArticleResponse;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\'\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\'\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ#\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000e0\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ/\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/hiltanddanger/remote/ArticleService;", "", "createArticle", "Lretrofit2/Response;", "Lcom/example/hiltanddanger/data/user/ArticleResponse;", "Lcom/example/hiltanddanger/data/user/Article;", "article", "(Lcom/example/hiltanddanger/data/user/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteArticle", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getArticleById", "getArticles", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateArticle", "(ILcom/example/hiltanddanger/data/user/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ArticleService {
    
    @retrofit2.http.GET(value = "articles")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getArticles(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.hiltanddanger.data.user.ArticleResponse<java.util.List<com.example.hiltanddanger.data.user.Article>>>> $completion);
    
    @retrofit2.http.GET(value = "articles/{id}")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getArticleById(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.hiltanddanger.data.user.ArticleResponse<com.example.hiltanddanger.data.user.Article>>> $completion);
    
    @retrofit2.http.POST(value = "articles")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object createArticle(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.example.hiltanddanger.data.user.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.hiltanddanger.data.user.ArticleResponse<com.example.hiltanddanger.data.user.Article>>> $completion);
    
    @retrofit2.http.PUT(value = "articles/{id}")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateArticle(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull
    com.example.hiltanddanger.data.user.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.hiltanddanger.data.user.ArticleResponse<com.example.hiltanddanger.data.user.Article>>> $completion);
    
    @retrofit2.http.DELETE(value = "articles/{id}")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteArticle(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.hiltanddanger.data.user.ArticleResponse<com.example.hiltanddanger.data.user.Article>>> $completion);
}