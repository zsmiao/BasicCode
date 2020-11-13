package com.itheima;

public class Test {
    public static void main(String[] args) {
        int [] a1=new int[3];
        a1[1]=3;
        a1[2]=4;
        int [] a2=a1;
        a2[1]=33;
        System.out.println(a2[1]);
    }
}
