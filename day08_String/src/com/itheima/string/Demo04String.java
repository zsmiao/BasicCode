package com.itheima.string;

import java.util.Scanner;

public class Demo04String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        String sc = scanner.nextLine();
        char[] chars = sc.toCharArray();
        int bigcount = 0;
        int smallcount = 0;
        int numcount = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c >= 'A' && c <= 'Z') {
                bigcount++;
            } else if (c >= 'a' && c <= 'z') {
                smallcount++;
            } else if (c >= '0' && c <= '9') {
                numcount++;
            }
        }
        System.out.println("大写字母个数：" + bigcount);
        System.out.println("小写字母个数：" + smallcount);
        System.out.println("数字个数：" + numcount);

    }
}
