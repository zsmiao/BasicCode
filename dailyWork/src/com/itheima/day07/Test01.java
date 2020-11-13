package com.itheima.day07;

/**
 * 1、【编号：701】 定义标准学生类，属性包括姓名和年龄，要求分别使用空参和有参构造方法创建对象，
 * 空参创建的对象通过setXxx赋值，有参创建的对象直接赋值，并通过show方法展示数据。
 */
class Student {
    private String name;
    private int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println("姓名：" + name + "   " + "年龄：" + age);
    }
}

public class Test01 {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("张森淼");
        student.setAge(22);
        student.show();
        Student student1=new Student("张三丰",101);
        student1.show();
    }
}
