package com.qidongyinqing.kotlinabc.call_each_other.kotlin

class CompanionObjClass {


    companion object {
        var name = "gagaga"
        fun printHello() {
            System.out.println("hello")
        }
    }

    fun printSomething(sth: String) {
        System.out.println(sth)
    }


}