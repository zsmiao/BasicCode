package com.itheima.method;

import java.util.Random;

public class Demo03Method {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(1000);
        int m = random.nextInt(100);
        print(n, m);
    }

    public static void print(int n, int m) {
        System.out.println(n + "到" + m + "之间所有的偶数为：");
        for (int i = n; i < m; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
