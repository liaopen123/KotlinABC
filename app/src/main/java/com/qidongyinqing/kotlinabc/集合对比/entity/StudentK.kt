package com.qidongyinqing.kotlinabc.集合对比.entity

data class StudentK(var name: String, var age: Int, var isMale: Boolean, var courses: List<CourseK> = listOf())