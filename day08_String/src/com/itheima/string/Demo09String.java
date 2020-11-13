package com.itheima.string;

public class Demo09String {
    public static void main(String[] args) {
        String str="  good good study,day day up!  ";
        //将字符串英文字母全部转化为大写
        String s = str.toUpperCase();
        System.out.println("s = " + s);
        //将字符串英文字母全部转化为小写
        String s1 = str.toLowerCase();
        System.out.println("s1 = " + s1);
        //清除当前字符串饿首尾空格
        String trim = str.trim();
        System.out.println("trim = " + trim);
        //判断当前字符串是否包含指定内容
        boolean contains = str.contains("good");
        System.out.println("contains = " + contains);
        //获取指定内容在当前字符串中第一次出现的索引位置
        int index = str.indexOf("s");
        System.out.println("index = " + index);
    }
}
