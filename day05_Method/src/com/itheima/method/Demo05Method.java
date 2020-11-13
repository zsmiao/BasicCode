package com.itheima.method;
/**
 *基于不死神兔案例场景,定义一个方法,可以获取指定月份的兔子对数并返回.在main方法中调用该方法.
 */
public class Demo05Method {
        public static void main(String[] args) {
           // bir(1);
            int w=bir(3);
            System.out.println("兔子数为："+w);
        }

    public static int bir(int m) {
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < m; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        return arr[m-1];
    }


}
