package com.qidongyinqing.kotlinabc.call_each_other.java;

import com.qidongyinqing.kotlinabc.call_each_other.kotlin.CompanionObjClass;
import com.qidongyinqing.kotlinabc.call_each_other.kotlin.DataUtils;
import com.qidongyinqing.kotlinabc.call_each_other.kotlin.KotlinUti;

public class CallKotlin {

    public void test(){
        DataUtils dataUtils = new DataUtils();
        String name = dataUtils.getName();//kotlin会把所有的变量默认弄添加get 和set方法
        dataUtils.printSomething("gaga");


        KotlinUti.INSTANCE.printHello();//kotlin类被object所修饰，则为静态类，其中的方法,属性皆为静态，可通过类名.INSTANCE.XXX进行调用
        KotlinUti.INSTANCE.printSomething("2333");
        KotlinUti.INSTANCE.getName();


        //companion object
        CompanionObjClass.Companion.getName();
        CompanionObjClass.Companion.printHello();
        CompanionObjClass companionObjClass = new CompanionObjClass();
        companionObjClass.printSomething("gagag");



    }


}
