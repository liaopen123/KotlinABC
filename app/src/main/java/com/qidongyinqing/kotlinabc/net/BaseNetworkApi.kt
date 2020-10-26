package com.qidongyinqing.kotlinabc.net

import com.google.gson.GsonBuilder
import com.qidongyinqing.kotlinabc.app.appContext
import me.jessyan.retrofiturlmanager.RetrofitUrlManager
import okhttp3.Cache
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.util.concurrent.TimeUnit

 class BaseNetworkApi {

     companion object{
         val INSTANCE :BaseNetworkApi by lazy (mode = LazyThreadSafetyMode.SYNCHRONIZED){
             BaseNetworkApi()
         }
     }
    fun <T>getApi(baseUrl:String,serviceClass:Class<T>): T {
        val builder = RetrofitUrlManager.getInstance().with(OkHttpClient.Builder())
        builder.apply {
            //设置缓存配置 缓存最大10M
            cache(Cache(File(appContext.cacheDir, "cxk_cache"), 10 * 1024 * 1024))
//            //添加Cookies自动持久化
//            cookieJar(cookieJar)
//            //示例：添加公共heads 注意要设置在日志拦截器之前，不然Log中会不显示head信息
//            addInterceptor(MyHeadInterceptor())
//            //添加缓存拦截器 可传入缓存天数，不传默认7天
//            addInterceptor(CacheInterceptor())
//            // 日志拦截器
//            addInterceptor(LogInterceptor())
            //超时时间 连接、读、写
            connectTimeout(10, TimeUnit.SECONDS)
            readTimeout(5, TimeUnit.SECONDS)
            writeTimeout(5, TimeUnit.SECONDS)

        }
                return Retrofit.Builder().baseUrl(baseUrl).client(builder.build()).addConverterFactory(GsonConverterFactory.create(GsonBuilder().create())).build().create(serviceClass)
    }
}