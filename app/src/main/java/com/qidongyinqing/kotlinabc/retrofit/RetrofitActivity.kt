package com.qidongyinqing.kotlinabc.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.qidongyinqing.kotlinabc.R
import com.qidongyinqing.kotlinabc.app.appContext
import com.qidongyinqing.kotlinabc.model.BannerBean
import com.qidongyinqing.kotlinabc.model.vm.RetrofitViewModel
import com.qidongyinqing.kotlinabc.net.ApiService
import com.qidongyinqing.kotlinabc.net.BaseNetworkApi
import kotlinx.android.synthetic.main.activity_retrofit.*

/**
 * retrofit 和协程
 */
class RetrofitActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit)
        var model = ViewModelProvider(
                this,
                ViewModelProvider.AndroidViewModelFactory.getInstance(application)
        ).get(RetrofitViewModel::class.java)
        val observerBanner = Observer<BannerBean> { t -> tv_content.text = t.toString() }
        btn_request.setOnClickListener {
            model.getBannerData()
        }
        model.bannerData.observe(this, observerBanner)

    }
}





