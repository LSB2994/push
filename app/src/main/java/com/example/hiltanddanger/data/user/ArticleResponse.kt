package com.example.hiltanddanger.data.user

import com.google.gson.annotations.SerializedName

data class ArticleResponse<T>(
    @SerializedName("message")
    var message:String?=null,
    @SerializedName("payload")
    var payload:T?=null,
    @SerializedName("status")
    var statue:String?=null,
    @SerializedName("timestamp")
    var timestamp:String?=null
)
