package com.qidongyinqing.kotlinabc

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.qidongyinqing.kotlinabc.pojo.Customer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val WEEK = 7
        var name = "pony"
        val c:Int
        c = 100
        setContentView(R.layout.activity_main)
        tv.text = "haha"



        tv.setOnClickListener {toast("hello kotlin")}
        stringMoudle()
        println("0和40最大值是${maxof(0,40)}")
       println("得到的int为${parseInt("")}")

        getEvery()
        getEvery1()
        getWhile()
println( isWhen(1))
println(  isWhen("zzz"))
println(   isWhen(888))
        println(isRange(120))


        var customer = Customer(name = "pony",email = "467969@qq.com")

        println(customer)
        customer.email="ddd"
        println(customer)
        println(customer)

    }


    fun getsum(a:Int,b:Int) :Int{
        return a+b
    }

    fun sum(a: Int, b: Int) = a + b

    fun println(a:Int,b:Int):Unit{
        print("gaga")
    }

    fun printMessage(a:String,b:String){
        print("hahha")
    }


    //使用字符串模板
    fun stringMoudle(){
        var a =1
        val s1 = "a is $a"

        a = 2
         val  s2 = "${s1.replace("is","was")},but now is $a"

       Log.e("TAG",s2)
    }


    //条件表达式
    fun maxof(a:Int,b:Int):Int{
        if(a>b)
            return a
        else
            return b
    }

    //简便用法
    fun maxof1(a:Int,b:Int)=if(a>b)a else b
    fun parseInt(str: String): Int? {
        return str.toIntOrNull()
    }


    fun getEvery(){
        var items = listOf<String>("banana","apple","cheery")
        for (item in items){
            println(item)
        }
    }
    fun getEvery1(){
        var items = listOf<String>("banana","apple","cheery")
        for (index in items.indices){
            println("${index}is${items[index]}")
        }
    }


    fun getWhile(){
        val items = listOf<String>("banana","apple","cheery")
       var index = 0
        while (index<items.size){
            println("$index is${items[index]}")
            index++
        }
    }


    //when 表达式   Any相当于java的Object
//    fun isWhen(a:Any):String {
//        when(a){
//            1 -> return "我是数字1"
//            is Long ->return "什么都不是"
//            "zzz" ->return "字符串"
//            else -> return "unknown"
//
//        }
//    }

    fun isWhen(a:Any):String=
        when(a){
            1 ->  "我是数字1"
            is Long -> "什么都不是"
            "zzz" -> "字符串"
            else ->  "unknown"

        }
    //范围段 用法
    fun isRange(a:Int)= (a in 100..200)



}
