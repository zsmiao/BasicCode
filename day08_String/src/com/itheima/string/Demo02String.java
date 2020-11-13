package com.itheima.string;

public class Demo02String {
    public static void main(String[] args) {
        String s1 = new String("abc");

        char[] chars = {'a', 'b', 'c'};
        String s2 = new String(chars);
        String s3 = new String(chars);

        String s4 = "abc";
        String s5 = "abc";

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1 == s4);
        System.out.println(s4 == s5);
    }
}
