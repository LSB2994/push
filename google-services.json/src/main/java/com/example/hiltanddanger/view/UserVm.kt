package com.example.hiltanddanger.view

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hiltanddanger.data.user.Article
import com.example.hiltanddanger.remote.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class UserVm @Inject constructor(
    private val repository: Repository
) : ViewModel() {
    private val _articles = MutableLiveData<List<Article>>()
    val articles : LiveData<List<Article>> get() = _articles

    fun getAllArticle(){
        viewModelScope.launch {
            val response = repository.getArticle()
            if (response.isSuccessful){
                _articles.postValue(response.body()?.payload?: emptyList())
                Log.d("success",response.body()?.payload.toString())
            }else{
                _articles.postValue(emptyList())
                Log.d("error",response.message())
            }
        }
    }

    fun deleteArticle(id:Int){
        viewModelScope.launch {
            val response = repository.deleteArticle(id)
            if (response.isSuccessful) {
                getAllArticle()
                Log.d("success", response.body()?.payload.toString())
            } else {
                Log.d("error", response.message())
            }
        }
    }
}
