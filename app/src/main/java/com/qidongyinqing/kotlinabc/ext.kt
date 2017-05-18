package com.qidongyinqing.kotlinabc

import android.content.Context
import android.util.Log
import android.widget.Toast

/**
 * Created by liaopenghui on 2017/5/18.
 */


fun Context.toast(message:String, length : Int = Toast.LENGTH_SHORT){
    Toast.makeText(this,message,length)
    Log.e("111","2222")
}
