package com.example.pony.kotlinworld.varandval

fun hello(args:Array<String>){
    var name = "张三"
    println(name)
    val name1:String ="XIXIX"
    println(name1)
    var c = add(10,11)
    println(c)
    changPlace("中山公园")
    getString(null)
}


fun add(a:Int,b:Int):Int{
    return a+b
}
fun checkAge(age:Int):Boolean{
    if(age>18) return true else return false
}

//字符串模板
fun changPlace(placeName:String):String{
    return """" 今天去${placeName}去玩，很开心"""
}


fun getString(str:String?):String{
    return "热$str"
}