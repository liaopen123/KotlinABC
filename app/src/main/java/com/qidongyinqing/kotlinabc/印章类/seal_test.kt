package com.qidongyinqing.kotlinabc.印章类

fun main() {

}

sealed class SealedExpr{


}

// 其子类可以定在密封类外部，但是必须在同一文件中 v1.1之前只能定义在密封类内部
object NotANumber : SealedExpr()
object Add : SealedExpr()   // 单例模式
object Minus : SealedExpr() // 单例模式
data class Person(val num1 : Int, val num2 : Int) : SealedExpr()
