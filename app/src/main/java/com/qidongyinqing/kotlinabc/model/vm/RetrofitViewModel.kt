package com.qidongyinqing.kotlinabc.model.vm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.qidongyinqing.kotlinabc.model.BannerBean
import com.qidongyinqing.kotlinabc.net.ApiService
import com.qidongyinqing.kotlinabc.net.BaseNetworkApi
import kotlinx.coroutines.launch

class RetrofitViewModel : ViewModel(){
    val name:String ="进行网络请求"

    val bannerData: MutableLiveData<BannerBean> by lazy {
        MutableLiveData<BannerBean>()
    }

    fun getBannerData(){
        viewModelScope.launch {
            val banner = BaseNetworkApi.INSTANCE.getApi(ApiService.SERVER_URL, ApiService::class.java).getBanner()
            bannerData.value  =banner
        }

    }
}