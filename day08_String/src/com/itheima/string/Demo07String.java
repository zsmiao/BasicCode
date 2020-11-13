package com.itheima.string;

import java.util.Scanner;

public class Demo07String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入>>>");
        String input = scanner.nextLine();
        String result = input.replace("TMD", "***");
        System.out.println(result);
    }
}

