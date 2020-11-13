package com.itheima.day08;

import java.util.Scanner;

/**
 * 键盘录入一个字符串，使用程序实现在控制台遍历该字符串。
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入字符串>>>");
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
