package com.qidongyinqing.kotlinabc.集合对比

import android.util.Log
import com.qidongyinqing.kotlinabc.innerfunc.InnerUser.Companion.TAG
import com.qidongyinqing.kotlinabc.集合对比.StudentListKotlin.Companion.students

class CollectionAPI {


    fun testApi() {
        val friends = students
                .flatMap {
                    //取出里面的courses 并且平铺成每个item  将嵌套集合中的内层集合铺开
                    it.courses
                }
                .toSet()//将集合元素去重
                .filter {
                    //条件过滤
                    it.period < 70 && !it.isMust
                }
                .map {
                    //函数的语义是：在集合的每一个元素上应用一个自定义的变换
                    it.apply {
                        name = name.replace(name.first(), name.first().toUpperCase())
                    }
                }
                .sortedWith(compareBy({ it.period }, { it.name }))

    }

}