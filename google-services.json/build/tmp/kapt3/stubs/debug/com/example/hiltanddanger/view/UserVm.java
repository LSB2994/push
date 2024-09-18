package com.example.hiltanddanger.view;

import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.hiltanddanger.data.user.Article;
import com.example.hiltanddanger.remote.repository.Repository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import retrofit2.Response;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u000eR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/hiltanddanger/view/UserVm;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/hiltanddanger/remote/repository/Repository;", "(Lcom/example/hiltanddanger/remote/repository/Repository;)V", "_articles", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/hiltanddanger/data/user/Article;", "articles", "Landroidx/lifecycle/LiveData;", "getArticles", "()Landroidx/lifecycle/LiveData;", "deleteArticle", "", "id", "", "getAllArticle", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class UserVm extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.hiltanddanger.remote.repository.Repository repository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.hiltanddanger.data.user.Article>> _articles = null;
    
    @javax.inject.Inject
    public UserVm(@org.jetbrains.annotations.NotNull
    com.example.hiltanddanger.remote.repository.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.hiltanddanger.data.user.Article>> getArticles() {
        return null;
    }
    
    public final void getAllArticle() {
    }
    
    public final void deleteArticle(int id) {
    }
}