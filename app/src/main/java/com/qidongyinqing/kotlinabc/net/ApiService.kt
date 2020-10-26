package com.qidongyinqing.kotlinabc.net

import com.qidongyinqing.kotlinabc.model.BannerBean
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET

interface ApiService {
    companion object{
        const val SERVER_URL="https://www.wanandroid.com/"

    }


    @GET("banner/json")
    suspend fun getBanner():BannerBean
}