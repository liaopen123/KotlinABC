package com.qidongyinqing.kotlinabc.coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.qidongyinqing.kotlinabc.R
import kotlinx.android.synthetic.main.activity_coroutines1.*
import kotlinx.coroutines.*

class Coroutines1Activity : AppCompatActivity() {
    val TAG = "Coroutines1Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutines1)

//        GlobalScope.launch {
//            delay(1000)
//            Log.e(TAG,"hello world")
//        }
//        Log.e(TAG,"start${Thread.currentThread().name}")
//        GlobalScope.launch(Dispatchers.IO) {
//            delay(1000)
//            Log.e(TAG,"指定为主线程运行:${Thread.currentThread().name}")
//        }
//        Log.e(TAG,"end${Thread.currentThread().name}")

//        doSuspend()
//        串联请求()
        test()
    }

    fun doSuspend() {
        GlobalScope.launch(Dispatchers.Main) {
            Log.e(TAG, "start${Thread.currentThread().name}")
            test1()
            testIO()
            Log.e(TAG, "end${Thread.currentThread().name}")
        }
    }

    suspend fun test1() {
        Log.e(TAG, "test${Thread.currentThread().name}")
    }

    suspend fun testIO() {
        withContext(Dispatchers.IO) {
            Log.e(TAG, "testInIO${Thread.currentThread().name}")
        }
    }


    fun 串联请求() {
        GlobalScope.launch {
            var one = async { request("one") }
            var two = async { request("two") }
            updataIU(one.await(), two.await())
        }
    }

    private fun updataIU(one: String, two: String) {
        tv.text = one + two
    }

    suspend fun request(params: String): String {
        Thread.sleep(10000)
        Log.e(TAG, "耗时操作1s ${Thread.currentThread().name}")
        return params
    }


    fun test() {
        Log.d("AA", "协程初始化开始，时间: " + System.currentTimeMillis())

        GlobalScope.launch(Dispatchers.Unconfined) {

            Log.d("AA", "协程初始化完成，时间: " + System.currentTimeMillis() + "${Thread.currentThread().name}")
            for (i in 1..3) {
                Log.d("AA", "协程任务1打印第$i 次，时间: " + System.currentTimeMillis() + "${Thread.currentThread().name}")
            }
            delay(500)
            for (i in 1..3) {
                Log.d("AA", "协程任务2打印第$i 次，时间: " + System.currentTimeMillis())
            }
        }

        Log.d("AA", "主线程 sleep ，时间: " + System.currentTimeMillis() + "${Thread.currentThread().name}")
        Thread.sleep(1000)
        Log.d("AA", "主线程运行，时间: " + System.currentTimeMillis())

        for (i in 1..3) {
            Log.d("AA", "主线程打印第$i 次，时间: " + System.currentTimeMillis())
        }
    }

    //启动协程的方式
    fun startC1() {
        runBlocking {

        }
    }
    fun startC2() {
        runBlocking {

        }
    }
    fun startC3() {
        runBlocking {

        }
    }

}
