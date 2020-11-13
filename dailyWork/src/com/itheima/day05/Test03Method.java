package com.itheima.day05;

/**
 * 请定义一个方法，实现交换整数数组中两个索引上的元素值。并调用方法，查看运行效果。
 * 例如，数组为{11, 22, 33, 44, 55, 66}，
 * 交换索引1和索引5位置上的元素，结果为{11, 66, 33, 44, 55, 22}
 */
public class Test03Method {
    public static void main(String[] args) {

        array(1, 5);
    }

    public static void array(int a, int b) {
        int[] arr = {11, 22, 33, 44, 55, 66};
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[arr.length - 1] + "}");
            }
            System.out.print(arr[i] + ",");
        }
    }
}
