package com.itheima.method;

public class Demo02Method {
    public static void main(String[] args) {
        marry("别墅",41,6666.66);
    }

    public static void marry(String house,int age,double money) {
        if(money<666666.66){
            System.out.println("彩礼太少!");
        }
        if (age>22&&age<40){
            System.out.println("年龄合适");
        }else {
            System.out.println("年龄太大");
        }
    }
}
