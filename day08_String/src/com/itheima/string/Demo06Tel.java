package com.itheima.string;

import java.util.Scanner;

public class Demo06Tel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入>>>");
        String telnum = scanner.nextLine();
        String start = telnum.substring(0, 4);
        String end = telnum.substring(telnum.length() - 4);
        System.out.println(start + "****" + end);
    }
}
