package com.itheima.method;

public class Demo09Method {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77};
        int[] maxandmin = getMaxAndMin(arr);
        System.out.println(maxandmin[0]);
        System.out.println(maxandmin[1]);
    }

    public static int[] getMaxAndMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int[] maxandmin = {max, min};
        return maxandmin;
    }
}
