package com.example.hiltanddanger.data.user

import com.google.gson.annotations.SerializedName

data class Article(
    @SerializedName("id")
    val id:Int?=null,
    val title:String?=null,
    val content:String?=null,
    val imageUrl:String?=null,
    val author:String?=null,
    val publishedDate:String?=null,
    val views:Int?=null,
    val isPublished:Boolean?=null
)
