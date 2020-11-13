package com.itheima.day05;

import java.util.Scanner;

/**
 * 通过键盘录入两个整数n和m。n代表行数，m代表列数，范围都是1-10 。
 * 定义一个方法，方法的功能是打印n行m列的@符号。执行效果如下：
 * 请输入行数：
 * 4
 * 请输入列数：
 * 5
 *
 * @@@@@
 * @@@@@
 * @@@@@
 * @@@@@
 */

public class Test04Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入行数：");
        int a = scanner.nextInt();
        System.out.println("请输入列数：");
        int b = scanner.nextInt();
        method(a, b);
    }

    public static void method(int a, int b) {
        int count = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("@");
                count++;
                if (count % b == 0) {
                    System.out.println();
                }
            }
        }
    }
}
