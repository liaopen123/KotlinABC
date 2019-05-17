package com.qidongyinqing.kotlinabc.集合对比;

import com.qidongyinqing.kotlinabc.集合对比.entity.Course;
import com.qidongyinqing.kotlinabc.集合对比.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentList {


    public void addList(){
        Student student1 = new Student();
        student1.setName("taylor");
        student1.setAge(33);
        student1.setMale(false);
        List<Course> courses1 = new ArrayList<>();
        Course course1 = new Course();
        course1.setName("pysics");
        course1.setPeriod(50);
//        course1.setMust(false);
        Course course2 = new Course();
        course2.setName("chemistry");
        course2.setPeriod(78);
        courses1.add(course1);
        courses1.add(course2) ;
//        student1.setCourses(courses1);

        Student student2 = new Student();
        student2.setName("milo");
        student2.setAge(20);
        student2.setMale(false);
        List<Course> courses2 = new ArrayList<>();
        Course course3 = new Course();
        course3.setName("computer");
        course3.setPeriod(50);
//        course3.setMust(true);
//        student2.setCourses(courses2);

        List<Student> students = new ArrayList<>();
        students.add(student2);
        students.add(student1);

    }
}
