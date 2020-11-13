package com.itheima.day05;

import java.util.Scanner;

/**
 * 数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。
 * 请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试。
 */
public class Test06Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要取绝对值的数");
        double a = scanner.nextInt();
        System.out.println(jue(a));
    }

    public static double jue(double a) {
        if (a > 0) {
            return a;
        } else {
            return a * -1;
        }

    }
}
