package com.example.pony.kotlintoutor.extends

open abstract class Father(var name:String){
    var character  = "内向"
  open  fun smile(){
        println("老子笑了")
    }

   abstract fun eat()
}