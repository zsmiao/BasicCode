package com.itheima.string;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Demo03String {
    public static void main(String[] args) {
        String s1=new String("abc");
        String s2="abc";
        char [] chars={'A','B','C'};
        String s3=new String(chars);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
