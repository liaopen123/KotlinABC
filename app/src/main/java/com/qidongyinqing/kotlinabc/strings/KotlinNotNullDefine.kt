package com.qidongyinqing.kotlinabc.strings

import android.util.Log

class KotlinNotNullDefine{


    companion object{
        val TAG = "KotlinNotNullDefine"
        var strNotNull: String? = null
        fun getLog(){
            Log.e(TAG,"KotlinNotNullDefine:getLog()")
            strNotNull?.compareTo("gaga")


            val strB:String? = null
            var length_null:Int?
            length_null = strB?.length?:-1
            Log.e(TAG,"使用?.得到字符串B的长度为$length_null")
        }



    }



}