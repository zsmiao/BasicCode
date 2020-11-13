package com.itheima.list;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo03List {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        Student student1 = getStudent();
        Student student2 = getStudent();
        Student student3 = getStudent();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            System.out.println("姓名：" + student.getName() + "  " + "年龄：" + student.getAge());
        }
    }

    public static Student getStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学生姓名>>>");
        String name = scanner.nextLine();
        System.out.print("请输入学生年龄>>>");
        int age = scanner.nextInt();

        Student student = new Student(name, age);
        return student;
    }
}
