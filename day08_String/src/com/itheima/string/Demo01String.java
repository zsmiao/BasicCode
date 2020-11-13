package com.itheima.string;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class Demo01String {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println(s1);
        System.out.println("-----------------------");
        String s2 = new String("abcd");
        System.out.println(s2);
        System.out.println("-----------------------");
        char[] chars = {'a', 'b', 'c','d'};
        String s3 = new String(chars);
        System.out.println(s3);
        System.out.println("-----------------------");
        byte[] bytes = {97, 98, 99,100};
        String s4 = new String(bytes);
        System.out.println(s4);
        System.out.println("-----------------------");
        String s5="abc";
        System.out.println(s5);

    }
}
