package com.itheima.day08;

import java.util.Scanner;

/**
 * 请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。
 * 比如：Hello12345World中字母：10个，数字：5个。
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入字符串>>>");
        String str = scanner.nextLine();
        int letcount = 0;
        int numcount = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar > 'A' && aChar < 'Z' || aChar > 'a' && aChar < 'z') {
                letcount++;
            } else if (aChar > '0' && aChar < '9') {
                numcount++;
            }
        }
        System.out.println("字母:" + letcount + "个");
        System.out.println("数字:" + numcount + "个");
    }
}
