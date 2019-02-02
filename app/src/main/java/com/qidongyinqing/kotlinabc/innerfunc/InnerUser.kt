package com.qidongyinqing.kotlinabc.innerfunc

import android.util.Log
import com.qidongyinqing.kotlinabc.pojo.BookShop
import org.jetbrains.anko.AnkoLogger

class InnerUser : AnkoLogger {

    companion object {
        val TAG = javaClass.simpleName
        //repeat 循环执行多次block中的代码
        fun repeatFun() {
            repeat(3) {
                Log.d(TAG, "count$it")
            }
        }

        //public inline fun <T, R> with(receiver: T, block: T.() -> R): R {
        //    contract {
        //        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
        //    }
        //    return receiver.block()   最终执行receiver.block()
        //}
        //
        fun withFun() {
            with(ArrayList<String>()) {
                add("testwith")
                add("testwith1")
                add("testwith2")
                add("testwith3")
                add("testwith4")
                Log.d(TAG, "array.withFun$this")
            }.let { Log.d(TAG, "array.withFun$it") }

        }

        //适用于深层次嵌套，多重属性判断非空 才执行block里面的东西。
        fun letFun() {
            val bookShop = BookShop(null, "")
            bookShop?.booklist?.get(0)?.bookName?.let {
                Log.d(TAG, "如果let前面这些都不为空，则执行这里block的代码，书的名字$it")
            }
        }

        //调用某个对象的apply()方法，可以在block中重复使用这些
        fun applyFun() {
            val list = ArrayList<String>().apply {
                add("lph")
                add("lph1")
                add("lph2")
                add("lph3")
            }.let {
                Log.d(TAG, "applyFun:$it")
            }
        }

        fun runFun() {
            ArrayList<String>().run {
                add("lph")
                add("lph1")
                add("lph2")
                add("lph3")
            }.let {
                Log.d(TAG, "runlist:$it")
            }
        }

        fun otherRunFunc() {
            val run = run {
                "lph"
            }
            print("run$run")

        }

        //执行block返回this
        fun alsoFun() {
            val also = "lph111".also {
                print("also$it")
            }

            print(also)
        }

        //如果满足block中的判断，则返回当前值，如果不满足则返回为null
        fun takeIf() {
            val takeIf = "lph takeif".takeIf {
                it.equals("lph")
            }

            Log.d(TAG, "takeIf:$takeIf")
        }

        //和takeIf相反，如果不满足block中的boolean 则返回当前值，否则返回为null
        fun takeUnless() {
            val takeUnless = "lph takeUnless".takeUnless {
                it.equals("lph")
            }

            Log.d(TAG, "takeUnless:$takeUnless")
        }

        //        static  int[]  array ={65, 58, 95, 10, 57, 62, 13, 106, 78, 23, 85}
//    fun quickSort(array:Int[],left:Int,right:Int){
//
//    }
        fun quickSort(array: Array<Int>, left: Int, right: Int): Array<Int> {
            if (left < right) {
                var position: Int = getCenter(array, left, right)
                quickSort(array, left, position - 1)
                quickSort(array, position + 1, right)
            }
            return array

        }

        private fun getCenter(array: Array<Int>, left: Int, right: Int): Int {
            var key = array[left]
            var right = right
            var left = left
            while (left < right) {
                while (left < right && key <= array[right]) {
                    right--
                }
                array[left] = array[right]
                while (left < right && array[left] <= key) {
                    left++
                }
                array[right] = array[left]
            }
            array[left] = key
            return left

        }
    }


}