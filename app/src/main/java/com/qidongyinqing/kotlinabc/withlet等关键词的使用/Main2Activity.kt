package com.example.pony.kotlintoutor.withlet等关键词的使用

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.webkit.WebView
import com.qidongyinqing.kotlinabc.R

class Main2Activity : AppCompatActivity() {
    val list = mutableListOf<String>("A", "B", "C")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        let()
        useApply()
        useRun()
        useWith()
        useAlso()
        useRepeat()
        useTakeIf()
        useTakeUnless()

    }


    private fun let() {
        val change = list.let {
            it.add("D")
            it.add("E")

            Log.e("111", "返回值是语句块的最后一行，若最后一行语句无返回值，则整个let语句块也无返回值")
            it.size

            "hahahah"
        }

        Log.e("111", "" + change)
    }


    private fun useApply() {
        //必有返回值  返回值是本身  方法内部 不需要用it表示 直接this表示本体
        var list2 = list.apply {
            add("444")
            add("555")
            add("666")

        }
        println(list2)
    }

    private fun useRun() {
        val isLogin = false
        //相当于是 with和apply的结合体   取其交集：1.方法内用this代替本体，2.最后一行有返回值，则方法的返回值为最后一行的返回值，弱没返回值，则整个run方法也无返回值
        val run = list.run {
            add("777")
            add("888")
            add("999")
        }
        println("run$run")


        run {
            if (isLogin) "欢迎回来" else "请先登录"
        }.plus("用户名:lph")
    }


    private fun useWith() {
        //和run一样  只不过是书写形式不一样  with不是一个扩展，可以在方法体内通过this调用，并且可以返回任意。
        val with = with(list) {
            add("777")
            add("888")
            add("999")
        }


        with(WebView(this).settings) {
            javaScriptEnabled = true
            databaseEnabled = true
        }
    }


    //also的定义跟apply很像。接收一个函数，函数的参数是类型T的对象。also扩展方法的返回值也是类型T的对象。
    private fun useAlso() {
        list.also {
            it.add("hello world")
        }
    }

    private fun useRepeat() {
        repeat(10) {
            println("我是第${it}次")
        }
    }

    private fun useTakeUnless() {
        val myself = "helloworld".takeUnless {
            it.length > 1
        }
        print(myself)

    }

    private fun useTakeIf() {
        val myself = "helloworld".takeIf {
            "11111"
            it.length > 1

        }
        print(myself)
    }

}
