package com.itheima.method;

public class Demo07Method {
    public static void main(String[] args) {
        int [] arr={99,77,66,55,44,33,11};
        change(arr);
        System.out.println(arr[0]);
    }
    /**
    *定义一个方法，用于将数组中的最大值修改为原值-10
    */
    private static void change(int arr[]){
        int max=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<max){
                max=arr[i];
            }
            arr[i]=max-10;
        }
    }
}

