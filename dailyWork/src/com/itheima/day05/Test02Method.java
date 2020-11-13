package com.itheima.day05;
/**
 请定义一个方法，该方法可以实现求两个整数之中的较大值，并将较大值返回。
  请以重载的方式再定义一个方法，实现求三个整数之中的最大值，并将最大值返回。 在主方法中分别调用这两个方法，测试结果。
 */
public class Test02Method {
    public static void main(String[] args) {
        System.out.println(max(7, 8));
        System.out.println(max(7, 8, 9));
    }
    public static int max(int a,int b){
        if(a>b){
            return a;
        }else {
            return b;
        }
    }
    public static int max(int a,int b,int c){
        int [] arr={a,b,c};
        int max=a;
        for (int i = 1; i <arr.length ; i++) {
            if(a<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
