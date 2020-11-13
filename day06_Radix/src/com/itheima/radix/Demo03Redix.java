package com.itheima.radix;

public class Demo03Redix {
    public static void main(String[] args) {
        int[][] arr = {{11, 22, 33}, {44, 55, 66}};
        int max = arr[0][0];
        System.out.println("这个数组为：");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("最大值为：" + max);
        sum(arr);
    }

    public static void sum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("数组的和为：" + sum);

    }
}
