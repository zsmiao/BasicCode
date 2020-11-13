package com.itheima.day05;

import java.util.Random;

public class Test08Method {
    public static void main(String[] args) {
        int[] arr = {10000, 1000, 588, 888, 2};
        int[] brr = new int[5];
        int index = 0;
        Random r = new Random();
        while (index < arr.length) {
            int i = r.nextInt(arr.length);
            boolean b = exist(brr, arr[i]);
            if (!b) {
                brr[index] = arr[i];
                index++;
                System.out.println(arr[i] + "元的奖金被抽出");
            }
        }
    }

    public static boolean exist(int[] brr, int num) {
        for (int i = 0; i < brr.length; i++) {
            if (brr[i] == num) {
                return true;
            }
        }
        return false;
    }
}

