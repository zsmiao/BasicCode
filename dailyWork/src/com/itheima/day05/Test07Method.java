package com.itheima.day05;

import java.util.Scanner;

/**
 * 请定义一个方法，对正数的小数进行四舍五入的操作(不考虑负数情况)。
 * 四舍五入之后的结果是一个int整数类型并返回。最后对方法进行测试。
 */
public class Test07Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个小数：");
        double a = scanner.nextDouble();
        System.out.println(s(a));
    }

    public static int s(double a) {
        if (a * 10 % 10 >= 5) {
            a = (int) a + 1;
            return (int) a;
        } else {
            a = (int) a;
            return (int) a;
        }
    }
}
