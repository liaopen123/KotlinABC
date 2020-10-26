package com.qidongyinqing.kotlinabc.xiecheng

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.qidongyinqing.kotlinabc.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.debug
import org.jetbrains.anko.toast

class XieChengActivity : AppCompatActivity(), AnkoLogger {
     val TAG:String="XieChengActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xie_cheng)
        cancel1()
    }


    fun main1() {
        GlobalScope.launch {
            delay(1000L)//Delays coroutine for a given time without blocking a thread and resumes it after a specified time.
            Thread.sleep(2000)
            Log.i(TAG, "launch ")
        }
        Log.i(TAG, "----")
    }

    fun main2(){
//        GlobalScope.launch {
//            delay(1000)
//            Log.i(TAG, "block ")
//        }
//        Log.i(TAG, "no block ")
        runBlocking {
            delay(3000L)
            Log.e(TAG,"阻塞3秒先")
        }
        Log.e(TAG,"终于阻塞完了")
    }

    fun join(){
        val job = GlobalScope.launch {
            delay(1000)
            Log.e(TAG, "我先来")
        }
        Log.e(TAG, "main do")
        GlobalScope.launch {
            job.join()
            Log.e(TAG, "没办法被插队了")
        }

    }


    fun cancel(){
        val job = GlobalScope.launch {
            delay(3000)
            Log.e(TAG, "取消了就不会被显示")
        }
        Log.e(TAG, "main do")
         GlobalScope.launch {
            job.cancel()
            Log.e(TAG, "final run")
        }

    }

      fun cancel1(){
        val job = GlobalScope.launch {
            delay(3000)
            Log.e(TAG, "取消了就不会被显示")
        }
        Log.e(TAG, "main do")

        val job1 = GlobalScope.launch {
            job.join()
            Log.e(TAG, "final run")
        }
          job1.cancel()
    }




}
