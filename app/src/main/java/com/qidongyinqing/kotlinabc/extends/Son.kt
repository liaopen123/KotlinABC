package com.example.pony.kotlintoutor.extends

class Son(name:String):Father(name){
    override fun eat() {
        println("$name eat xxxx")
    }

    override fun smile(){

    }

}