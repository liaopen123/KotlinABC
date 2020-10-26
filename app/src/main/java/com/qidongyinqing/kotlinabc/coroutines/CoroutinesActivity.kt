package com.qidongyinqing.kotlinabc.coroutines

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.qidongyinqing.kotlinabc.R
import com.qidongyinqing.kotlinabc.toast
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

class CoroutinesActivity : AppCompatActivity() ,AnkoLogger{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutines_abc)
        realwork()

    }

    fun testBlock(){
        info { "协程开始" }
        runBlockingTest()
        info { "协程结束" }
    }

    open fun runBlockingTest()= runBlocking {
        repeat(8){
            info { "协程执行次数$it,所在线程${Thread.currentThread().name}" }
            delay(1000)
        }
    }

    //最常用 的启动协程的方式   返回job类型的对象，
    fun launchTest(){
        toast("233")
        info { "主线程开始,主线程" }
        val job = GlobalScope.launch {
            delay(6000)
            info { "协程结束   所在线程${Thread.currentThread().name}" }
        }
        info { "主线程结束,主线程" }
    }



    fun realwork(){
        info { "主线程继续跑111" }
        GlobalScope.launch {
            info { "主线程继续跑333" }
            val token  =  getToken()
            val userInfo = getUserInfo()
            info { "token:$token...userInfo$userInfo" }
            info { "主线程继续跑444" }
        }
        info { "主线程继续跑222" }
    }

    suspend fun getToken():String{
        delay(2000)
        return "lph"

    }
    suspend fun getUserInfo():String{
        delay(2000)
        return "userInfo---233"

    }

    inner  class CAViewModel:ViewModel(){


    }
}