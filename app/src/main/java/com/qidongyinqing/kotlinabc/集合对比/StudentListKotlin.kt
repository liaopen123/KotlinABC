package com.qidongyinqing.kotlinabc.集合对比

import com.qidongyinqing.kotlinabc.集合对比.entity.CourseK
import com.qidongyinqing.kotlinabc.集合对比.entity.StudentK


public class StudentListKotlin {




    companion object{
        val students = listOf(
                StudentK("taylor", 33, false, listOf(CourseK("physics", 50), CourseK("chemistry", 78))),
                StudentK("milo", 20, false, listOf(CourseK("computer", 50, true))),
                StudentK("lili", 40, true, listOf(CourseK("chemistry", 78), CourseK("science", 50))),
                StudentK("meto", 10, false, listOf(CourseK("mathematics", 48), CourseK("computer", 50, true)))
        )
    }
}


