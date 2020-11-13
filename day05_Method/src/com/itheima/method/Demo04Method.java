package com.itheima.method;

public class Demo04Method {
    public static void main(String[] args) {
        int sum = sumNumber(100, 200);
        System.out.println(sum);
        System.out.println(sumNumber(900,199));
    }

    public static int sumNumber(int a, int b) {
        int c = a + b;
        return c;
    }
}
