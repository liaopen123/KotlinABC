package com.qidongyinqing.kotlinabc.method

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.qidongyinqing.kotlinabc.R
import com.qidongyinqing.kotlinabc.toast
import com.qidongyinqing.kotlinabc.中缀调用.add
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import java.util.concurrent.locks.Lock

class MethodMainActivity : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_method_main)

        val list = listOf<Int>(1, 2, 3, 233)
        //普通方法
        info { printToString(list, ":", "{", "}") }
        //扩展函数
        list.printToString("-", "{", "}")
        //命名函数  需要注意的地方是 第一个参数命名后 后面的都得命名
        printToString(list, seporator = "$", prefix = "{", suffix = "}")
        //命名函数的属性可以打乱  因为已经有名字了  对号入座
        printToString(list, prefix = "{", suffix = "}", seporator = "&")
        printToStringWithDefaultValue(list)

        //中缀函数
        val result = 2 add 9
        info { "result:$result" }

        lock("Lock()") {
            info { "搞what" }
        }
            val view:View=View(this)
        fun getname():String{
            return  "廖鹏辉"
        }
        view.haha {

            getname() }
        view.haha1 {
//            setBackgroundColor(#ffffff)
            getname() }

    }
    fun <T> lock(text:String, body: () -> T ) : T {
       text.toString()
        try {
            return body()
        }
        finally {

        }
    }

    fun <T> printToString(
            collection: Collection<T>,
            seporator: String,
            prefix: String,
            suffix: String
    ): String {
        val log = StringBuilder(prefix)
        for ((index, item) in collection.withIndex()) {
            if (index > 0) {
                log.append(seporator)
            }
            log.append(item.toString())
        }
        log.append(suffix)
        info { log.toString() }
        return log.toString()
    }

    //默认参数
    fun <T> printToStringWithDefaultValue(
            collection: Collection<T>,
            seporator: String = "~",
            prefix: String = "(",
            suffix: String = ")"
    ): String {
        val log = StringBuilder(prefix)
        for ((index, item) in collection.withIndex()) {
            if (index > 0) {
                log.append(seporator)
            }
            log.append(item.toString())
        }
        log.append(suffix)
        info { log.toString() }
        return log.toString()
    }


    fun add(vararg titles:String){
        //得到的title是array类型  可用沟通过*titles进行展开
        listOf<String>("c",*titles)
    }


    fun map2(){

    }


//    public infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)
fun <T:View> T.haha(f:()->String){
                val name =f()
    info { name }
}
fun <T:View> T.haha1(f:T.()->String){
                val name =f()
    info { name }
}

}
