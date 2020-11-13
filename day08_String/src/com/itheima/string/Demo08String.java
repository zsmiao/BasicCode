package com.itheima.string;

import com.itheima.domain.Student;

import java.util.Scanner;

public class Demo08String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入>>>");
        String input = scanner.nextLine();
        String[] strings = input.split(" ");
        System.out.println(strings[0]+" "+strings[1]);
        Student student = new Student(strings[0], strings[1]);
        System.out.println("姓名:" + student.getName() + "年龄:" +"  "+ student.getAge());

    }
}
