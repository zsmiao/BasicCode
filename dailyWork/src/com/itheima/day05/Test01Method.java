package com.itheima.day05;

import java.util.Random;

public class Test01Method {
    public static void main(String[] args) {
        System.out.println(print(2,"你好，世界"));
        System.out.println("和为"+num());
        int y = bir(19);
        System.out.println(y);

    }

    //定义一个方法,方法功能是可以打印任意次数的指定字符串内容.并在main方法中调用该方法.
    @SuppressWarnings("AlibabaCommentsMustBeJavadocFormat")
    public static int print(int num,String msg) {
        for (int i = 0; i < num; i++) {
            System.out.println(msg);
        }
        return num;
    }

    //定义一个方法,完成获取任意三个数的和并返回.注意: 这里的任意三个数包含整数和小数.并在main方法中调用该方法.
    @SuppressWarnings("AlibabaCommentsMustBeJavadocFormat")
    public static double num() {
        Random random = new Random();
        double[] arr = new double[3];
        double sum=0;
        for (int i = 0; i < 3; i++) {
            double number = random.nextInt(100);
            arr[i] = number;
            System.out.println("第" + (i + 1) + "个数为：" + number);
        }
        for (int i = 0; i <3 ; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    //基于不死神兔案例场景,定义一个方法,可以获取指定月份的兔子对数并返回.在main方法中调用该方法.
    @SuppressWarnings("AlibabaCommentsMustBeJavadocFormat")
    public static int bir(int m) {
        int[] arr = new int[m];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < m; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
            //System.out.println(arr[i]);
        }
        return arr[m - 1];
    }
}

