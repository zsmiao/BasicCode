package com.itheima.day06;

/**
 * 第20060期双色球开奖结果为：05 09 14 20 24 30 08，小明买的号是：08 09 14 20 24 30 05。
 * 请设计程序帮助小明实现中奖梦想，要求使用两种方式实现首尾号码的交换，每种方式分别定义一个方法，在主方法
 * 中调用测试。
 */
public class Test01 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 14, 20, 24, 30, 8};
        int[] arr1 = {5, 9, 14, 20, 24, 30, 8};
        dateE(arr, 0, 6);
        dateB(arr1, 0, 6);
    }

    private static void dateE(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        System.out.println("第三个变量：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void dateB(int[] arr, int a, int b) {
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
        System.out.println("异或：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
