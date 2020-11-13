package com.itheima.method;

public class Demo06Method {
    public static void main(String[] args) {
        int number=100;
        System.out.println(number);
        chang(number);
        System.out.println(number);
    }

    public static int chang(int number) {
        number=300;
        System.out.println(number);
        return number;
    }
}
