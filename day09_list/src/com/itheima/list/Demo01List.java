package com.itheima.list;

import com.itheima.domain.Student;

public class Demo01List {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Student student1 = new Student("张三", 23);
        Student student2 = new Student("李四", 24);
        Student student3 = new Student("王五", 25);
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        for (int i = 0; i < students.length; i++) {
            Student temp = students[i];
            System.out.println("姓名：" + temp.getName() + "  " + "年龄：" + temp.getAge());
        }
    }
}
