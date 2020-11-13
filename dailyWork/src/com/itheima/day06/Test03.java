package com.itheima.day06;
/*
    幸福里小区第8栋楼马上就要建成出售，已知8栋共计6层楼，每层的户型设计都是两梯四户。
    现在包工头给了业务员小张一个任务：给8栋每层的每套住宅贴上门牌号。门牌号的设计规则是：楼层+序号。
    例如：6楼的从东到西四户的门牌号分别为： 601，602，603，604。
    请设计程序帮助小张完成上述需求，并将生成好的门牌号存入二维数组，并将数组元素遍历打印到控制台，要求每层
    的门牌号打印到同一行，用空格隔开，效果如下：
    101 102 103 104 201 202 203 204 301 302 303 304 401 402 403 404 501 502 503 504 601 602 603 604
 */

public class Test03 {
    public static void main(String[] args) {
        int [] [] arr=new int[6][4];
        houseNumber(arr);
    }
    public  static void houseNumber(int [] [] arr){
        for (int i = 0; i <arr.length ; i++) {
            int [] floor=arr[i];
            for (int j = 0; j <floor.length ; j++) {
                floor[j]=floor[i-1]*100+floor[j-1];
                System.out.println(floor[i]);
            }
        }

    }

}
