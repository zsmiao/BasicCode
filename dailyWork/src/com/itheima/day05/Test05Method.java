package com.itheima.day05;

import java.util.Scanner;

/**
 * 在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量。执行效果如下：
 * 请输入第一个整数：10
 * 请输入第二个整数：30
 * 请输入第三个整数：20
 * 从大到小的顺序是： 30 20 10
 */
public class Test05Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = scanner.nextInt();
        System.out.println("请输入第二个整数：");
        int b = scanner.nextInt();
        System.out.println("请输入第三个整数：");
        int c = scanner.nextInt();
        max(a,b,c);
    }

    public static void max(int a, int b, int c) {
        int[] arr = {a, b, c};
        int max = a;
        int min = a;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int sum=a+b+c;
        int between = sum - max - min;
        System.out.print("从大到小的顺序是："+max+" ");
        System.out.print(between);
        System.out.println(" "+min);
    }
}
