package com.qidongyinqing.kotlinabc

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.pony.kotlintoutor.`object`.Rect
import com.example.pony.kotlintoutor.委托和代理.BigHeadSon
import com.example.pony.kotlintoutor.委托和代理.SmallHeadFather
import com.qidongyinqing.kotlinabc.innerfunc.InnerUser
import com.qidongyinqing.kotlinabc.pojo.Customer
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    val pi = 3.1415
    val TAG = javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val WEEK = 7
        var name = "pony"
        val c:Int
        c = 100
        setContentView(R.layout.activity_main)
//        tv.text = "haha"
//
//
//
//        tv.setOnClickListener {toast("hello kotlin")}
//        stringMoudle()
//        println("0和40最大值是${maxof(0,40)}")
//       println("得到的int为${parseInt("")}")
//
//        getEvery()
//        getEvery1()
//        getWhile()
//println( isWhen(1))
//println(  isWhen("zzz"))
//println(   isWhen(888))
//        println(isRange(120))
//
//
//        var customer = Customer(name = "pony",email = "467969@qq.com")
//
//        println(customer)
//        customer.email="ddd"
//        println(customer)
//        println(customer)
//        InnerUser.withFun()
//        InnerUser.repeatFun()
        InnerUser.letFun()
//        InnerUser.applyFun()
//        InnerUser.runFun()
//        InnerUser.otherRunFunc()
//        InnerUser.alsoFun()
//        InnerUser.takeIf()
//        InnerUser.takeUnless()
        var array = arrayOf(65, 58, 95, 10, 57, 62, 13, 106, 78, 23, 85)
        val quickSort = InnerUser.quickSort(array, 0, array.size - 1)
        Log.e(TAG, "quickSort:$quickSort")
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


//    Log.d("DDD",getName("嘻嘻嘻"))
//    getCircleMianji(radius = 2.22)
//    var rect = Rect(20,40)
//
//    var son  = BigHeadSon()
//    var father = SmallHeadFather()
//
//    son.washing()
//    father.washing()
//}


fun varandval(){
    //val 和 var
    var hello  ="hello"
    var kitty:String  ="kitty"
    val dog  ="dog"
    val cat:String  ="cat"

//        cat="cat1" //会报错 因为cat
    kitty="blackKitty"
}

fun mathUtils(){
    var d:Double = 4.0
    val sqrt = Math.sqrt(d)
    val pow = Math.pow(2.0,2.0)
}

//字符串模板
fun getName(name:String)="""今天天气不错，我和${name}一起出去玩，他说他的名字${name.length}位数,不喜欢"""


fun ifelse(age:Int):String {
    if(age==18) return "happy" else return "unhappy"
}

//字符串的比较
fun comPare(a:String,b:String):Boolean{
    return a.equals(b,true)
}

//空值处理
fun getName1(name:String?)=name; //加上？ 写成getName1(null)不会报错

//when表达式  类似于 switch
fun getType(sex:String):String{
    var type = when(sex){
        "男"->"我是男的"
        "女"->"我是女的"
        else ->"未知物种"
    }
    return type
}


//list 写法
fun getList(){
    var list = listOf<String>("xxx","ppp","aaa","ggg")
    for(l in list){
        print(l)
    }
    for((i,l) in list.withIndex()){//为index  l为item
//            println(${i}+"")
    }
}

//loop 闭区间和开区间
fun printLoop(): IntRange {
    var list = 1 .. 100//闭区间
    var list1 = 1 until 100//开区间
    for(i in list step 2){
        println(i)
    }
    return list1
}

//反转
fun getReversed():List<String>{
    var list = listOf<String>("xxx","ppp","aaa","ggg")
    return list.reversed();
}

//总数 相当于list.size();
fun getCount():Int{
    var list = listOf<String>("xxx","ppp","aaa","ggg")
    return list.count();
}

//Map
fun getMap():Map<String,String>{
    var map  = HashMap<String,String>()
    map["好"] = "good"
    map["学习"] = "学习"
    return map
}

//函数表达式的3种写法  变量和函数表达式处于同一level
var i = {x:Int,y:Int->x+y}  //调用:i(4,5)
var j : (Int,Int)->Int={x,y->x+y}


//默认参数
fun getCircleMianji(PI:Double=pi,radius:Double):Double=2*PI*radius

//具名参数调用：    getCircleMianji(radius = 2.22)

//字符串和数字的转换  String.toInt()  Int.toString()

//readLine();  --->获取控制台输入的内容

//异常处理  类似于java

fun dvide(a:Int,b:Int){
    try {

    }catch (e: Exception){

    }
}

//递归优化  tailedrec  如果递归层数太多 会报错Stack Overflow   加上tailedrec就好了

}
