package com.itheima.method;
/**
已知奖池数组如：int[] arr={100,500,800,300};
现在要进行抽奖，实现如下效果：
抽到奖金500元
抽到奖金800元
抽到奖金100元
抽到奖金300元
要求：抽奖的顺序随机，一个奖被抽到后，后面就不能再抽到该奖励了，请定义一个方法完成抽功能
 */
public class Demo10Method {
    public static void main(String[] args) {
        int[] arr={100,500,800,300};
        int y=lottery(arr);
        System.out.println("抽到的奖为："+y+"元");
        }

    public static int lottery(int [] arr) {
        int index = (int) (Math.random() * arr.length);
        int num=arr[index];
        return num;
    }

}
