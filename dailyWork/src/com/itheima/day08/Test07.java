package com.itheima.day08;

import java.util.Scanner;

/**
 * 我国的居民身份证号码，由由十七位数字本体码和一位数字校验码组成。
 * 请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果。
 * 规则为：号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X。
 */
public class Test07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入身份证号>>>");
        String str = scanner.nextLine();
        idNumber(str);
    }

    public static void idNumber(String id) {

        if (id == null || id.length() != 18 || id.startsWith("0")) {
            System.out.println("非法身份证号！");
            return;
        }
        for (int i = 0; i < id.length(); i++) {
            char c = id.charAt(i);
            if (i == id.length() - 1) {
                if (c < '0' || c > '9' && c != 'X') {
                    System.out.println("非法身份证号！");
                    return;
                }
            } else {
                if (c < '0' || c > '9') {
                    System.out.println("非法身份证号！");
                    return;
                }
            }
        }
        System.out.println("合法身份证号！");
    }
}
