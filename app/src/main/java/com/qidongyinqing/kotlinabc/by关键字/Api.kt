package com.qidongyinqing.kotlinabc.by关键字

interface Api{
    fun eat()
    fun play()
}

class ApiImpl(api:Api):Api by api